package com.guru.problems;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		System.out.println("Input array::");
		ArrayUtil.printArray(arr,0,arr.length-1);
		arr=ArrayUtil.reverseArray(arr,0,arr.length-1);
		System.out.println("Output array::");
		ArrayUtil.printArray(arr,0,arr.length-1);

	}
}
