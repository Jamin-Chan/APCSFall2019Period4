import java.util.*;

public class ArraysLab3 {
	
	public static void main(String[] args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		
		int[] sum = sum(a1, a2);
		int appendNum = 200;
		int[] append = append(a1, appendNum);
		int removeIdx = 5;
		int[] remove = remove(a2, removeIdx);
		int sumOfEvens = sumEven(append);
		rotateRight(a1);
		
		System.out.println(Arrays.toString(sum));
		System.out.println(Arrays.toString(append));
		System.out.println(Arrays.toString(remove));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
	
	
	//Write a method sum that accepts two arrays of integers arr1 and arr2 and returns an array of integers, 
	//in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	//You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sum = new int[arr1.length];
		
		for(int i = 0; i < sum.length; i++) {
			sum[i] = arr1[i] + arr2[i];
		}
		
		return sum;
	}
	
	//Write a method append that accepts an array of integers arr of length n and an integer num, 
	//and returns an array of integers of length n+1 that consists of the elements of arr with num appended to the end. 
	//You can assume array arr has at least one element.
	public static int[] append(int[] arr, int num) {
		int[] append = new int[arr.length+1];
		
		for(int i = 0; i < arr.length; i++) {
			append[i] = arr[i];
		}
		append[append.length-1] = num;
		return append;
	}
	
	//Write a method remove that accepts an array of integers arr and an integer idx and 
	//returns an array of integers consisting of all of the elements of arr 
	//except for the element at index idx (thus, the returned array has a length of arr.length – 1).  
	//You can assume arr has at least two elements.
	public static int[] remove(int[] arr, int idx) {
		int remove[];
		remove  = new int[arr.length - 1];
		for(int i = 0; i < remove.length; i++) {
			if(i >= idx) {
				remove[i] = arr[i+1];
			} else {
				remove[i] = arr[i];
			}
		}
		return remove;
	}
	
	//Write a method sumEven that accepts an array of integers arr and 
	//returns an integer containing the sum of the elements at the even indices of arr.  
	//(That means elements at indices 0,2,4,6,8.)  
	//You can assume arr has at least one element.
	public static int sumEven(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length;i++) {
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	//Write a method rotateRight that accepts an array of integers arr and does not return a value.  
	//The rotateRight method moves each element of arr one index to the right 
	//(element 0 goes to element 1, element 1 goes to element 2, …, element n-1 goes to element 0). 
	//You can assume arr has at least one element.
	public static void rotateRight(int[] arr) {
		int rotate = arr[arr.length-1];
		for(int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = rotate;
	}
}
