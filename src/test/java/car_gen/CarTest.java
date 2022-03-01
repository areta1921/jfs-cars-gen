package com.example.car_gen;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CarTest {
    @Test
    public void testAccelerateSpeed(){
        Assert.assertEquals(5,civic.accelerateSpeed());
    }
    com.example.car_gen.Honda civic = new com.example.car_gen.Honda();


    public void testDeclerateSpeed(){
        Assert.assertEquals(0,civic.accelerateSpeed());
    }

}