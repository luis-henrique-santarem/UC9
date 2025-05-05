/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokeapi.controller;

import com.mycompany.jokeapi.model.Joke;
import com.mycompany.jokeapi.service.JokeApiService;
import org.json.JSONObject;



/**
 *
 * @author LUISHENRIQUEPEDROSOS
 */
public class JokeController {
    
       public Joke makeAJoke(String category) throws Exception {
        JSONObject json = JokeApiService.jokeApiService(category);

        
        if (json.has("setup") && json.has("delivery")) {
            return new Joke(json.getString("setup"), json.getString("delivery"));
        } else if (json.has("joke")) {
        
            return new Joke(json.getString("joke"), "");
        } else {
            throw new Exception("Formato de piada desconhecido.");
        }
    }

    }
    
