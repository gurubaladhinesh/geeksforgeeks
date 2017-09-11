package com.guru.problems;

public class SumPairSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr={2,3,4,5,1};
		printPair(arr,7);
	}

	private static void printPair(int[] arr, int sum) {
		int maxIndex = getPivot(arr,0,arr.length-1);
		int minIndex = maxIndex+1;
		int n=arr.length;
		
		while(minIndex!=maxIndex){
			if((arr[minIndex]+arr[maxIndex])>sum){
				maxIndex = (maxIndex+n-1)%n;
			}else if((arr[minIndex]+arr[maxIndex])<sum){
				minIndex = (minIndex+1)%n;
			}else{
				System.out.println("Sum pairs: "+arr[minIndex]+" , "+arr[maxIndex]);
				return;
			}
		}
	}
	// 4 5 1 2 3

	private static int getPivot(int[] arr, int l, int r) {
		if (l > r){
			return -1;
		}
		int mid = (l + r) / 2;
		if ((r - l) > 1 && arr[mid] > arr[mid + 1]) {
			return mid;
		}
		if (arr[l] > arr[mid])
			return getPivot(arr, l, mid);
		else
			return getPivot(arr, mid, r);
	}
}
