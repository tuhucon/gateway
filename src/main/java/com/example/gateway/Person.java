package com.example.gateway;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    String firstName;
    String lastName;
    int age;
    String address;
    String country;
    String city;
    String wifeFirstName;
    String wifeLastName;
    int wifeAge;
    String wifeAddress;
    String wifeCountry;
    String wifeCity;
}
