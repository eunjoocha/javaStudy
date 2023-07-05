package javaStudy;

public class Car {
	private String name; // 필드는 가지는 것
	
	// 생성자는 메소드와 비슷
	// return type이 없다.
	// 클래스 이름과 같아야 한다.
	// 매개변수가 0개인 생성자를 기본생성자라고 한다.
	// 생성자가 하나도 없으면 아무 일도 안하는 기본생성자가 자동으로 만들어진다.
	public Car() {
		System.out.println("자동차가 한 대 생성됩니다.");
	}
	
	// 이름을 가지고 인스턴스가 만들어지게 하고 싶다.
	public Car(String name) { // 로컬 변수
		this.name = name; // this.name : 필드
	}
	
	public void printName() {
		System.out.println("자동차 이름 : " + name);
	}
	
	public void run() {
		System.out.println("전륜구동으로 달리다.");
	}

	@Override
	public String toString() {
		return "자동차";
	}
}
