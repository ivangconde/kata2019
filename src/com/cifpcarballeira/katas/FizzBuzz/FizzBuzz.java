/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author mosquera
 */
public class FizzBuzz {

    public String getFizzBuzz(int num) {
        if( num%3 == 0 ) return "Fizz";
        if (num==1) return "1";
        else return "2";       
    }
    
}
