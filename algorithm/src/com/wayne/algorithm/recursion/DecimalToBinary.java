/**
 * 十进制变二级制
 */
package com.wayne.algorithm.recursion;

public class DecimalToBinary {

	public static void main(String[] args) {
		int m = 1024;
		System.out.println(decimalToBinary(m));
	}

	public static String decimalToBinary(int num) {
		if (num == 0) { // 当num=0时，循环结束
			return "";
		} else {
			return decimalToBinary(num / 2) + (num % 2)+""; // 调用递归方法
		}
	}
}
