/**
 * 斐波那契数
 * 指的是这样一个数列：1、1、2、3、5、8、13、21、……在数学上
 * 斐波纳契数列以如下被以递归的方法定义：F0=0，F1=1，Fn=Fn-1+Fn-2（n>=2，n∈N*）
 * 用文字来说，就是斐波那契数列列由 0 和 1 开始，之后的斐波那契数列系数就由之前的两数相加。
 * 
 */
package com.wayne.algorithm.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int m = 5;
		System.out.println(fibonacci(m));
	}
	
	
	public static int fibonacci(int n) //n表示第几个数，比如n=5，表示第5个是什么（返回8）
	{
	    int ans;
	    if(n==0||n==1)
	    {
	        ans=1;
	    }
	    else
	    {
	        ans=fibonacci(n-1)+fibonacci(n-2);
	    }
	    return(ans);
	}
}
