package com.stream.interview;



public class Demo5 {
	public static void main(String[] args) {
		  String s2="chetan";
	        String collect2 = s2.chars().//convert to char to intStream(unicode)
	        		mapToObj(c ->String.valueOf((char) c)).//with String.valueOf convert any type to string
	                 reduce((a, b) -> b + a).get();//add+joining
	        System.out.println("Reversed string will be :" +collect2);
		
	}

}
