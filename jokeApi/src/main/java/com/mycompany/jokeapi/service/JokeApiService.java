/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokeapi.service;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/**
 *
 * @author LUISHENRIQUEPEDROSOS
 */
public class JokeApiService {
     public static JSONObject jokeApiService(String category) throws Exception {
        OkHttpClient client = new OkHttpClient();

        String url = "https://v2.jokeapi.dev/joke/" + category + "?format=json";

        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new Exception("Erro ao buscar piada: " + response);
            }

            String jsonData = response.body().string();
            return new JSONObject(jsonData);
        }
    }
}
      
         
     

