package com.example.gateway;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class HttpClientService {
    private HttpClient httpClient;
    private ObjectMapper objectMapper;

    public HttpClientService() {
        httpClient = HttpClient.newHttpClient();
        objectMapper = new ObjectMapper();
    }

    public Person getHellox() throws IOException, InterruptedException {
        var req = HttpRequest.newBuilder(URI.create("http://localhost:9090/hellox")).GET().build();
        var response = httpClient.send(req, HttpResponse.BodyHandlers.ofInputStream());
        return objectMapper.readValue(response.body(), Person.class);
    }
}
