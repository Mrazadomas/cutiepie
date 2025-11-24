package org.example;

public class PygmyMarmoset implements Cutie {
    
    private String des = "Nice and rotund";

    private Integer rating = 10;
    
    PygmyMarmoset() {
        
    }

    public String description() {
        return des;
    }

    public Integer cutenessRating() {
        return rating;
    }
}
