package com.test.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = new int[]{1, 23, 300, 323, 789, 824};
		int[] b = new int[]{5, 79, 678, 904};
		//int[] a = new int[]{1, 23,};
		//int[] b = new int[]{10, 25};
		int[] result = merge(a, b);
		for(int i : result) {
			System.out.println(i);
		}
	}
	
	private static int[] mergeSortImplementation(int[] a) {
		
		// divide
		
		
		return null;
	}
	
	
	private static int[] merge(int[] a, int[] b) {
		int totalLength = a.length + b.length;
		int[] result = new int[totalLength];
		int aIndex = 0;
		int bIndex = 0;
		for(int i=0; i< totalLength; i++) {	
			if(aIndex < a.length && bIndex < b.length) {
				if(a[aIndex] <= b[bIndex]) {
					result[i] = a[aIndex];
					aIndex++;
				}
				else {
					result[i] = b[bIndex];
					bIndex++;
				}
			}
			else if(aIndex == a.length) {
				result[i] = b[bIndex];
				bIndex++;
			}
			else if(bIndex == b.length) {
				result[i] = a[aIndex];
				aIndex++;
			}	
		}	
		return result;
	}

}
