package com.prowings.array;

import java.util.Scanner;

public class Prg64b {

	public static void main(String[] args)
	{
		int a[]= {0,0,0,0,0};
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter value & position ");
			int v=sc.nextInt();
			int p=sc.nextInt();	
		
		
			   a[p]=v;
	
			
		}
		for(int x=0;x<a.length;x++)
		System.out.println(a[x]);
	}

}
