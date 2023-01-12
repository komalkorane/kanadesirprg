package com.prowings.array;

import java.util.Scanner;

public class Prg46a {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int rem=0;
		int addition=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			addition=addition+rem;
			 
		}
		System.out.println("addition is "+addition);
		
	}
}
