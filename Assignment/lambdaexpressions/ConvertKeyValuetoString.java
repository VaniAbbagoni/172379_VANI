package com.lambdaexpressions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConvertKeyValuetoString {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("abc", 1);
		map.put("vani", 2);
		map.put("Capgemini", 3);
		
		 StringBuilder sb=new StringBuilder();
		 Set<Map.Entry<String, Integer>> s=map.entrySet();
			 
			  
		  for(Map.Entry<String,Integer> x:s) 
		  {
			   sb=sb.append(x.getKey()+""+x.getValue() );
		  }
			  
		  System.out.println(sb);
			
		}
	}
