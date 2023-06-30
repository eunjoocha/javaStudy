package javaStudy;

public class PersonTest3 {
	public static void main(String[] args) {
		System.out.println(Person.count);
		Person.printCount();
		
//		System.out.println(Person.name);
//		Person.printName();
		// 인스턴스가 만들어지지 않으면 사용할 수 없다.
		Person p1 = new Person();
		p1.name = "정수빈";
		
		p1.printName();
		Person.printCount();
		
		Person.count++;
		Person.printCount();
		
		// JVM은 Person 클래스 정보를 읽어 들일 때 Person이 가지고 있는 클래스 필드와 클래스 메소드를 사용 가능하도록 메모리에 올리게 된다.
		
	}
}
