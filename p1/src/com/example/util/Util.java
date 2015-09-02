package com.example.util;

public class Util {
	
	static public String getName(Integer n){
		return "name_"+n;
	}
	
	static public String getType(Integer n){
		String type = "type_";
		Integer i = n % 3;
		return type+i;
	}
	
	static public String getType2(Integer n){
		String type = "TYPE_";
		Integer i = n % 5;
		return type+i;
	}

	static public String getScore(Integer n){
		return "score_"+n;
	}
	
}
