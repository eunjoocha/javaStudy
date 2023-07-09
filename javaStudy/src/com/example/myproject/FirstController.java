package com.example.myproject;

import com.example.fw.Controller;

public class FirstController extends Controller {

	@Override
	protected void run() {
		System.out.println("별도로 동작하는 코드 111111");
	}

//	@Override
//	protected void init() {
//		System.out.println("내 마음대로 init");
//	}
	// final이 붙은 메소드는 Override 금지
}

// Controller와 서로 다른 package이지만 상속을 받아서 run()메소드 사용 가능
