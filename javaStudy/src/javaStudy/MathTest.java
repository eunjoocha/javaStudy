package javaStudy;

public class MathTest {
	public static void main(String[] args) {
		int value = Math.abs(-5);
		System.out.println(value);
		// Math의 abs() 메소드는 매개변수로 받은 값을 절댓값으로 변환해 리턴 하는 메소드
		// 출력값은 5
		//Math m = new Math();
		// Math() 부분에서 컴파일 오류가 발생
	}
	// 자바 API란 자바 개발자가 제공하는 명령어
	// API 문서란 이런 명령어들의 사용법과 규격을 제공하는 문서
	
	// java.lang.Object
	//		java.lang.Math
	// Math는 java.lang.Object를 상속받는다는 의미
	
	// public final class Math extends Objects
	// 클래스의 정의 
	
	// Math는 Java 1.0 부터 있었던 클래스
	
	// Math클래스는 인스턴슬르 만들 필요가 없다.
	// 필드와 메소드 모두 static 하기 때문!
	
	// Math 클래스가 가지고 있는 모든 메소드는 static하기 때문에, API 문서를 보면 Math. 후에 메소드를 사용
}
