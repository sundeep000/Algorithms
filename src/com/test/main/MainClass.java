package com.test.main;

import java.util.Arrays;

import com.test.search.BinarySearchTest;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		BinarySearchTest binarySearchTest = new BinarySearchTest();
		
		int[] arrayToSearch = new int[]{2,5,7,9,12,13,16,19,21,24,31,35};
		
		//binarySearchTest.binarySearchAlgorithm(12, arrayToSearch);
		
//		boolean bool = binarySearchTest.recursiveBinarySearch(12, arrayToSearch, 0, arrayToSearch.length -1);
//		if(bool) {
//			System.out.println("found");
//		}
//		else{
//			System.out.println("not found");
//		}
		
//		System.out.println(Arrays.copyOfRange(arrayToSearch, 0, 3).length);
//		System.out.println(Arrays.copyOfRange(arrayToSearch, 0, 3)[0]);
//		System.out.println(Arrays.copyOfRange(arrayToSearch, 0, 3)[1]);
//		System.out.println(Arrays.copyOfRange(arrayToSearch, 0, 3)[2]);
//		//System.out.println(Arrays.copyOfRange(arrayToSearch, 0, 3)[3]);
		
		
		//arrayToSearch = new int[]{1, 5, 6, 7};
		//binarySearchTest.searchBinary(12, arrayToSearch, 0);
		
		System.out.println(binarySearchTest.recursiveBinarySearchCopied(arrayToSearch, 0, arrayToSearch.length -1, 12));
		
		
		//binarySearchTest.doBinarySearch(12, arrayToSearch);
	}

}
