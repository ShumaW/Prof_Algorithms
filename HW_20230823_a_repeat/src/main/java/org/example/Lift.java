package org.example;

public class Lift {

    private String name;
    private int currentFloor;

    private boolean isOccupied;


    public Lift(String name, int currentFloor, boolean isOccupied) {
        this.name = name;
        this.currentFloor = currentFloor;
        this.isOccupied = isOccupied;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void mooveToFloor(int targetFloor){
        currentFloor = targetFloor;
    }

    public void move(int targetFloor) {
        currentFloor = targetFloor;
    }

    @Override
    public String toString() {
        return "Lift: " + name  +
                ", currentFloor: " + currentFloor +
                ", isOccupied: " + isOccupied;
    }
}
