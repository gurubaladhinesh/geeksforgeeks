package com.guru.problems;

public class MaxSumNonAdjacent {

	public static void main(String[] args) {
		int[] arr={5, 5, 10, 100, 10, 5};
		System.out.println("Maximum sum: "+getMaxSumNonAdjacent(arr));
	}
	private static int getMaxSumNonAdjacent(int[] arr){
		int incl=arr[0];
		int excl=0;
		for(int i=1;i<arr.length;i++){
			int max=Math.max(incl, excl);
			incl = excl+arr[i];
			excl=max;
		}
		return Math.max(incl, excl);
	}
}
