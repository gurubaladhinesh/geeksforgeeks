package com.guru.problems;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.println("Input array: ");
		ArrayUtil.printArray(arr,0,arr.length-1);
		System.out.println("Output array: ");
		ArrayUtil.printArray(ArrayUtil.rotateArray(arr,0,arr.length-1,4),0,arr.length-1);
		
	}
}
