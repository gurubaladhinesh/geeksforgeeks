package com.guru.problems;

public class RotateMatrix90Degrees {

	public static void main(String[] args) {
		int[][] arr={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println("Input matrix:");
		ArrayUtil.printMatrix(arr);
		arr = getRotatedMatrix(arr);
		System.out.println("Output matrix:");
		ArrayUtil.printMatrix(arr);
	}
	
	private static int[][] getRotatedMatrix(int[][] arr){ //Anti-clockwise 90 degrees
		for(int i=0;i<arr.length;i++){ //Transpose
			for(int j=i+1;j<arr[i].length;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		int i=0;
		int j=arr[i].length-1;
		
		while(i<j){ //Swap rowsß
			int[] temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	
	

}




