package com.stringmethods;

public class String1 {
	
	public static void main(String[] args) {
		
		String s = "welcome to java";
		
		int length = s.length();
		System.out.println(length);
		
		boolean equals = s.equals("Welcome to java");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("Welcome to java");
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("w");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("a");
		System.out.println(endsWith);
		
		boolean contains = s.contains("a");
		System.out.println(contains);
		
		int indexOf = s.indexOf("e");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(13);
		System.out.println(charAt);
		
		String replace = s.replace("to", "for");
		System.out.println(replace);
		
		String substring = s.substring(3);
		System.out.println(substring);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		String[] split = s.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		
		String a = "  to  java     ";
		String trim = a.trim();
		System.out.println(trim);
		
		String concat = s.concat(a);
		System.out.println(concat);
	}

}
