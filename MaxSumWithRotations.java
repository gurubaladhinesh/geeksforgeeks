package com.guru.problems;
/*
 * Given an array, only rotation operation is allowed on array. We can rotate the array as many times as we want. Return the maximum possbile of summation of i*arr[i].
 */
public class MaxSumWithRotations {

	public static void main(String[] args) {
		int[] arr={8, 3, 1, 2};
		System.out.println("Maximum sum: "+getMaxRotationSum(arr));
	}

	private static int getMaxRotationSum(int[] arr){
		int r0 = 0;
		int rj=0;
		int n=arr.length;
		int maxSum=0;
		for(int i=0;i<n;i++){
			r0=r0+arr[i];
			rj=rj+(i*arr[i]);
		}
		for(int j=1;j<n;j++){
			rj=rj+r0-n*arr[n-j];
			maxSum=Math.max(maxSum, rj);
		}
		return maxSum;
	}

}
