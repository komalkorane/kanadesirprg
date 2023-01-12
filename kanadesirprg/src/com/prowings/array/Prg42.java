package com.prowings.array;

import java.util.Scanner;

public class Prg42 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int add=0;
		
		for(int i=0;i<=num;i++)
		{
			add=add+i;
		}System.out.println("Addition of digits is :"+add);
	}

}
