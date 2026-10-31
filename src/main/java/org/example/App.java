package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public final class App {
    private static final String NAME = "Kyrylo";
    private static final String LAST_NAME = "Ostashko";

    private App() {
    }

    public static void main(String[] args) {
        JsonObject person = new JsonObject();
        person.addProperty("name", NAME);
        person.addProperty("lastName", LAST_NAME);

        Gson gson = new Gson();
        System.out.println(gson.toJson(person));
    }
}
