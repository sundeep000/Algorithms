package com.test.search;

import java.util.Arrays;

public class BinarySearchTest {

	public boolean binarySearchAlgorithm(int targetNumber, int[] numbers) { 
		int lowerLimit = 0; 
		int upperLimit = numbers.length - 1; 
		while (upperLimit >= lowerLimit) { 
			int middleNumber = (lowerLimit + upperLimit)/2; 
			if (numbers[middleNumber] == targetNumber) { 
				System.out.println(middleNumber);
				return true; 
			} if (numbers[middleNumber] < targetNumber) { 
				lowerLimit = middleNumber + 1; 
			} 
			if (numbers[middleNumber] > targetNumber) { 
				upperLimit = middleNumber - 1; 
			}
		} 
		System.out.println("could not be found");
		return false;
	}
	
	
	public boolean recursiveBinarySearch(int targetNumber, int[] numbers, int start, int end) {
		int mid = (start+end)/2;
		System.out.println("start = "+start);
		System.out.println("end = "+end);
		System.out.println("array item at mid = "+numbers[mid]);
		if(targetNumber == numbers[mid]) {
			System.out.println("found at "+mid);
			return true;
		}
		else if(targetNumber < numbers[mid]) {
			end = mid - 1;
			System.out.println("end became "+end);
		}
		else if(targetNumber > numbers[mid]) {
			start = mid + 1;
			System.out.println("start became "+start);
		}

		if((start <= end)) {
			recursiveBinarySearch(targetNumber, numbers, start, end);
		}
		//System.out.println("could not find the number "+targetNumber+" in the array");
		//return false;
		return recursiveBinarySearch(targetNumber, numbers, start, end); // why didn't return false work here
		
		/*
		 * [2, 4, 6, 8, 23, 34, 45]
		 * search for 6
		 * 
		 * start = 0
		 * end - 6
		 * mid - 3 => 8
		 * 
		 * 	start = 0
		 *  end = 2
		 *  mid = 1 => 4
		 *  rec(6, array, 0, 2)
		 *  	start = 2
		 *      end = 2
		 *      mid = 2
		 *      return true
		 *  	
		 * 
		 */
		
	}
	
	public void searchBinary(int t, int[] numbers, int foundAt) {
		//int foundAt;
		int mid = (numbers.length - 1 )/2;
		if(numbers.length == 1) {
			if(t!=numbers[mid])  {
				System.out.println("could not be found");
				} 
			else {
				System.out.println("found at"+foundAt);
			}
		}
		else if(numbers.length > 1) {

			if(t < numbers[mid]) {
				if(mid == 0) {
					numbers = Arrays.copyOfRange(numbers, 0, 1);
					foundAt = foundAt+1;
				}
				else {
					numbers = Arrays.copyOfRange(numbers, 0, mid);
				}
				
			}
			else if(t > numbers[mid]) {
				numbers = Arrays.copyOfRange(numbers, mid+1, numbers.length);
				foundAt = foundAt + mid;
			}
			searchBinary(t, numbers, foundAt);
			System.out.println("length="+numbers.length);
	


		}
	}
	
	
	public static int recursiveBinarySearchCopied(int[] sortedArray, int start, int end, int key) {
        
        if (start < end) {
            int mid = start + (end - start) / 2;  
            if (key < sortedArray[mid]) {
                return recursiveBinarySearchCopied(sortedArray, start, mid, key);
                 
            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearchCopied(sortedArray, mid+1, end , key);
                 
            } else {
                return mid;   
            }
        }
        return -(start + 1);  
    }
}
