/**
* <h1>ArrayList1</h1>
* This program demonstrates how to add integer objects into ArrayList 
* and print only even numbers present in the ArrayList.
* @author  Vikas
* @version 1.0
* @since   2017-05-30 
*/

package assignment9.session4;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//creating ArrayList
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		//adding integer objects into the ArrayList
		arrayList1.add(new Integer(1));
		arrayList1.add(new Integer(2));
		arrayList1.add(new Integer(3));
		arrayList1.add(new Integer(4));
		arrayList1.add(new Integer(5));
		arrayList1.add(new Integer(6));
		arrayList1.add(new Integer(7));
		arrayList1.add(new Integer(8));
		arrayList1.add(new Integer(9));
		arrayList1.add(new Integer(10));
		//iterating through the ArrayList
		 for (int i=0;i<arrayList1.size();i++){
		    //if element is divisible by 2 its even
	        int even=arrayList1.get(i)%2;       
	        if (even==0){
	        	//if the element is even print it
	            System.out.println("This is Even Number:"+ arrayList1.get(i));
	        }    
		 }
	}

}
