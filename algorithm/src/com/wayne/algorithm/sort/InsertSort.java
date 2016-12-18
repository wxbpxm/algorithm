/**
 *  直接插入排序
 *  基本思想在要排序的一组数中，假设前面(n-1)[n>=2] 个数已经是排
 *  好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数
 *  也是排好顺序的。如此反复循环，直到全部排好顺序。
 *  
 *  */

package com.wayne.algorithm.sort;

import com.wayne.algorithm.util.OutUtil;

public class InsertSort {
	public static void main(String[] args) {
		  int forSort[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		  insertSort(forSort);
		  OutUtil.printAry(forSort);
	}
	
	public static void insertSort(int [] forSort) {
		int temp = 0;
		for(int i = 1; i<forSort.length; i++) {
			int j = i-1;
			temp = forSort[i];
			
			for(; j>=0 && forSort[j] > temp; j--) {
				forSort[j+1] = forSort[j];
			}
			forSort[j+1] = temp;
		}
	}
}
