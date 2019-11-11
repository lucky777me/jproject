package edu.jcourse.lesson4;

public class Main {
    public static void main(String[] args) {


            Vehicle miniVan = new Vehicle();
            miniVan.passengers = 7;
            miniVan.tank = 78;
            miniVan.fuelPer100km = 8.5F;;
            miniVan.name = "Mini Van";
            miniVan.distance( true);


            Vehicle sportcar = new Vehicle();

            sportcar.passengers = 2;
            sportcar.tank = 50;
            sportcar.fuelPer100km = 18.5F;
            sportcar.name = "Sportcar";
            sportcar.distance( false);
        System.out.println("sportcar:" + sportcar.passengers + "" + sportcar.tank + "" + sportcar.fuelPer100km);
    }
    }

