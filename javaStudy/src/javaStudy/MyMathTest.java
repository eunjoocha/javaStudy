package javaStudy;

public class MyMathTest {
	public static void main(String[] args) {
		int value = MyMath.abs(-5);
		System.out.println(value);
		
		MyMath m = new MyMath();
		
		// Math 클래스는 인스턴스를 생성하지 않아도 되도록 Math 클래스를 만들었다.
		// 그런데, Math 클래스의 인스턴스를 만든다면 어떻게 될까?
		// 인스턴스를 안 만들어도 사용 가능한데, 인스턴스를 만드는 것을 메모리를 낭비하는 것
	}
}
