package com.guru.problems;

public class LexiSmallestRotatedSequence {

	public static void main(String[] args) {
		String str = "GEEKSQUIZ";
		System.out.println(
				"Lexicographically smallest rotated sequence::" + getLexicographicallySmallestRotatedSequence(str));

	}

	private static String getLexicographicallySmallestRotatedSequence(String str) {
		int n = str.length();
		String temp = str + str;
		String result = str;
		for (int i = 1; i < n; i++) {
			int lexiRank = result.compareTo(temp.substring(i, n + i));
			if (lexiRank >= 0) {
				result = temp.substring(i, n + i);
			}
		}
		return result;
	}
}