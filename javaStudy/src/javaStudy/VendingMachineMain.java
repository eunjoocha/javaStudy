package javaStudy;

public class VendingMachineMain {
	public static void main(String[] args) {
	// static이 붙은 메소드는 클래스 메소드
	// 클래스 메소드는 인스턴스를 생성하지 않다고 사용 가능
	// 메모리에 올라가 있는 것만 사용 가능한데 클래스 메소드는 인스턴스를 생성하지 않다고 메모리에 올라간다.
		
	// 폰노이만의 프로그램 내장 방식
	// 모든 프로그램은 메모리에 올라 가야지만 실행될 수 있다.
	
	// new를 사용해야 클래스가 메모리에 올라가서 인스턴스가 될 수 있다.
	// 인스턴스로 메모리에 올라가야 오브젝트라고 부를 수 있고 사용할 수 있다.
	
	// 메인 메소드 안에는 String 클래스도 사용 : VendingMachineMain은 String 클래스에 의존
		VendingMachine vm1 = new VendingMachine();
		VendingMachine vm2 = new VendingMachine();
		// 메모리 상에 VendingMachine이 생성
		// vm1이라는 이름으로 가리키는 것
		
		// 메인 메소드가 동작하려면 VendingMachine가 필요
		// 해당 클래스가 main 메소드 안에서 사용되고 있기 때문이다.
		// 메인 메소드에서 VendingMachine을 사용하는데, VendingMachine 클래스가 존재하지 않는다면 컴파일 오류가 발생
		// VendingMachine 클래스가 있어야만 main 메소드는 컴파일되고 실해왼다.
		// 그렇기 때문에 의존한다고 표현
		
		// VendingMachineMain 클래스는 VendingMachine 클래스에 의존
	
		// main 메소드가 없는 클래스는 실행되지 않기 때문에 VendingMachineMain이라는 클래스에서 main 메소드를 작성하고 VendingMachine 인스턴스를 생성
	
		// 클래스명 변수명　 = new 　　　 클래스명();
		// 참조타입 참조면수 = new 연산자 생성자 
	}
}
