package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(",efg ");
		
		
		a = a.concat(b);  // 문자열 붙이는 것
		System.out.println(a);  
		System.out.println("==========================");
		
		
		a = a.trim();  // 공백을 제거하는 것
		System.out.println(a);
		System.out.println("==========================");
		
		a = a.replace("ab", "12");  // ab를 12로 바꾸는 것
		System.out.println(a);
		System.out.println("==========================");
		
		String[] sArray = a.split(",");  
		// ,를 기준으로 나누는 것 ("," 기준으로 나누면 2개의 문자열이 나오기 때문에 배열로 받아야 함)
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println("==========================");
		
		String str = "Hello java!";
		System.out.println(str.charAt(6));  // 해당 숫자의 위치에 있는 문자를 출력
		System.out.println("==========================");
		
		String result = str.substring(3);  // 문자열 start위치부터 끝까지 문자열 자르기 (배열이라 0부터 시작)
		System.out.println(result);
		
		String result2 = str.substring(3, 8);  // 문자열 start위치부터 end전까지 문자열 출력
		System.out.println(result2);
		
		
		
		
		
		
		
	}

}
