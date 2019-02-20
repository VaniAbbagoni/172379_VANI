package com.lambdaexpressions;

public class ArithmeticusingLambda 
{
	public static void main(String args[])
	{
		Arithmetic add=(x,y)->x+y;
		Arithmetic sub=(x,y)->x-y;
		Arithmetic mul=(x,y)->x*y;
		Arithmetic div=(x,y)->x/y;
		
		System.out.println("addition = "+add.op(19.0, 12.3));
		System.out.println("subtraction = "+sub.op(19.0, 12.3));
		System.out.println("multiplication = "+mul.op(19.0, 12.3));
		System.out.println("divison = "+div.op(19.0, 12.3));
	}
	
}
