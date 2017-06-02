/**
* <h1>ArrayList2</h1>
* This program demonstrates how to print the duplicate values in an array list.
* @author  Vikas
* @version 1.0
* @since   2017-05-30 
*/
package assignment9.session4;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		//creating ArrayList
		ArrayList<String> strings = new ArrayList<String>();
		//adding String elements into the ArrayList
		strings.add("good");
		strings.add("hello");
		strings.add("morning");
		strings.add("night");
		strings.add("evening");
		strings.add("good");
		strings.add("hello");
		//HashMap will contain elements of ArrayList as Key ,frequency of elements as Value
		HashMap<String, Integer> counts = new HashMap<String, Integer>();

		for (String str : strings) {
			//if HashMap holds the element of ArrayList already increase count by 1
		    if (counts.containsKey(str)) {
		        counts.put(str, counts.get(str) + 1);
		    } else {//else put the element as key of HashMap and count(1) as value of HashMap
		        counts.put(str, 1);
		    }
		}
		//printing only duplicate elements which are having value greater than 1 in the HashMap
		System.out.println("Duplicate elements in ArrayList are: ");
		for (Map.Entry<String, Integer> entry : counts.entrySet()) {
			if(entry.getValue()>1){
				System.out.println(entry.getKey());
			}
		    
		}

		
	}
	
	
}
