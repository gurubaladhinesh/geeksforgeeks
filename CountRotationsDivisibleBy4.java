package com.guru.problems;

public class CountRotationsDivisibleBy4 {

	public static void main(String[] args) {
		String str="43292816";
		System.out.println("Count of Rotations Divisible by 4::"+getCountOfRotationsDivisibleBy4(str));

	}
	
	private static int getCountOfRotationsDivisibleBy4(String str){
		int n = str.length();
		String temp = str + str;
		int count=0;
		for (int i = 0; i < n; i++) {
			int lastTwoDigits = Integer.parseInt(temp.substring(i, n + i))%100;
			if(lastTwoDigits%4==0){//Divisible by 4
				count++;
				System.out.println(temp.substring(i, n + i));
			}
		}
		return count;
	}

}
