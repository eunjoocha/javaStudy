package javaStudy;

public class Bus2 extends Car2 {
	public Bus2() {
		super("BUS!"); // 자동으로 들어간다.
		// 부모의 기본 생성자를 호출하는 코드가 자동으로 삽입된다.
		System.out.println("Bus2 기본생성자");
	}
	// 부모가 가지고 있는 추상 메소드는 자식에서 반드시 구현을 해줘야 한다.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("후륜 구동으로 동작");
	}
}

// 부모의 생성자를 호출할 때는 super()를 사용
// super는 인스턴스 부모를 참조할 때 사용하는 키워드
// super() 생성자는 부모 생성자를 의미
// super() 생성자는 생성자 안에서만 사용 가능
// super() 생성자는 생성자 안에서 첫번째 줄에만 올 수 있다.
// 생성자는 무조건 super() 생성자를 호출해야 한다. 사용자가 super() 생성자를 호출하는 코드를 작성하지 않았다면 자동으로 부모의 기본 생성자가 호출된다.
// 부모 클래스가 기본 생성자를 가지고 있지 않다면, 사용자는 반드시 직접 super() 생성자를 호출하는 코드를 작성해야 한다.