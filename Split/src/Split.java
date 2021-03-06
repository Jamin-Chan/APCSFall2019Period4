import java.util.*;

public class Split {

 
	public static void main(String[] args) {
		System.out.println(part1("applespineapplesbreadlettucebreadtomatobaconmayohambreadcheese"));
		System.out.println(part2("apples pineapples bread lettuce tomato bacon mayo ham bread cheese"));
// Your task Part 0
//String.split();
//It's a method that acts on a string, <StringName>.split(<sp>);
//Where sp is the string where the string splits
//And it returns an array
// Example: "I like apples!".split(" ");
// it will split at spaces and return an array of ["I","like","apples!"]
// Example 2: "I really like really red apples!".split("really")
// it will split at the word "really" and return an array of ["I "," like ","red apples!"]
//play around with String.split!
//What happens if you "I reallyreally likeapples".split("really") ?
		String[] outputArray1 = "I like apples!".split(" ");
		System.out.println(Arrays.toString(outputArray1));
		String[] outputArray2 = "I really like really red apples!".split("really");
		System.out.println(Arrays.toString(outputArray2));
		String[] outputArray3 = "I really like really red apples!".split(" really ");
		System.out.println(Arrays.toString(outputArray3));
		String[] outputArray4 = "really I really like really red apples!".split("really");
		System.out.println(Arrays.toString(outputArray4));
		String[] outputArray5 = "I reallyreally likeapples".split("really");
		System.out.println(Arrays.toString(outputArray5));
		
		
//Your task Part 1:

/*Write a method that take in a string like
* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"
* describing a sandwich.
* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of
* the sandwich and ignores what's on the outside
* What if it's a fancy sandwich with multiple pieces of bread?
*/
	}
	
	public static String part1(String sandwich) {
		String inside = "";
		System.out.println(Arrays.toString(sandwich.split("bread")));
		String[] sandwichArray = sandwich.split("bread");
		if(sandwichArray.length >= 2) {
			for(int i = 1; i < sandwichArray.length - 1; i++) {
				inside += sandwichArray[i];
				if(i != sandwichArray.length - 2) {
					inside += "bread";
				}
			}
		} else {
			return "Not a sandwich";
		}

		return inside;
	}
		
//Your task pt 2:

/*Write a method that take in a string like

* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

* describing a sandwich

* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

* the sandwich and ignores what's on the outside.

* Again, what if it's a fancy sandwich with multiple pieces of bread

*/
	public static String part2(String sandwich) {
		String inside = "";
		int index1 = 0;
		int index2 = 0;
		String[] sandwichArray = sandwich.split(" ");
		for(int i = 0; i <= sandwichArray.length; i++) {
			if(sandwichArray[i].equals("bread")) {
				index1 = i + 1;
				i = sandwichArray.length + 1;
			}
		}
		for(int i = sandwichArray.length - 1; i >= 0; i--) {
			if(sandwichArray[i].equals("bread")) {
				index2 = i - 1;
				i = -1;
			}
		}
		
		for(int i = index1; i <= index2; i++) {
			inside += sandwichArray[i];
		}
		return inside;
	}
}
