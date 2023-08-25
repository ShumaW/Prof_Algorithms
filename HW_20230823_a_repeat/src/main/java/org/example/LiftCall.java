package org.example;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LiftCall {
    private final List<Lift> lifts;

    public List<Lift> getLifts() {
        return lifts;
    }

    public LiftCall(int numLifts) {
        lifts = new ArrayList<>();
        Faker faker = new Faker();
        Random random = new Random();

        for (int i = 0; i < numLifts; i++) {
            lifts.add(new Lift(faker.funnyName().name(),
                    faker.number().numberBetween(0,6),
                    random.nextBoolean()));
        }
    }

    public Lift findClosestLift(int floorTarget){
        Lift closestLift = null;
        int minDistance = Integer.MAX_VALUE;
        for (Lift lift : lifts) {
            int distance = Math.abs(lift.getCurrentFloor() - floorTarget);
            if (distance < minDistance && !lift.isOccupied()){
                minDistance = distance;
                closestLift = lift;
            }
        }
        return closestLift;
    }
}
