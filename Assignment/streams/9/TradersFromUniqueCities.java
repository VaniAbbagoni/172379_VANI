package com.cg.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TradersFromUniqueCities {

	public static void main(String[] args) {
List<Trader> list=new ArrayList<Trader>();
		
		list.add(new Trader("Saksena","Indore"));
		list.add(new Trader("Naresh","Hyderabad"));
		list.add(new Trader("Shiva","pune"));
		
		List<Trader> l=list.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
		l.forEach(System.out::println);
	}

}
