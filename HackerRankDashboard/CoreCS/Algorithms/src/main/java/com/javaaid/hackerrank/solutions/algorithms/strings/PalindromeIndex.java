/**
 * 
 * Problem Statement-
 * [PalindromeIndex](https://www.hackerrank.com/challenges/palindrome-index/problem)
 * [Tutorial](https://youtu.be/U_5l038GR5I)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

public class PalindromeIndex {

	static int palindromeIndex(String s) {
		int l = s.length();
		int i, j, a, b;
		for (i = 0, j = l - 1; i < l; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				break;
		}
		if (i > j)
			return -1;

		for (a = i + 1, b = j; a < j && b > i + 1; a++, b--) {
			if (s.charAt(a) != s.charAt(b))
				return j;
		}
		return i;
	}

	public static boolean isValidPalindrome(String str) {
		int len = str.length();

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			String s = in.next();
			int result = palindromeIndex(s);
			System.out.println(result);

		}
		in.close();
	}

}
