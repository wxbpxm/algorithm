/**
 * 求1+2+3+4......
 */
package com.wayne.algorithm.recursion;

public class NaturalNumberSum {

	public static void main(String[] args) {
		int m = 100;
		System.out.println(sum(m));
	}

	public static int sum(int m) {
		if(m == 1) {
			return m;
		} else {
			return m + sum(m-1);
		}
	}
}
