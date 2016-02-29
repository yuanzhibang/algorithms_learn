package com.winnie.algorithms.cha2;

import java.util.Arrays;

/**
 * 插入排序
 * 
 * @author LaoYuan
 * @create 2016年1月14日
 */
public class InsertionSort {
	
	/**
	 * 测试算法
	 * @param args
	 */
	public static void main(String[] args) {
		Comparable[] array = new Long[]{3L,1L,2L,5L};
		System.out.println(Arrays.toString(array));
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	} 
	
	/**
	 * 插入排序实现.<br>
	 * 
	 * 伪代码:<br>
	 * <PRE>
	 *  INSERTION-SORT(A) 
	 *    for j=2 to A.length
	 *    
	 *    key = A[j]
	 *    i = j-1
	 *    
	 *    while i>0 and A[i]>key
	 *      A[i+1] = A[i]
	 *      i = i-1
	 *      
	 *    A[i+1] =key 	
	 *   </PRE>
	 * 
	 * 整体思路：<br>
	 * 将数组拆分为逻辑上两个数组 <br>
	 * 右侧数组是排序好的数组，每次迭代长度+1 <br>
	 * 左侧数组是没有排序好的数组，每次迭代长度-1 <br>
	 * 右侧数组新增的那个位置的原本的元素，缓存为临时变量 <br>
	 * 通过比较移位，寻找该临时变量在右侧数组的位置 <br>
	 * <br>
	 * <br>
	 * 循环不变：每次迭代右侧数组是有序性不变 <br>
	 * 1.迭代前，右侧数组长度是1，肯定是有序的,不变式成立<br>
	 * 2.保持:  每次迭代都是让右侧数组+1,元素向左移动，直到找到新元素的正确位置，所以有序性依然保持,不变式成立<br>
	 * 3.终止:  每次迭代，右侧数组长度+1，直到右侧数组实际上就是整个数组，有序性依然保持不变,不变式成立<br>
	 * <br>
	 * <br>
	 * 原地排序：<br>
	 * 	如果排序时，需要常量个额外空间，则称其为原地排序。<br>
	 * 	插入排序仅仅需要一个临时变量空间 key = A[j],所以，插入排序是原地排序<br>
	 *	 <br>
	 * @param array 不能为null，且数组内元素不能为null
	 */
	public static void insertionSort(Comparable[] array){
		for(int j=1;j<array.length;j++){
			Comparable  key = array[j];
			int i = j-1;
			while(i>=0 && array[i].compareTo(key)>0){
				array[i+1]=array[i];
				i--;
			}
			array[i+1] = key;
		}
	}
	

	
}
