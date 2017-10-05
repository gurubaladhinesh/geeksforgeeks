package com.guru.problems;

import java.util.HashMap;

public class LargestSubarrayEqual0sAnd1s {

	public static void main(String[] args) {
		int[] arr = {1,1,0,1,0,1,1};
		System.out.println("Input array::");
		ArrayUtil.printArray(arr, 0, arr.length - 1);
		printLargestSubarrayWithEqual0sAnd1s(arr);

	}
	
	private static void printLargestSubarrayWithEqual0sAnd1s(int[] arr){
		int n=arr.length;
		HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
		int currSum=0;
		int maxLength=0;
		int maxStart=0;
		int maxEnd=-0;
		for(int i=0;i<n;i++){
			int iThElement = arr[i]==0?-1:arr[i];
			currSum+=iThElement;
			if(currSum==0){
				maxLength=i+1;
				maxStart=0;
				maxEnd=i;
			}
			else{
				if(hMap.containsKey(currSum)){
					if((hMap.get(currSum)+1)>0){
						if((i-hMap.get(currSum))>maxLength){
							maxLength=i-hMap.get(currSum);
							maxStart=hMap.get(currSum)+1;
							maxEnd=i;
						}
					}
				}
				else{
					hMap.put(currSum, i);
				}
			}
		}
		if(maxLength>0){
			System.out.println("Largest subarray with equal number of 0s and 1s::");
			ArrayUtil.printArray(arr, maxStart, maxEnd);
			System.out.println("Subarray length::"+maxLength);
		}
		else{
			System.out.println("No subarray with equal number of 0s and 1s found");
		}
		
	}
}