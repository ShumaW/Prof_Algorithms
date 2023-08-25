package org.example;

public class Main {
    public static void main(String[] args) {
        LiftCall call = new LiftCall(2);
        int callingFloor = 5;
        Lift closestElevator = call.findClosestLift(callingFloor);

        System.out.println(call.getLifts());

        if (closestElevator != null) {
            System.out.println("Отправляем лифт " + closestElevator + " на этаж " + callingFloor);
            closestElevator.move(callingFloor);
        } else {
            System.out.println("Нет доступных лифтов.");
        }

    }
}
