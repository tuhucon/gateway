package com.example.gateway;

import com.example.grpc.server.message.Person;
import com.example.grpc.server.service.HelloServiceGrpc;
import com.example.grpc.server.service.HelloServiceGrpc.HelloServiceBlockingStub;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {

    private HelloServiceBlockingStub helloBlockingStub;
    private ManagedChannel channel;

    @GetMapping("/hellox")
    public String hellox() {
        return helloBlockingStub.hellox(Empty.getDefaultInstance()).getFirstName();
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
