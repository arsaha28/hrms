package com.hrms.module;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.setFirstName("Arnab");
        actor.setLastName("Saha");
        System.out.println(new Gson().toJson(actor));
    }
}
