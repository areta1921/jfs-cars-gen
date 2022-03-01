package car_gen;

public class Car {
    //Instance variable

    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    //constructor
    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;

    }
    //Getter


    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getIsElectric() {
        return this.isElectric;
    }

    //Setter

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setYear(int carYear) {
        this.year = carYear;
    }
    public void setMaxSpeed(int highSpeed){
        this.maxSpeed = highSpeed;
    }
    public void setIsElectric(boolean TF){
        this.isElectric = TF;
    }
    //Accelerate_Speed Method
    public int accelerateSpeed(){
        return speed += 5;
    }

    //Decelerate_speed Method
    public int decelerateSpeed(){
        if (speed >= 5){
            speed -= 5;
        }else{
            speed = speed;
        }
        return speed;
    }
    public boolean convertToElectric(){
        if(isElectric == false){
            isElectric = true;
        }else{
            System.out.println("The car is already Electric");
        }
        return isElectric;
    }

}