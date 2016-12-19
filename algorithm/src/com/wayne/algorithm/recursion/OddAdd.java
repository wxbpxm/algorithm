/**
 * 1+3+5+7...... 或者2+4+6+8。。
 */
package com.wayne.algorithm.recursion;

public class OddAdd {

	public static void main(String[] args) {
		int m = 4;
		System.out.println(oddAdd(m));
	}
	
	public static int oddAdd(int m) {
		if(m == 1 || m == 0) {
			return m;
		} else {
			return m + oddAdd(m-2);
		}
		
	}

}
