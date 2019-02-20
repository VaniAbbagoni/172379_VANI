package com.cg.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ColorwiseTest {
	public static void main(String args[])
	{
		List<Colorwise> list=new ArrayList<Colorwise>();
		list.add(new Colorwise("Grapes","green"));
		list.add(new Colorwise("Apple","red"));
		list.add(new Colorwise("banana","yellow"));
		list.add(new Colorwise("cherries","red"));
		list.add(new Colorwise("watermelon","green"));
		
		List<Colorwise> l2=list.stream().sorted((x,y)->x.getColor().compareTo(y.getColor())).collect(Collectors.toList());
		list.forEach(System.out::println);
		
	}

}
