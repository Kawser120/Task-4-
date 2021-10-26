/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab_task4;

import java.util.Scanner;

/**
 *
 * @author 88017
 */
public class Main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();
        
        System.out.print("Enter a number between 1-100 ");
        
        int num = input.nextInt();
        System.out.print("Enter a number between 1-50: ");
        int k = input.nextInt();
        
        System.out.println("\nSum of Divisor is: " + myCalculator.divisorofSum(num));
        System.out.println("\nThe Factorial is: " + myCalculator.findFactorial(k));

    }
}
