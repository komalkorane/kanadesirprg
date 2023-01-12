package com.prowings.array;

import java.util.Scanner;

public class Prg63h {

	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
       System.out.println("Search any number :");
       int search=sc.nextInt();
       int count=0;
       int a[] = { 10, 25, 48, 62, 75, 83, 98, 86, 56, 45 };
       
       for(int i=0;i<a.length;i++)
       {
    	   if(search==a[i])
    	   {
    		   System.out.println(a[i]+ " is present index " +i);
    		   count++;
    	   }
    	   
       }
       if(count==0)
		   System.out.println("not present");
	}

}
