package javaStudy;

public class MyMath {
	// 자동생성 - 기본 생성자는 생성자가 없을 경우 컴파일 할 때 자동으로 생성된다.
	
	public MyMath() {
		
	}
	// 생성자는 메소드와 비슷한데 생성자는 리턴 타입이 없고 이름이 클래스 명과 같아야 한다.
	// 프로그래머가 생성자를 만들지 않았다면, 기본적인 생성자가 자동으로 만들어진다.
	// 자동으로 생성자가 만들어졌기 때문에 new MyMath() 코드가 컴파일 오류가 발생하지 않는다.
	// 생성자를 정의할 때 작성되어 있는 public은 어디 서든 접근 가능하다는 의미
	// public을 private라고 변경하면 클래스 안에서만 사용 가능
	// 생성자가 private : 인스턴스 생성을 못하게 한다는 의미
	// 인스턴스를 생성하지 못하면 인스턴스 메소드들은 사용할 수 없다.
	// 단, static이 붙은 클래스 메소드만 사용 가능하다.
	
	// Math 클래스를 만든 사람은 여러 개 인스턴슬르 생성하지 못하게 함으로써 메모리를 절약할 수 있도록 하고 Math.메소드() 형식으로 쉽게 호출하도록 만들었다.
	public static int abs(int x) {
		if(x < 0)
			return x * -1;
		else
			return x;
	}
}
