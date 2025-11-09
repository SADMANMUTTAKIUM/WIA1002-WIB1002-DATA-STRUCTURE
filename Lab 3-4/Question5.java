/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question5;

/**
 *
 * @author sadmanmuttaki
 */
import java.util.Scanner;

public class LocateSmallest {
    public static int[] locateSmallest(double[][] a) {
        int[] index = new int[2];
        double min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] a = new double[4][4];
        System.out.println("Enter a 4x4 matrix:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                a[i][j] = input.nextDouble();

        int[] loc = locateSmallest(a);
        System.out.println("The location of the smallest element is at (" + loc[0] + ", " + loc[1] + ")");
    }
}
