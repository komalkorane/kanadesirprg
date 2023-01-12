package com.prowings.array;

import java.util.Scanner;

public class Prg63l {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Search any number :");
	       int search=sc.nextInt();
	       int j=0;
	   
	       int a[] = { 10, 25, 48, 48, 75, 83, 98, 86, 56, 45 };
	       int b[]=new int[10];
	       
	       for(int i=0;i<a.length;i++)
	       {
	    	   if(search!=a[i])
	    	   {
	    		  b[j]=a[i];
	    		  j++;
	    	   } 
	    	   
	       }
	       for(j=0;j<b.length;j++)
	       {
	    	   System.out.println(b[j]);
	       }
	}

}
