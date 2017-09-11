package com.guru.problems;

import java.lang.reflect.Array;

public class RearrangePositiveNegativeNumbersNoExtraSpace {

	public static void main(String[] args) {
		int[] arr = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
		System.out.println("Input array::");
		ArrayUtil.printArray(arr, 0, arr.length - 1);
		arr = rearrangePositiveNegativeNumbersNoExtraSpace(arr, 0, arr.length - 1);
		System.out.println("Output array::");
		ArrayUtil.printArray(arr, 0, arr.length - 1);
	}

	private static int[] rearrangePositiveNegativeNumbersNoExtraSpace(int[] arr, int left, int right) { // Order
																										// maintained
		System.out.println("Left::"+left);
		System.out.println("Right::"+right);
		if (left < right) {
			int mid = (left + right) / 2;
			System.out.println("Mid element::"+arr[mid]);
			arr = rearrangePositiveNegativeNumbersNoExtraSpace(arr, left, mid);
			arr = rearrangePositiveNegativeNumbersNoExtraSpace(arr, mid + 1, right);
			arr =merge(arr, left, mid, right);
		}
		return arr;
	}

	private static int[] merge(int[] arr, int left, int mid, int right) {
		System.out.println("Inside merge::Left array::");
		ArrayUtil.printArray(arr, left, mid);
		System.out.println("Inside merge::Right array::");
		ArrayUtil.printArray(arr, mid + 1, right);

		int i = left;
		int j = mid + 1;
		while (i <= mid && arr[i] < 0) {
			i++;
		}
		while (j <= right && arr[j] < 0) {
			j++;
		}
		System.out.println("I::"+i);
		System.out.println("J::"+j);
		//arr=ArrayUtil.rotateArray(arr, i, j-1, j-1-(mid+1));
		arr = ArrayUtil.reverseArray(arr, i, mid);
		arr = ArrayUtil.reverseArray(arr, mid + 1, j - 1);
		arr = ArrayUtil.reverseArray(arr, i, j - 1);
		System.out.println("After merge::");
		ArrayUtil.printArray(arr, 0, arr.length-1);
		return arr;

	}

}
