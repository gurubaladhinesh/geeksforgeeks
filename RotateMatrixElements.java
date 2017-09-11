package com.guru.problems;

public class RotateMatrixElements {

	public static void main(String[] args) {
		int[][] arr={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		System.out.println("Input matrix::");
		ArrayUtil.printMatrix(arr);
		arr=rotateMatrixElements(arr);
		System.out.println("Output matrix::");
		ArrayUtil.printMatrix(arr);
	}
	
	private static int[][] rotateMatrixElements(int[][] arr){
		int mid = (int)Math.ceil((double)arr.length/2);
		System.out.println("MId:"+mid);
		for(int k=0;k<mid;k++){
		int i=k,j=k;
		int m=arr.length-k;
		int n =arr[i].length-k;
		int prevElement = Integer.MIN_VALUE;
		while(j<n){
			int temp=arr[i][j];
			if(prevElement!=Integer.MIN_VALUE){
				arr[i][j]=prevElement;
				prevElement=temp;
			}
			prevElement=temp;
			j++;
		}
		j--;
		i++;
		while(i<m){
			int temp=arr[i][j];
			if(prevElement!=Integer.MIN_VALUE){
				arr[i][j]=prevElement;
				prevElement=temp;
			}
			prevElement=temp;
			i++;
		}
		i--;
		j--;
		while(j>=0){
			int temp=arr[i][j];
			if(prevElement!=Integer.MIN_VALUE){
				arr[i][j]=prevElement;
				prevElement=temp;
			}
			prevElement=temp;
			j--;
		}
		j++;
		i--;
		while(i>=0){
			int temp=arr[i][j];
			if(prevElement!=Integer.MIN_VALUE){
				arr[i][j]=prevElement;
				prevElement=temp;
			}
			prevElement=temp;
			i--;
		}
	}
		return arr;
		
	}

}
