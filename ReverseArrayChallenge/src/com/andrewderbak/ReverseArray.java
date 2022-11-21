package com.andrewderbak;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array){
        int pointer = array.length-1;
        for (int i = 0; i < (pointer+1)/2; i++){
                int temp = array[pointer];
                array[pointer] = array[i];
                array[i] = temp;
                pointer--;
            }
    }
}
