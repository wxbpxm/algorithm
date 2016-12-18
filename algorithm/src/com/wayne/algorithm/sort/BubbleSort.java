/**
 * 
 *  基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
 *  即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 *  
 *  
 *  
 *  */

package com.wayne.algorithm.sort;

import com.wayne.algorithm.util.OutUtil;

public class BubbleSort {
	public static void main(String[] args) {
		  int forSort[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		  int temp = 0;
		  for(int i = 0; i<forSort.length - 1; i++) {
			  for(int j = 0; j < forSort.length - i -1; j++) {
				  if(forSort[j] > forSort[j+1]) { //前面的大则交互 (如果从大到小排序，这里把>改成<即可
					  temp = forSort[j];
					  forSort[j] = forSort[j+1];
					  forSort[j+1] = temp;
				  }
			  }
		  }
		  
		  OutUtil.printAry(forSort);
		  
	}
}
