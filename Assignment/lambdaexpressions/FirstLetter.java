package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter {
	
	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		array.add("Vani");
		array.add("Capgemini");
		array.add("V502");
	
		System.out.println("Names :\n"+array);
	
		String result = array.stream().map(A -> Character.toString(A.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(result);
	
	}
}
