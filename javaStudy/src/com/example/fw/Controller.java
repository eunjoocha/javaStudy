package com.example.fw;
/*
Controller의 종류가 여러개
초기화 - 같은 코드
실행 - 다른 코드
마무리 - 같은 코드
 */
public abstract class Controller {
	// protected는 같은 package이거나 상속받았을 겨우 접근 가능
	protected final void init() {
		System.out.println("초기화 하는 코드");
	}
	
	protected final void close() {
		System.out.println("마무리 하는 코드");
	}
	protected abstract void run(); // 매번 다른 코드
	
	// 내가 가지고 있는 메소드를 호출한다.
	// 순서를 가지고 있다. 이런 메소드를 템플릿 메소드라고 한다.
	public void execute() {
		this.init(); // this.은 생략 가능
		this.run();
		this.close();
	}
	// 사용자는 execute()만 호출되게 해야함.
}
