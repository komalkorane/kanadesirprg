package com.prowings.array;

import java.util.Scanner;

public class Positive_negative {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int p[]=new int[10];
		int n[]=new int[10];
		int j=0, k=0;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter any number");
			a[i]=sc.nextInt();
			if(a[i]>=0)
			{
				p[j]=a[i];
				j++;
			}
			if(a[i]<0)
			{
				n[k]=a[i];
				k++;
			}
		}
		System.out.println("Positive numers is ");
		for( j=0;j<p.length;j++)
		{
			System.out.println(p[j]);
		}
		System.out.println("Negative numers is ");
		for( k=0;k<n.length;k++)
		{
			System.out.println(n[k]);
		}
		
	}

}
