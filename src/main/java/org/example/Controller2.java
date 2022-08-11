package org.example;

import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;

@Model
public class Controller2 {


    @Model
    @Produces
    public String nombre() {
        return "feliciano";
    }
}
