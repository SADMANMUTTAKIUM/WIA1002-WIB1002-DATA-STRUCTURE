/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question3;

/**
 *
 * @author sadmanmuttaki
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * WIA1002 Data Structure - Week 3 & 4 Lab
 * Question 3: Sum of Five Numbers using ArrayList
 * 
 * Prompts the user to enter five integers, stores them in an ArrayList,
 * and then calculates and displays their total sum.
 * 
 * @author Sadman Muttaki
 */

public class MainSumFiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            numbers.add(num);
        }

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        System.out.println("The numbers you entered are: " + numbers);
        System.out.println("Sum = " + sum);

        input.close();
    }
}
