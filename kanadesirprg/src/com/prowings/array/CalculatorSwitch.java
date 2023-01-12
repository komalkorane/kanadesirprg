package com.prowings.array;
import java.util.Scanner;
public class CalculatorSwitch {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int res;
		char c;
		
		do
		{
			System.out.println("Press : +,-,/,*,%");
			String choice=sc.next();
				
		switch(choice)
		{
		case "+": res=num1+num2;
		System.out.println("Addition is :"+res);
		break;
		
		case "-": res=num1-num2;
		System.out.println("Substraction is :"+res);
		break;
		
		case "*": res=num1*num2;
		System.out.println("Multiplication is :"+res);
		break;
		
		case "/": res=num1/num2;
		System.out.println("Devision is :"+res);
		break;
		
		case "%": res=num1%num2;
		System.out.println("Remainder is :"+res);
		break;
		}
		
		System.out.println("if continue 'y'");
		c=sc.next().charAt(0);
	}while(c=='y');
		
	}

}
