package com.example.gateway;

import com.example.grpc.server.service.HelloServiceGrpc;
import com.example.grpc.server.service.HelloServiceGrpc.HelloServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tensorflow.serving.PredictionServiceGrpc;

@SpringBootApplication
public class GatewayApplication {

    @Bean
    public ManagedChannel getManagedChannel() {
        return ManagedChannelBuilder
                .forAddress("127.0.0.1", 8500)
                .usePlaintext()
                .build();
    }

    @Bean
    public HelloServiceBlockingStub getHelloBlockingStub(ManagedChannel channel) {
        return HelloServiceGrpc.newBlockingStub(channel);
    }

    @Bean
    public PredictionServiceGrpc.PredictionServiceBlockingStub getPredictionServiceBlockingStub(ManagedChannel channel) {
        return PredictionServiceGrpc.newBlockingStub(channel);
    }
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
