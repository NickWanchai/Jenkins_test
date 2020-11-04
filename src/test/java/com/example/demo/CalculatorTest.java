package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }


    @Test
    void add() {
        assertEquals(10,c.add(5,5));
    }

    @Test
    void sub() {
        assertEquals(10,c.sub(30,20));
    }

    @Test
    void multiply() {
        assertEquals(50,c.multiply(5,10));
    }

    @Test
    void divide() {
        assertEquals(10,c.divide(100,10));
    }

    @Test
    void modulus() {
        assertEquals(0,c.modulus(10,2));
    }



    @Test
    void calculate() {
        assertEquals(10, c.add(5, 5));
        assertEquals(10, c.sub(30, 20));
        assertEquals(50, c.multiply(5, 10));
        assertEquals(10, c.divide(100, 10));
        assertEquals(0, c.modulus(10, 2));
    }
}