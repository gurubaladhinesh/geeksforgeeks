package com.guru.problems;

public class RearrangePositiveNegativeNumbersWithExtraSpace { // -ve +ve

	public static void main(String[] args) {
		int[] arr={12, 11, -13, -5, 6, -7, 5, -3, -6};
		System.out.println("Input array::");
		ArrayUtil.printArray(arr,0,arr.length-1);
		arr=rearrangePositiveNegativeNumbersWithExtraSpace(arr);
		System.out.println("Output array::");
		ArrayUtil.printArray(arr,0,arr.length-1);
	}
	
	private static int[] rearrangePositiveNegativeNumbersWithExtraSpace(int[] arr){ //Order maintained
		int n=arr.length;
		int countPositiveNumbers=0;
		for(int i=0;i<n;i++){
			if(arr[i]>=0){
				countPositiveNumbers++;
			}
		}
		int[] temp=new int[n];
		int left=0,right=countPositiveNumbers;
		for(int i=0;i<n ;i++){
			if(arr[i]<0){
				temp[right]=arr[i];
				right++;
			}else{
				temp[left]=arr[i];
				left++;
			}
		}
		return temp;
	}
}

