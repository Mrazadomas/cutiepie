package org.example;

public class QueueTees {

    private static Cutie[] cuties;
    
    QueueTees() {
        cuties = new Cutie[5];
    }

    public static int size() {
        int count = 0;
        for (int i = 0; i < cuties.length; i++) {
                if (cuties[i] != null) {
                    count++;
                }
        }
        return count;
    }

    public static void enqueue(Cutie cutie) {
        int count = 0;
        for (int i = 0; i < cuties.length; i++) {
                if (cuties[i] != null) {
                    count++;
                }
        }
        if (count >= 5) {
            System.out.println("Queue is full.");
        } else {
            for (int i = 0; i < cuties.length; i++) {
                if (cuties[i] == null) {
                    cuties[i] = cutie;
                    break;
                }
            }
        }
    }

    public static void dequeue() {
        for (int i = 0; i < cuties.length; i++) {
                if (cuties[i] != null) {
                    cuties[i] = null;
                    break;
                }
            } 
    }

    public static void clear() {
        for (int i = 0; i < cuties.length; i++) {
                cuties[i] = null;
        }
    }

    public static void print() {
        for (int i = 0; i < cuties.length; i++) {
            if (cuties[i] != null) {
                System.out.println(cuties[i].description());
            }
            
        }
    }
}
