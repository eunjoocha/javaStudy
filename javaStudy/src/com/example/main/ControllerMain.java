package com.example.main;

import com.example.fw.Controller;
import com.example.myproject.FirstController;

public class ControllerMain {
	public static void main(String[] args) {
		Controller c1 = new FirstController();
		c1.execute();
	}
}

// 추상 클래스는 템플릿 메소드 패턴에서 가장 많이 쓰인다.