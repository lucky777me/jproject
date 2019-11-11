package edu.jcourse.lesson4;

public class Vehicle {
    String name;
    int passengers;
    int tank;
    float fuelPer100km;


    Vehicle() {

    }
// vsegda dobavljat k konctruktoru klass   (default)

    public Vehicle(String name, int passengers, int tank, float fuelPer100km) {
        this.name = name;
        this.passengers = passengers;
        this.tank = tank;
        this.fuelPer100km = fuelPer100km;
    }

    void distance(boolean isHighway) {
        float distance = 0;

    }

    }


