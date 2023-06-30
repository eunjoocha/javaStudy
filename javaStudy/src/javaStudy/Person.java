package javaStudy;

public class Person {
	String name; // 인스턴스 필드(static이 붙어 있지 않다.)
	String address;
	boolean isVip;
	
	static int count; // 클래스 필드
	static { // 클래스 필드는 static 블록에서 초기화할 수 있다.
		count = 100;
	}
	
	public void printName() { // 인스턴스 메소드
		System.out.println("내 이름은 : " + name);
	}
	
	public static void printCount() { // 클래스 메소드
		// System.out.println(name); // static한 메소드에서는 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없다.
		// 메모리에 생성되는 시점이 다르다. 클래스 메소드는 인스턴스가 없어도 사용 가능하지만 인스턴스 필드는 인스턴스가 있어야만 사용하기 때문이다.
		// 클래스 메소드가 실행되는 시점에서는 인스턴스 필드가 메모리에 없으니까 사용할 수 없다고 컴파일 오류가 발생한다.
		// 클래스 메소드(static 메소드) 안에서는 클래스 필드(static 필드)만 사용할 수 있다. 그 이유에 대해서 설명할 줄 알아야 한다.
		System.out.println("count : " + count);
	}
}
