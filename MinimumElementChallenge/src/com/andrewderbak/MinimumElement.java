package com.andrewderbak;

import java.util.Scanner;

public class MinimumElement {

    static private Scanner in = new Scanner((System.in));

    public static void main(String[] args) {

        System.out.println("How many numbers?");
        int[] minArray = readIntegers(in.nextInt());
        int min = findMin(minArray);
        System.out.println(min);

    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Please enter in your numbers:");
        for (int i = 0; i < count; i++) {
            array[i] = in.nextInt();
            }
        return array;
       }

       public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<array.length; i++){
            if (array[i]<min) min = array[i];
        }
        return min;
       }
}

