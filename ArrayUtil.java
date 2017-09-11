package com.guru.problems;

public class ArrayUtil {
	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void printArray(int[] arr,int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static int[] reverseArray(int[] arr,int start,int end){
		for(int left=start,right=end;left<=right;left++,right--){
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}
		return arr;
	}
	
	public static int[] rotateArray(int[] arr,int start, int end, int d){
		int n= end-start+1;
		for(int i=start;i<gcd(d,n);i++){
			int temp=arr[i];
			int j=i;
			while(true){
				int k=j+d;
				if(k>=n)
					k=k-n;
				if(k==i)
					break;
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;
		}
		return arr;
	}
	
	private static int gcd(int a, int b){
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
}
