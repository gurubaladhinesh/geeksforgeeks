package com.guru.problems;

public class SortArrayWaveForm {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 6, 3, 2, 20, 100 };
		System.out.println("Input array::");
		ArrayUtil.printArray(arr,0,arr.length-1);
		arr = sortArrayInWaveForm(arr);
		System.out.println("Output array::");
		ArrayUtil.printArray(arr,0,arr.length-1);

	}

	private static int[] sortArrayInWaveForm(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n - 1; i = i + 2) {
			if (arr[i - 1] < arr[i] || arr[i] > arr[i + 1]) {
				int min = 0;
				if (arr[i - 1] < arr[i + 1]) {
					min = i - 1;
				} else {
					min = i + 1;
				}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}

		return arr;
	}
}
