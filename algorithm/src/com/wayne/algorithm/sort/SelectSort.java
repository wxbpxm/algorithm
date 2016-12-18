/**
 *  简单选择排序
 *  基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 *  然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 *  
 *  */

package com.wayne.algorithm.sort;

import com.wayne.algorithm.util.OutUtil;

public class SelectSort {
	public static void main(String[] args) {
		  int forSort[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		  selectSort(forSort);
		  OutUtil.printAry(forSort);
	}
	
	public static void selectSort(int [] forSort) {
		 int position = 0;
		  for(int i = 0; i<forSort.length; i++) {
			  int j = i + 1;
			  position = i;
			  int temp = forSort[i];  
			  for(; j < forSort.length; j++) {
				  if(forSort[j] < temp) {
					  temp = forSort[j];
					  position = j;
				  }
			  }
			  
			  forSort[position] = forSort[i];
			  forSort[i] = temp;
		  }
	}
}
