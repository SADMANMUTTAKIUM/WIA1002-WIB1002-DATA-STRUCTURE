/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question7;

/**
 *
 * @author sadmanmuttaki
 */
import java.util.Scanner;

public class MarkovMatrix {
    public static boolean isMarkovMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] < 0) return false;

        for (int j = 0; j < m[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < m.length; i++)
                sum += m[i][j];
            if (Math.abs(sum - 1) > 0.0001) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][3];
        System.out.println("Enter a 3x3 matrix: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = input.nextDouble();

        System.out.println(isMarkovMatrix(m) ? "It is a Markov matrix" : "It is NOT a Markov matrix");
    }
}
