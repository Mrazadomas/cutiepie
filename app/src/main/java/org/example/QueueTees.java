package org.example;
import java.util.ArrayList;

public class QueueTees {

    private static ArrayList<Cutie> cuties;
    
    QueueTees() {
        cuties = new ArrayList<>(5);
    }

    public static void enqueue(Cutie cutie) {
        if (cuties.size() == 5) {
            System.out.println("Queue is full.");
        } else {
            cuties.add(cutie);
        }
    }

    public static void dequeue() {
        cuties.remove(0);
    }

    public static int size() {
        return cuties.size();
    }

    public static void clear() {
        cuties.clear();
    }

    public static void print() {
        for (int i = 0; i < cuties.size(); i++) {
            System.out.println(cuties.get(i).description());
        }
    }
}
