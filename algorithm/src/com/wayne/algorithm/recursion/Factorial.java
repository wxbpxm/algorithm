/**
 * 求阶乘 1*2*3*4.....
 */
package com.wayne.algorithm.recursion;

public class Factorial {

	public static void main(String[] args) {
		long m = 10;
		System.out.println(factorial(m));
	}
	
	public static long factorial(long m){ 
		if(m == 1) {
			return m;
		} else {
			return m*factorial(m-1); 
		}
	}

}
