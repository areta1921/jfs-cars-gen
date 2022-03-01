package com.example.car_gen;

import car_gen.Honda;

public class Main {
    public static void main(String[] args){
        Honda civic = new com.example.car_gen.Honda();
        com.example.car_gen.Lexus rx350 = new com.example.car_gen.Lexus();
        com.example.car_gen.Toyota supra = new com.example.car_gen.Toyota();

        System.out.println(rx350.getColor());
        System.out.println(civic.getColor());
        System.out.println(supra.getColor());

        System.out.println(civic.accelerateSpeed());
        System.out.println(civic.decelerateSpeed());
        System.out.println(civic.convertToElectric());
    }
}