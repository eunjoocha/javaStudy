package javaStudy;

public class MathBean {
	
	public void printClassName() {
		System.out.println("MathBean");
	}
	
	public void printNumber(int x) {
		System.out.println(x);
	}
	
	public int getOne() {
		return 1;
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	// 프로그래밍을 작성하기 전에 그림으로 어떤 클래스 이름을 사용할지, 어떤 메소드를 만들어야 할지 표현하는 습관을 가지는 것이 좋다.
	// 먼저 설계를 하고, 코드를 작성한다.
	
	// 이렇게 만든 클래스를 사용하려면, 메모리에 올려야 한다.
	// 메모리에 올리려면 new 연산자가 사용되어야 한다.
}
