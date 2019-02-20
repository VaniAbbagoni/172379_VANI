package com.cg.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RedColorTest {

	public static void main(String[] args) {
		List<Redcolor> sc=new ArrayList<Redcolor>();
		sc.add(new Redcolor("Apple",100, "red"));
		sc.add(new Redcolor("Orange",40, "orange"));
		sc.add(new Redcolor("watermelon",30, "green"));
		sc.add(new Redcolor("Cherries",100,"red"));
		
		List<Redcolor> l2=sc.stream().filter(e->e.getColor()=="red").sorted((x,y)->x.getPrice().compareTo(y.getPrice())).collect(Collectors.toList());
		
		l2.forEach(System.out::println);
	}

}
