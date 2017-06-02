/**
* <h1>SetDemo</h1>
* This program demonstrates functionality to copy all the elements from set2 to set1 
* so that the set1 becomes the union of set1 and set2
* @author  Vikas
* @version 1.0
* @since   2017-05-30 
*/

package assignment9.session4;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		//creating Set1
		Set<Integer> set1 = new HashSet<Integer>();
		//creating Set2
		Set<Integer> set2 = new HashSet<Integer>();
		//adding elements into Set1
		set1.add(2);
		set1.add(3);
		set1.add(6);
		set1.add(7);
		System.out.println("Set1 elements: "+set1);
		//adding Elements into Set2
		set2.add(2);
		set2.add(4);
		set2.add(5);
		System.out.println("Set2 elements: "+set2);
		//copying all the elements of Set2 into Set1 
		//now the set1 becomes the union of set1 and set2 with only unique elements
		set1.addAll(set2);
		System.out.println("Set1 after copying set2 elements: "+set1);
		
	}

}
