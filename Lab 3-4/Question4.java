/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question4;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * WIA1002 Data Structure - Week 3 & 4 Lab
 * Question 4: Remove Duplicates from ArrayList
 *
 * @author Sadman Muttaki
 */

public class MainRemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Input 10 integers
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            list.add(num);
        }

        // Step 2: Remove duplicates while keeping input order
        ArrayList<Integer> distinct = new ArrayList<>();
        for (int n : list) {
            if (!distinct.contains(n)) {
                distinct.add(n);
            }
        }

        // Step 3: Display distinct integers
        System.out.print("The distinct integers are: ");
        for (int n : distinct) {
            System.out.print(n + " ");
        }
        System.out.println();

        input.close();
    }
}
