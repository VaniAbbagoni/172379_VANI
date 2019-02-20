package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddLength {

	public static void main(String[] args) 
	{
		List<String> s=new ArrayList<String>();
		s.add("vani");
		s.add("honey");
		s.add("Capgemini");
		s.add("hey jude");
		
		s.removeIf(a->a.length()%2!=0);
		s.forEach(System.out::println);
	
	}
}
