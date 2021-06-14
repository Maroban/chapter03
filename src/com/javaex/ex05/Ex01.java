package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {

		String s01 = new String("안녕하세요.");
		String s02 = new String("안녕하세요.");
		
		System.out.println(s01.equals(s02));
		System.out.println("=============================");
		
		String s03 = "안녕하세요.";
		String s04 = "안녕하세요.";
		
		System.out.println(s03==s04);
		System.out.println(s03.equals(s04));
		System.out.println("=============================");
		
		s03 = "Hello";
		System.out.println(s03==s04);
		System.out.println(s03.equals(s04));
		System.out.println("=============================");
		
		String str1, str2, str3;
		
		str1 = "abc";
		str2 = "cde";
		str3 = str2;
		
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		
		
		
		
		
		
		
		
	}

}
