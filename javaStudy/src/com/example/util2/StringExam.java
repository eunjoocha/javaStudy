package com.example.util2;

public class StringExam {
	public static void main(String[] args) {
		String str1 = "hello"; // str1, st2은 같은 hello를 참조(new가 쓰이지 않아서 같은 객체(마치 상수처럼))
		String str2 = "hello";
		String str3 = new String("hello"); // new가 쓰이면 항상 heap 메모리에 새로운 객체가 만들어짐
		String str4 = new String("hello");
		
		if(str1 == str2) // 레퍼런스 타입에서 == 은 같은 것을 참조 하느냐?(값이 같냐가 아님)
			System.out.println("str1 == str2");
		if(str1 == str3)
			System.out.println("str1 == str3");
		if(str3 == str4)
			System.out.println("str3 == str4");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		// String을 사용할 때는 new를 쓰지 않는게 좋음
		// new를 사용하면 메모리를 차지하기 때문
	}
}
