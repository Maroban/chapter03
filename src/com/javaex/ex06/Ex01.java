package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		Integer result = i01 + i02; // int result = 10 + 7;
		// Integer result = new Integer(10) + new Integer(7);

		System.out.println(result);

		int i10 = 7; // i10. 이런 메소드 없음

		////////////////////////////////////////////////////////////////////////////////////////////

		// 박싱
		Integer i11 = 10; // new Integer 가 생략된 것.
		Integer i100 = 15;

		// 언박싱
		int i101 = i11;

		////////////////////////////////////////////////////////////////////////////////////////////

		// 문자열 "12345"를 숫자 12345로 바꾸기 예제
		Integer i999 = 999; // 999는 의미 없다.
		int num = i999.parseInt("12345");
		System.out.println(num);

		// "12345" => 12345 실제 사용 문법
		int num2 = Integer.parseInt("12345"); // 이렇게 되는 이유는 .parseInt 가 스태틱으로 올라갔기 떄문
		System.out.println(num2);

		////////////////////////////////////////////////////////////////////////////////////////////

		// 정수 => 문자열 예제
		String str = new String("hi");  // hi는 의미 없는 문자열이다.
		String strResult = str.valueOf(123456); // 123456 => "123456"
		System.out.println(strResult);

		// 정수 => 문자열 실제 사용 문법 (정석)
		String strResult2 = String.valueOf(123456);
		System.out.println(strResult2);

		// 정수 => 문자열 실제 사용 문법 (많이 사용)
		String strResult3 = "" + 9876;
		System.out.println(strResult3);

		////////////////////////////////////////////////////////////////////////////////////////////

		String yn = "y"; // 사용자가 입력한 값.

		// null Point 상황이 발생할 수 있다. 때문에 이렇게는 사용 안한다.
		if (yn.equals("y")) {
			System.out.println("게임다시시작");
		}

		// 반대로 사용하는 경우가 많다. null 값이 들어가면 오류나기 때문

		// equals() 사용팁 ==> null Point 상황이 발생하지 않는다.
		if ("y".equals(yn)) {
			System.out.println("게임다시시작");
		}

		////////////////////////////////////////////////////////////////////////////////////////////
		
		// 다른 기본자료형
		Short s = new Short((short)3);  // int 미만 자료형은 형변환 해줘야 함
		Byte b = new Byte((byte)3);  // int 미만 자료형은 형변환 해줘야 함
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
