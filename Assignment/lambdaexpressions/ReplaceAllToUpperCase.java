package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAllToUpperCase {
	
	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		
		array.add("Abbagoni");
		array.add("Capgemini");
		array.add("IAM VANI");
	
		
		System.out.println("Names :\n"+array);
		
		array.replaceAll(a-> a.toUpperCase());
		array.forEach(System.out::println);
	}

}
