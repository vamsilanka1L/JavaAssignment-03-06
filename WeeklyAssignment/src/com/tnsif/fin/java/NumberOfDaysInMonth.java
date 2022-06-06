package com.tnsif.fin.java;
import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		String month;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter Month ");
		month = sc.nextLine();	
		
		switch(month)
		{
		  	case "Jan":
		  	case "Mar":
			case "May": 	
			case "July":
			case "Aug":
			case "Oct":
			case "Dec":			  	
				System.out.println("\n 31 Days in this Month");
			  	break;
			
			case "April":	
			case "June":
			case "Sep":
			case "Nov":			    	
				System.out.println("\n 30 Days in this Month");  
				break;
			
			case "Feb":
				System.out.println("\n Either 28 or 29 Days in this Month"); 
				break;
			
			default:		  	
				System.out.println("\n Invalid Input");
		// TODO Auto-generated method stub

	}

}
}
