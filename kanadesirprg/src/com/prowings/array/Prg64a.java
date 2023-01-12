//a. Accept Value & Position & Store into an array at that 
//Position.

package com.prowings.array;

import java.util.Scanner;

public class Prg64a {

	public static void main(String[] args)
	{
		int a[]= {0,0,0,0,0};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value & position ");
		int v=sc.nextInt();
		int p=sc.nextInt();	
		
		for(int i=0;i<a.length;i++)
		{
			if(i==p)
			{
			   a[i]=v;
			}
			System.out.println(a[i]);
		}
	
	}

}
