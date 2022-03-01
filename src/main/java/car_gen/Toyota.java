package com.example.car_gen;

import car_gen.Car;

public class Toyota extends Car {
    private boolean greatGasMilage;
    public Toyota(){
        super("lemon green",2019, 180);
    }

    //Getter
    public boolean getGreatGasMilage(){
        return this.greatGasMilage;
    }
    //Setter
    public void setGreatGasMilage(boolean greatGasMilage){
        this.greatGasMilage = greatGasMilage;
    }
}