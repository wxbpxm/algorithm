/**
 * 希尔排序（最小增量排序）
 * 基本思想：算法先将要排序的一组数按某个增量d（n/2,n为要排序数的个数）分成若干组，
 * 每组中记录的下标相差d.对每组中全部元素进行直接插入排序，然后再用一个较小的增量（d/2）对它进行分组，
 * 在每组中再进行直接插入排序。当增量减到1时，进行直接插入排序后，排序完成。
 *  
 *  */

package com.wayne.algorithm.sort;

import com.wayne.algorithm.util.OutUtil;

public class ShellSort {
	public static void main(String[] args) {
		  int forSort[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		  shellSort(forSort);
		  OutUtil.printAry(forSort);
	}
	
	public static void shellSort(int [] forSort) {
		 double d1 = forSort.length;
		 int temp = 0;
		 while(true) {
			 d1 = Math.ceil(d1/2);
			 int d = (int)d1;
			 for(int x = 0; x < d; x++) {
				 for(int i = x + d; i< forSort.length; i+= d) {
					 int j = i -d;
					 temp = forSort[i];
					 for(; j>=0 && temp < forSort[j]; j-= d) {
						 forSort[j+d] = forSort[j];
					 }
					 
					 forSort[j+d] = temp;
				 }
			 }
			 
			 if(d == 1) {
				 break;
			 }
		 }
	}
}
