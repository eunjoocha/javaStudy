package javaStudy;

public class PersonTest {
	public static void main(String[] args) {
		Person p1; // p1은 null이다.
		p1 = new Person();
		
		p1.name = "김재환"; // 문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있다. 되도록 new를 사용하지 말자(String 사용법)
		p1.address = "잠실";
		p1.isVip = true;
		
		Person p2 = new Person();
		
		p2.name = "양의지";
		p2.address = "서울";
		p2.isVip = true;
		
		System.out.println(p1.name);
		System.out.println(p1.name.length());
		System.out.println(p1.address);
		System.out.println(p1.address.length());
		System.out.println(p1.isVip);
		System.out.println("-------------");
		System.out.println(p2.name);
		System.out.println(p2.name.length());
		System.out.println(p2.address);
		System.out.println(p2.isVip);
	}
}
