//Header
//Program name: Chapter 2 exercise 2
//Author: David Girard
//Class: CS160 Fall 2019
//Date: 10/15/2019
//Description: Make a list of integers, day, date, month, and year. 
	//Display those integers coordinating with the date, one in American
	//format, and the other in European format.
package date.java;

public class Date {

	public static void main(String[] args) {
		String day = "Tuesday";
		int date = 15; 
		String month = "October ";
		int year = 2019;
			
			System.out.print("The current date is ");	//American format
			System.out.print(day);
			System.out.print(", ");
			System.out.print(month);
			System.out.print(date);
			System.out.print(", ");
			System.out.print(year);
			System.out.println(".");
			
		
			String month1 = " October"; 	
			System.out.print("The current date is ");	//European format
			System.out.print(day);
			System.out.print(", ");
			System.out.print(date);
			System.out.print(month1);
			System.out.print(", ");
			System.out.print(year);
			System.out.println(".");
			
		
			}
			
		
	

/* Footer
 * The current date is, Tuesday, October 15, 2019.
 * The current date is, Tuesday, 15 October, 2019.
 */


	}


