/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question6;

/**
 *
 * @author sadmanmuttaki
 */
import java.util.Scanner;

public class AddMatrix {
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                c[i][j] = a[i][j] + b[i][j];
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] a = new double[2][2];
        double[][] b = new double[2][2];
        System.out.println("Enter matrix a (2x2): ");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = input.nextDouble();

        System.out.println("Enter matrix b (2x2): ");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = input.nextDouble();

        double[][] c = addMatrix(a, b);
        System.out.println("Sum of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
