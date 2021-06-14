package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {

		
		Object obj01 = new Object();
		
		// getClass() => 클래스 정보
		System.out.println("========== getClass() ==========");
		System.out.println(obj01.getClass());
		System.out.println("");
		
		// hashCode() => 객체를 식별할 하나의 정수
		System.out.println("========== hashCode() ==========");
		System.out.println(obj01.hashCode());
		
		Object o01 = new Object();
		Object o02 = new Object();
		Object o03 = new Object();
		
		System.out.println(o01.hashCode());
		System.out.println(o02.hashCode());
		System.out.println(o03.hashCode());
		System.out.println("");

		// toString() => 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴
		System.out.println("========== toString() ==========");
		System.out.println(obj01.toString());
		System.out.println("");
		
		// equals() => 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴
		System.out.println("========== equals() ==========");
		System.out.println(obj01.equals(obj01));
		System.out.println("");
		
		
		/*
		Point p01 = new Point(100, 100);
		System.out.println(p01.toString());
		*/
		
		
		
	}	
		
}
