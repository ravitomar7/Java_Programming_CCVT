package com.rt.exceptionexamples;
import java.util.Scanner;

public class NewException 
{
	public static void main(String args[]) 
	{
		int a,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dividend followed by divisor.");
		a=sc.nextInt();
		d=sc.nextInt();
		try
		{
			System.out.println("Answer is: "+(a/d));
		}
		catch (Exception e)
		{
			System.out.println("Exception Caught: Division by 0");
		}
	}
}