package com.example.util2;

public class StringExam2 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		
		if(str1.equals(str2)) { // 값이 같으냐?
			System.out.println("str1과 str2의 값이 같다.");
		}
		String s = str1.toUpperCase();
		System.out.println(s);
		System.out.println(str1);
		
		String substring = str1.substring(3);
		// String은 새로운 문자열을 만들어서 리턴 
		// String이 가지고 있는 모든 메소드는 자기 자신을 변화시키지 않는다.
		System.out.println(substring);
		System.out.println(str1);
		
		// String은 불변 클래스
		// String의 어떤 메소드를 호출해도 String은 변하지 않는다.
		
		// String클래스는 왜 final일까?
		// String과 비슷하지만 내부가 변하는 StringBuffer 클래스
	}
}


