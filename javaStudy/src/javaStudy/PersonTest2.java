package javaStudy;

public class PersonTest2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "장원준";
		p2.name = "정수빈";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.count);
		System.out.println(p2.count);
		p1.count++;
		System.out.println(p1.count);
		System.out.println(p2.count);
		p2.count++;
		System.out.println(p1.count);
		System.out.println(p2.count);
		
		System.out.println(Person.count);
		
		// java 명령으로 클래스를 실행하는데, 이 java 명령이 JVM이다. JVM은 CLASSPATH에서 클래스를 찾아 실행한다.
		// JVM은 Person 클래스가 CLASSPATH에 있는지 찾아보고 클래스를 찾을 수 없으면 ClassNotFoundException 오류를 발생한다.
		// Person 클래스 정보를 읽어 들일 때 static한 필드는 정적 영역에 따로 저장된다.
		// Person이 가지고 있는 count 변수는 별도로 저장되고 0으로 초기화된다.
		// count 변수는 인스턴스 별로 가지는 것이 아니라 정적 영역에 따로 저장된다.
		// 인스턴스를 만들지 않아도 Person을 JVM이 읽어 들일 때 count 변수는 메모리에 올라간다.
		// static한 필드는 클래스명.필드명 형식으로 사용한다.
	}
}
