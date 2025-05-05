/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokeapi.model;

/**
 *
 * @author LUISHENRIQUEPEDROSOS
 */
public class Joke {

 private String  setup;
private String delivery;  

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public Joke(String setup, String delivery) {
        this.setup = setup;
        this.delivery = delivery;
    }
   
}
