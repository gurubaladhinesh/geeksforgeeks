package com.guru.problems;

public class SearchSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr={6,7,8,1,2,3,4,5};
		System.out.println("Output index: "+findElement(arr, 5, 0, arr.length-1));

	}
	
	private static int findElement(int[] arr, int e,int l, int r){
		if(l>r)
			return -1;
		int mid = (l+r)/2;
		if(arr[mid]==e){
			return mid;
		}
		else if((arr[l] <arr[mid] && e < arr[mid]) || ( arr[l] > arr[mid] && e >= arr[l])){
			return findElement(arr,e,l,mid-1);
		}else{
			return findElement(arr,e,mid+1,r);
		}
	}

}
