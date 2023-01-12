package com.prowings.array;

import java.util.Scanner;

public class Prg41 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int value=sc.nextInt();
		
		if(value>=0)
			System.out.println(value+" is positive value");
		else
			System.out.println(value+" is negative value");
			
	}

}
