/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab_task4;

/**
 *
 * @author 88017
 */
import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{
    
    @Override
    public int divisorofSum(int n) {

        int total = 0;
        
        System.out.println("Divisors of " + n + " = ");
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                
                total += i;
                
                System.out.print(i + " ");
            }
        }
        return total;

    }
    
    @Override
    public BigInteger findFactorial(int n) {

        BigInteger fact = BigInteger.ONE;
        
        for (int i = 1; i <= n; i++) {
            
            fact = fact.multiply(BigInteger.valueOf(i));
            
        }
        return fact;
    }
}
