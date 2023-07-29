package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> employee = new LinkedList<Integer>();
		employee.add(12);
		employee.add(35);
		employee.add(43);
		employee.add(26);
		employee.add(17);
		employee.add(19);
		System.out.println("Employees at the beginning of the year:");
		System.out.println(employee);
		
		// Remove IDs from employee
		employee.remove(Integer.valueOf(43));
		employee.remove(Integer.valueOf(17));
		System.out.println("Employees after being retired:");
		System.out.println(employee);
		
		// Display employee IDs in employee in reverse order
		System.out.println("Employees in the reverse order:");
		for(int i = employee.size()-1; i >= 0; i--) {
			System.out.print(employee.get(i) + " ");
		}
		
		// Check whether employee IDs are stored in employee
		System.out.println("\n");
		System.out.println("Employees with the id 35 is present or not: " +
					employee.contains(Integer.valueOf(35)));
		System.out.println("Employees with the id 23 is present or not: " +
					employee.contains(Integer.valueOf(23)));
		System.out.println("Employees with the id 26 is present or not: " + 
					employee.contains(Integer.valueOf(26)));
		System.out.println("Employees with the id 08 is present or not: " +
					employee.contains(Integer.valueOf(8)));
		
		// Increment all employee IDs stored in employee by 5
		for(int i = 0; i < employee.size(); i++) {
			employee.set(i, employee.get(i)+5);
		}
		System.out.println("Incrementing all the values in the list by 5");
		System.out.println(employee);
		
		// Display last k employee IDs from employee
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value between 0 and 4");
		int k = scanner.nextInt();
		for(int i = employee.size()-k; i < employee.size(); i++) {
			System.out.print(employee.get(i) + " ");
		}
		System.out.println("\nEnter a value between 0 and 6");
		k = scanner.nextInt();
		for(int i = 0; i < k; i++) {
			System.out.print(employee.get(i) + " ");
		}
		
		// Check employee ID 25 is in the employee
		System.out.println("\n\n25 is present in the list or not: " +
					employee.contains(Integer.valueOf(25)));
		
		// Check employee ID 32 is in the employee
		System.out.println("32 is present in the list or not: " +
					employee.contains(Integer.valueOf(32)));
		
	}





	}


