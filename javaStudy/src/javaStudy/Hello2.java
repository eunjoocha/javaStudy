package javaStudy;

public class Hello2 {
	static int i;
	static {
		i = 500;
		System.out.println("static block"); // 원래는 static field를 초기화한다.
	}
	public static void main(String[] args) { // static에서 Hello2 인스턴스를 만들지 않아도 실행 가능하다.
		System.out.println("Hello");
	}
}

// javac Hello2.java
// java Hello2


// Hello2.java 소스를 컴파일하고 java로 실행을 하면, JVM은 CLASSPATH에서 Hello2 클래스를 찾게 된다.
// Hello2 클래스를 찾고 이 클래스를 읽어 들여서 그 정보를 메모리에 올리게 된다.
// 클래스 필드(static 필드)나 클래스 메소드(static 메소드)는 실행 가능한 상태가 되도록 한다.
// 클래스 필드는 static 블록에서 초기화 할 수 있다.
// static 블록에서 "static block"을 출력하는 코드를 작성한다.
// main 메소드가 실행되기 전에 static 블록 안의 코드가 실행되는 것을 이용한 프로그래밍을 할 수도 있다.

// new 연산자를 사용할 때마다 메모리에 인스턴스가 생성된다.
// 인스턴스는 더 이상 참조되는 것이 없을 때, 나중에(언제 될지는 모른다. 보통 메모리가 부족할 때) 가비지 컬렉션(Garbage Collection)된다.
// static한 필드는 클래스가 로딩될 때 딱 한 번 메모리에 올라가고 초기화된다.
// 인스턴스 메소드(static이 안붙은 메소드)는 인스턴스를 생성하고나서 레퍼런스 변수를 이용해 사용할 수 있다.
// 클래스 메소드는 클래스명.메소드명() 으로 사용가능하다.
// 메소드 안에 선언된 변수들은 메소드가 실행될 때 메모리에 생성되었다가, 메소드가 종료될 때 사라진다.