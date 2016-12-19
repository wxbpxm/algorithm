/**
 * 求最大公约数
 */
package com.wayne.algorithm.recursion;

public class MaxDivisor {

	public static void main(String[] args) {
		int m = 100;
		int n = 9;
		System.out.println(gcd(m,n));
	}
	
	public static int gcd(int m, int n) {
		if(n == 0) {
			return m;
		}
		
		return gcd(n, m%n);
	}

}
