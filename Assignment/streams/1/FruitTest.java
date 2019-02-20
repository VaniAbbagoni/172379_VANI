package com.cg.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitTest {

	public static void main(String[] args) {
		List<Fruit> l=new ArrayList<Fruit>();
		l.add(new Fruit("Strawberries",96));
		l.add(new Fruit("Apples",105));
		l.add(new Fruit("Kiwi", 93));
		l.add(new Fruit("Grapes",101));
		
		List<Fruit> l2=l.stream().filter(e->e.getCalories()<100).sorted((x,y)->x.getCalories()).sorted((x,y)->x.getCalories().compareTo(y.getCalories())).collect(Collectors.toList());
		l2.forEach(System.out::println);
	
	}

}
