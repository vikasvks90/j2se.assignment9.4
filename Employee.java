/**
* <h1>Employee</h1>
* This program demonstrates how we can insert Employee object with 
* attributes: name, designation and salary in TreeSet
* and can sort the objects using comparable and comparator interface
* @author  Vikas
* @version 1.0
* @since   2017-05-30 
*/
package assignment9.session4;

import java.util.*;
//creating class Employee to provide
//to provide default natural sorting order - ascending order of salaries, Comparable interface has been implemented
public class Employee implements Comparable<Employee>{
	String name;
	String designation;
	int salary;
	//parameterized constructor
	public Employee(String name, String designation, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public static void main(String[] args) {
		//creating Employee objects
		Employee e1 = new Employee("Abhay","ASE",10000);
		Employee e2 = new Employee("Ashutosh","SE",20000);
		Employee e3 = new Employee("Arvind","ITA",20000);
		Employee e4 = new Employee("Ram","ITA",30000);
		Employee e5 = new Employee("Arvind","AST",20000);
		//creating TreeSet in which we are passing CompareEmployee object to implement Comparator interface
		TreeSet<Employee> t1 = new TreeSet<Employee>(new CompareEmployee());
		//adding Employee objects in treeSet
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		//iterating through TreeSet 
		Iterator<Employee> itr = t1.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	
	}
	//overriding compareTo method of Comparable interface for sorting according to salary
	@Override
	public int compareTo(Employee o) {
		int i1 = this.salary;
		int i2 = o.salary;
		Integer I1 = new Integer(i1);
		Integer I2 = new Integer(i2);
		if(I1<I2){
			return -1;
		}
		else if(I1>I2){
			return +1;
		}
		else{
			return 0;
		}
		
	}
	
	//overriding toString method to print Employee object details
	@Override
	public String toString(){
		return "Name:"+name+", Designation:"+designation+", Salary:"+salary;
	}

}

//here we are implementing Comparator interface to sort based on Employee name and designation
class CompareEmployee implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(!(o1.name.equals(o2.name))){
			return o1.name.compareTo(o2.name);
		}
		else if(o1.name.equals(o2.name)){
			return o1.designation.compareTo(o2.designation);
		}
		else{
			return 0;
		}

	}
}