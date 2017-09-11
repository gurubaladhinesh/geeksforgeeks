package com.guru.problems;

//Rearrange  - Positive and negative numbers alternatively
public class RearrangePositiveNegativeNumbers {

	public static void main(String[] args) {
		int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		System.out.println("Input array::");
		ArrayUtil.printArray(arr,0,arr.length-1);
		arr = rearrangeAlternatePositiveNegativeNumbers(arr);
		System.out.println("Output array::");
		ArrayUtil.printArray(arr,0,arr.length-1);
	}

	private static int[] rearrangeAlternatePositiveNegativeNumbers(int[] arr) {
		arr = segregatePositiveNegativeNumbers(arr);
		int n = arr.length;
		int i = 0;
		while (i < n && arr[i] < 0) {
			i++;
		}
		int j = 1;
		while (j < i) {
			if (arr[j] < 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i++] = temp;
			}
			j = j + 2;
		}
		return arr;
	}

	private static int[] segregatePositiveNegativeNumbers(int[] arr) { //order not maintained
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		while (left < right) {
			while (left < right && arr[left] < 0) {
				left++;
			}
			while (left < right && arr[right] > 0) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		return arr;
	}

}
