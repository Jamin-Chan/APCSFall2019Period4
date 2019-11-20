
public class ArraysLab3 {
	
	public static void main(String[] args) {
		
	}
	
	
	//Write a method sum that accepts two arrays of integers arr1 and arr2 and returns an array of integers, 
	//in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	//You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sum;

		for(int i =  0; arr1.length + arr2.length > 0; i++) {
			if(i >= arr2.length) {
				sum += arr1[i];
			} else {
				sum += arr2[i];
			}
		}
		sum = adding.split(" ");
		return sum;

	}
	
	//Write a method append that accepts an array of integers arr of length n and an integer num, 
	//and returns an array of integers of length n+1 that consists of the elements of arr with num appended to the end. 
	//You can assume array arr has at least one element.
	public static int[] append(int[] arr, int num) {
	
	}
	
	//Write a method remove that accepts an array of integers arr and an integer idx and 
	//returns an array of integers consisting of all of the elements of arr 
	//except for the element at index idx (thus, the returned array has a length of arr.length � 1).  
	//You can assume arr has at least two elements.
	public static int[] remove(int[] arr, int idx) {
		
	}
	
	//Write a method sumEven that accepts an array of integers arr and 
	//returns an integer containing the sum of the elements at the even indices of arr.  
	//(That means elements at indices 0,2,4,6,8.)  
	//You can assume arr has at least one element.
	public static int sumEven(int[] arr) {
		
	}
	
	//Write a method rotateRight that accepts an array of integers arr and does not return a value.  
	//The rotateRight method moves each element of arr one index to the right 
	//(element 0 goes to element 1, element 1 goes to element 2, �, element n-1 goes to element 0). 
	//You can assume arr has at least one element.
	public static void rotateRight(int[] arr) {
		
	}
}
