package car_gen;

public class Lexus extends com.example.car_gen.Car {
    private boolean hasLeatherSeats;

    public Lexus(){
        super("silver", 2020, 220);
    }

    //getter
    public boolean getHasLeatherSeat(){
        return this.hasLeatherSeats;
    }
    //Setter
    public void setHasLeatherSeats(boolean hasLeatherSeats){
        this.hasLeatherSeats = hasLeatherSeats;
    }
}