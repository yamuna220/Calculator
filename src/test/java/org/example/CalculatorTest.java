package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
    Main main = new Main();
    @Test
    public void addTest(){
        assertEquals(25, main.add(10,15));
    }
    @Test
    public void subTest(){
        assertEquals(5,main.sub(15,10));
    }
    @Test
    public void mulTest(){
        assertEquals(20,main.mul(4,5));
    }
    @Test
    public void divTest(){
        assertEquals(2,main.div(10,5));
    }
    @Test(expected=ArithmeticException.class)
    public void divTestbyzero(){
        main.div(10,0);
    }

}