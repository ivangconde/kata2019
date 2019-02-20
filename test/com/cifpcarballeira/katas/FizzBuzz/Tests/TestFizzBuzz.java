/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz.Tests;

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mosquera
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }

     @Test
     public void test1devuelve1() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(1);
        assertEquals("1", result);
     }
     
     @Test
     public void test2devuelve2() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(2);
        assertEquals("2", result);
     }
     
     @Test
     public void test3devuelveFizz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(3);
        assertEquals("Fizz", result);
     }
     
     @Test
     public void test5devuelveBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(5);
        assertEquals("Buzz", result);
     }
     
     @Test
     public void testMultiplo3y5devuelveFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(15);
        assertEquals("FizzBuzz", result);
     }
     
     @Test
     public void testcontiene3() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(13);
        assertEquals("Fizz", result);
     }
}
