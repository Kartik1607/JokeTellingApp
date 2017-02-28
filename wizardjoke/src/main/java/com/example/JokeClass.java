package com.example;

import com.udacity.example.jokes.JokeSmith;

public class JokeClass {
    public String  getJoke(){
        JokeSmith smith = new JokeSmith();
        return smith.tellAHandCraftedJoke();
    }
}
