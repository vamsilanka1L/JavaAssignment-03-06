package com.tnsif.fin.java;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		for(int i=1;i<=20;i++) {
			System.out.print(a+" x "+i+" = ");
			System.out.println(a*i);
		}
		
		
		// TODO Auto-generated method stub

	}

}
