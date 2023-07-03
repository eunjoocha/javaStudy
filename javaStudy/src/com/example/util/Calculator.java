package com.example.util;

public class Calculator {
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int value = cal.plus(10, 100);
		System.out.println(value);
	}
	// JVM은 CLASSPATH에서 com 폴더를 찾고, 그 com 폴더 아래에서 example 폴더를 찾고, example 폴더 아래에서 util 폴더를 찾은 후,
	// util 폴더 아래에서 Calculator 클래스를 찾아서 실행한다.
}
