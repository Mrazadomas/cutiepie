package org.example;

public class Puppy implements Cutie {

    private String des = "Cute floppy ears";

    private Integer rating = 10;
    
    Puppy() {
        
    }

    public String description() {
        return des;
    }

    public Integer cutenessRating() {
        return rating;
    }
}
