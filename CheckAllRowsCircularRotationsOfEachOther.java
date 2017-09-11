package com.guru.problems;

public class CheckAllRowsCircularRotationsOfEachOther {

	public static void main(String[] args) {
		int[][] arr={
			{1,2,3},
			{3,2,1},
			{1,3,2}
		};
		System.out.println("Are all rows circular rotations of each other::"+checkIfRowsAreCircularRotationsOfEachOther(arr));
	}
	
	private static boolean checkIfRowsAreCircularRotationsOfEachOther(int[][] arr){
		String firstRow= getStringOfRow(arr, 0);
		String temp = firstRow+firstRow;
		for(int i=1;i<arr.length;i++){
			String ithRow = getStringOfRow(arr, i);
			if(temp.indexOf(ithRow)<0){
				return false;
			}
		}
		return true;
	}
	
	private static String getStringOfRow(int[][] arr, int rowIndex){
		String str="";
		for(int i=0;i<arr[rowIndex].length;i++){
			str=str+arr[rowIndex][i];
		}
		return str;
	}

}

/*
 * {1, 2, 3, 4},
   {10, 11, 12, 5},
  {9, 8, 7, 6}}
  
  1 10 9
  2 11 8 
  3 12 7
  4 5  6
 * 
 */
