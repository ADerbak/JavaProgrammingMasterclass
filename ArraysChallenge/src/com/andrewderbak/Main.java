package com.andrewderbak;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Create a program using arrays that sorts a list of integers in descending order.
		// Descending order is highest value to lowest.
		// Set up the program so that the numbers to sort are read in from the keyboard.
		// Implement the following methods - getIntegers, printArray, and sortIntegers.
		// getIntegers - return an array of entered integers from keyboard.
		// printArray - prints out the contents of the array.
		// sortIntegers - should sort the array and return a new array.
//		
//		int[] intArray = getIntegers(5);
//		printArray(intArray);
//		int[] sortedArray = sortIntegers(intArray);
//		printArray(sortedArray);
		
		
	}
	
	public static int[] getIntegers(int capacity) {
		
		int[] ints = new int[capacity];
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter in "+ capacity + " numbers.\n");
			
			for (int i = 0; i<ints.length; i++) {
				ints[i] = in.nextInt();
			}
		}
		return ints;	
	}
	
	public static void printArray(int[] arr) {
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i<arr.length; i++) {
			System.out.println("Element "+ i + " is "+ arr[i]);
		}
		
	}
	
	
	public static int[] sortIntegers(int[] arr) {
		
		int[] newInts = new int[arr.length];
		for(int i = 0; i<newInts.length; i++) {
			newInts[i] = arr[i];
		}
	
//		int max = 0;
//		int currMax = 0;
		boolean flag = true;
		int temp;
		
		while (flag) {
			flag = false;
			for (int i = 0; i<newInts.length-1; i++) {
				if (newInts[i] < newInts[i+1]) {
					temp = newInts[i];
					newInts[i] = newInts[i+1];
					newInts[i+1] = temp;
					flag = true;
				}
			}
				
		}
		
//		for(int i = 0; i<newInts.length; i++) {
//			
//			
//			for (int j=0; j<arr.length; j++) {
//				
//				if (arr[j]>currMax && arr[j] > max) {
//					max = arr[j];
//					currMax = arr[j];
//					
//				} else {// if (arr[j] < max && arr[j] > currMax) {
//					currMax = arr[j];
////				} else {
////					currMax = arr[j];
//				}
//				}
//			newInts[i]=currMax ; 
//			}
		
//		newInts = Arrays.sort(arr);
		
		return newInts;
		
	}

}
