package com.lambdaexpressions;

public class orderCriteria {

	public static void main(String[] args) 
	{
		Order o=(amount)->{if(amount>10000)
			System.out.println("Order is completed");
		else
			System.out.println("order is not completed");
		return amount;
		};
		o.criteria(2000);
	}
}
