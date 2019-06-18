package com.example.gateway;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

@Service
public class HttpServerService {
    private HttpServerInterface httpServer;

    public HttpServerService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:9090")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        httpServer = retrofit.create(HttpServerInterface.class);
    }

    public Person hellox() throws IOException {
        return httpServer.hellox().execute().body();
    }

    public Person helloy(Person p) throws IOException {
        return httpServer.helloy(p).execute().body();
    }
}
