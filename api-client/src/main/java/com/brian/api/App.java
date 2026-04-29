package com.brian.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;

public class App {
    public static void main(String[] args) throws Exception {

        // 1. HTTP client
        HttpClient client = HttpClient.newHttpClient();

        // 2. Request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/1"))
                .GET()
                .build();

        // 3. Send request
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        // 4. Get JSON string
        String json = response.body();

        // 5. Jackson mapper
        ObjectMapper mapper = new ObjectMapper();

        // 6. IMPORTANT FIX: ignore unknown fields like "address"
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // 7. Convert JSON → Java object
        User user = mapper.readValue(json, User.class);

        // 8. Print results
        System.out.println("ID: " + user.id);
        System.out.println("Name: " + user.name);
        System.out.println("Username: " + user.username);
        System.out.println("Email: " + user.email);
    }
}
