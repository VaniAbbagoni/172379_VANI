package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class NumbersFromList {

	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<Integer>();
		array.add(01);
		array.add(22);
		array.add(302);
		array.add(40);

		Runnable r = () -> { array.stream().forEach(System.out::println); 
		};
		
		new Thread(r).run();
	}

}
