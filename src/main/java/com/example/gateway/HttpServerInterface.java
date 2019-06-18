package com.example.gateway;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface HttpServerInterface {
    @GET("/hellox")
    Call<Person> hellox();

    @POST("/helloy")
    Call<Person> helloy(@Body Person person);
}
