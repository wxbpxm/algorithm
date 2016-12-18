/**
 *  冒泡排序
 *  基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
 *  即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 *  
 *  算法稳定性
 *  冒泡排序就是把小的元素往前调或者把大的元素往后调。比较是相邻的两个元素比较，交换也发生在这两个元素之间。所以，如果两个元素相等，我想你是不会再
 *  无聊地把他们俩交换一下的；如果两个相等的元素没有相邻，那么即使通过前面的两两交换把两个相邻起来，这时候也不会交换，所以相同元素的前后顺序并没有改变，所以冒泡排序是一种稳定排序算法。
 *  
 *  
 *  */

package com.wayne.algorithm.sort;

import com.wayne.algorithm.util.OutUtil;

public class BubbleSort {
	public static void main(String[] args) {
		  int forSort[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		  bubbleSort(forSort);
		  OutUtil.printAry(forSort);
	}
	
	public static void bubbleSort(int [] forSort) {
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
	}
}
