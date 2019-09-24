package com.example.gateway;

import com.example.grpc.server.message.Person;
import com.example.grpc.server.service.HelloServiceGrpc;
import com.example.grpc.server.service.HelloServiceGrpc.HelloServiceBlockingStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;
import io.grpc.ManagedChannel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tensorflow.framework.DataType;
import org.tensorflow.framework.TensorProto;
import org.tensorflow.framework.TensorShapeProto;
import tensorflow.serving.Model;
import tensorflow.serving.Predict;
import tensorflow.serving.PredictionServiceGrpc;

import java.io.IOException;
import java.util.Random;

@RestController
@AllArgsConstructor
public class HelloController {

    private HelloServiceBlockingStub helloBlockingStub;
    private PredictionServiceGrpc.PredictionServiceBlockingStub predictionServiceBlockingStub;
    private ManagedChannel channel;
    private HttpServerService httpServerService;
    private HttpClientService httpClientService;
    private ObjectMapper objectMapper;


    @GetMapping("/hellox-http2")
    public String helloxHttp2() throws IOException, InterruptedException {
        return httpClientService.getHellox().firstName;
    }

    @GetMapping("/hellox-http")
    public String helloxHttp() throws IOException {
        return httpServerService.hellox().firstName;
    }

    @GetMapping("/helloy-http")
    public String helloyHttp() throws IOException {
        return httpServerService.helloy(createPerson()).firstName;
    }

    @GetMapping("/hellox")
    public String hellox() throws JsonProcessingException {

        // create a modelspec
        Model.ModelSpec.Builder modelSpecBuilder = Model.ModelSpec.newBuilder();
        modelSpecBuilder.setName("matching");
        modelSpecBuilder.setVersion(Int64Value.of(1L));
        modelSpecBuilder.setSignatureName("predict");

        Predict.PredictRequest.Builder builder = Predict.PredictRequest.newBuilder();
        builder.setModelSpec(modelSpecBuilder);

        // create the TensorProto and request
        String modelInput = "some text input to make prediction with";

        TensorProto.Builder tensorProtoBuilder = TensorProto.newBuilder();

        // define shape
        TensorShapeProto.Builder tensorShapeBuilder = TensorShapeProto.newBuilder();
        tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(1)); //so luong phan tu trong chieu 1
        tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(224)); //so luong phan tu trong chieu 2
        tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(224)); //so luong phan tu trong chieu 3
        tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(3)); //so luong phan tu trong chieu 4

        tensorProtoBuilder.setTensorShape(tensorShapeBuilder.build());
        for (int i = 0; i < 150_527; i++) {
            tensorProtoBuilder.addFloatVal(0.0f);
        }
        Random ran = new Random();
        tensorProtoBuilder.addFloatVal(ran.nextFloat());
//        for (int i = 0; i < 150_528; i++) {
//            tensorProtoBuilder.addFloatVal(1.0f);
//        }
        tensorProtoBuilder.setDtype(DataType.DT_FLOAT);

        builder.putInputs("inputs", tensorProtoBuilder.build());

        Predict.PredictRequest pr = builder.build();
        Predict.PredictResponse res = predictionServiceBlockingStub.predict(pr);
        return objectMapper.writeValueAsString("tuhucon");

//        return helloBlockingStub.hellox(Empty.getDefaultInstance()).getFirstName();
    }

    @GetMapping("helloy")
    public String helloy() {
        return helloBlockingStub.helloy(newPerson()).getFirstName();
    }

    @GetMapping("/hellox-new")
    public String helloxNew() {
        HelloServiceBlockingStub blockingStub = HelloServiceGrpc.newBlockingStub(channel);
        return blockingStub.hellox(Empty.getDefaultInstance()).getFirstName();
    }

    @GetMapping("/helloy-new")
    public String helloyNew() {
        HelloServiceBlockingStub blockingStub = HelloServiceGrpc.newBlockingStub(channel);
        return blockingStub.helloy(newPerson()).getFirstName();
    }

    private com.example.gateway.Person createPerson() {
        return com.example.gateway.Person.builder()
                .firstName("bim")
                .lastName("bip")
                .age(40)
                .address("hung yen viet nam")
                .city("hung yen")
                .country("viet nam")
                .wifeFirstName("da")
                .wifeLastName("da")
                .wifeAge(36)
                .wifeAddress("hung yen viet nam")
                .wifeCity("hung yen")
                .wifeCountry("viet name")
                .build();
    }

    private Person newPerson() {
        return Person.newBuilder()
                .setFirstName("bim")
                .setLastName("bip")
                .setAge(40)
                .setAddress("hung yen viet nam")
                .setCity("hung yen")
                .setCountry("viet nam")
                .setWifeFirstName("da")
                .setWifeLastName("da")
                .setWifeAge(36)
                .setWifeAddress("hung yen viet nam")
                .setWifeCity("hung yen")
                .setWifeCountry("viet name")
                .build();
    }
}
