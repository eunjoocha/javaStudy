package javaStudy;

public abstract class Car2 {
	public Car2(String name) {
		super(); // 자동으로 들어간다.
		System.out.println("Car2() 생성자 호출");
	}
	
	
	// 추상메소드 : 구현은 안 돼있고 선언만 되어있다.
	// run()은 자동차마다 다르게 구현
	public abstract void run(); 
}

//추상 클래스
//추상 클래스는 인스턴스가 될 수 없다.
//추상 클래스를 상속받는 자손이 인스턴스가 된다.
//abstract 키워드를 사용하여 클래스를 정의한다.
//추상 클래스는 보통 1개 이상의 추상 메소드를 가진다. (추상 메소드가 없어도 오류가 발생하지 않는다.)
//public abstract class 클래스명 { ...}