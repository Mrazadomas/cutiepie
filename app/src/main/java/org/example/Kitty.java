package org.example;

public class Kitty implements Cutie {
    
    private String des = "Funny and mischevious";

    private Integer rating = 10;
    
    Kitty() {
        
    }

    public String description() {
        return des;
    }

    public Integer cutenessRating() {
        return rating;
    }
}
