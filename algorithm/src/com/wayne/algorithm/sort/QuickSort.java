/**
 * 快速排序
 * 思想：从待排序记录序列中选取一个记录(通常选取第一个记录)为枢轴其关键字设为k1，然后将其余关键字小于k1的记录移到前面去，而将关键字大于k1的记录移到后面，
 * 结果将待排序序列分成了两个子表最后将关键字为k1的记录查到其分界线的位置处.
 * 算法步骤：
 * 假设待划分序列为r[left],r[left+1],.......r[right],具体实现上述划分过程时，可以设两个指针i和j，他们的初值分别为left,right.首先将基准记录r[left]移至变量x中，
 * 是r[left]，即r[i]相当于空单元，然后反复进行如下两个扫描过程，直到i和j相遇
 *（1）j从右向左扫描，直到r[j].key 
 *（2）i从左向后扫描，直到r[i].key>x.key时，将r[i]移至空单元r[j],此时r[i]相当于空单元。
 * 当i和j相遇时，r[i](或r[j])相当与空单元，且r[i]左边所有记录的关键字均不大于基准记录的关键字，而r[i]右边所有记录的关键字均不小于基准记录的关键字，
 * 最后将基准记录移至r[i]中，就完成了一次划分过程。最后对子表进行递归调用排序函数进行排序。
 *  
 *  */

package com.wayne.algorithm.sort;

import com.wayne.algorithm.util.OutUtil;

public class QuickSort {
	public static void main(String[] args) {
		int forSort[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15,
				35, 25, 53, 51 };
		quickSort(forSort);
		OutUtil.printAry(forSort);
	}
	
	public static void quickSort(int [] forSort) {
		if(forSort.length > 0) {
			_quickSort(forSort, 0, forSort.length-1);
		}
	}
	
	private static void _quickSort(int [] list, int low, int high) {
		if(low < high) {
			int middle = _getMiddle(list, low, high); //将list数组进行一分为二   
			_quickSort(list, low, middle-1);  //对低字表进行递归排序     
			_quickSort(list, middle+1, high); //对高字表进行递归排序  
		}
	}
	
	private static int _getMiddle(int[] list, int low, int high) {
		int tmp = list[low]; //数组的第一个作为中轴
		while(low < high) {
			while(low < high && list[high] >= tmp) {
				high--;
			}
			
			list[low] = list[high]; //比中轴小的记录移到低端 
			
			while(low < high && list[low] <= tmp) {
				low++;
			}
			
			list[high] = list[low]; //比中轴大的记录移到高端     
		}
		
		list[low] = tmp; //中轴记录到位
		
		return low; //返回中轴的位置     
	}
}
