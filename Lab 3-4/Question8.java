/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question8;

/**
 *
 * @author sadmanmuttaki
 */
import java.util.Random;
import java.util.Arrays;

public class ShuffleRows {
    public static void shuffle(int[][] m) {
        Random rand = new Random();
        for (int i = 0; i < m.length; i++) {
            int r = rand.nextInt(m.length);
            int[] temp = m[i];
            m[i] = m[r];
            m[r] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
        shuffle(m);
        for (int[] row : m)
            System.out.println(Arrays.toString(row));
    }
}

