package com.example.gateway;

import com.example.grpc.server.service.HelloServiceGrpc;
import com.example.grpc.server.service.HelloServiceGrpc.HelloServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    @Bean
    public ManagedChannel getManagedChannel() {
        return ManagedChannelBuilder
                .forAddress("localhost", 6565)
                .usePlaintext()
                .build();
    }

    @Bean
    public HelloServiceBlockingStub getHelloBlockingStub(ManagedChannel channel) {
        return HelloServiceGrpc.newBlockingStub(channel);
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
