package javaStudy;

public class CarExam01 {
	public static void main(String[] args) {
		Bus b1 = new Bus();
		b1.run();
		// b1.안내방송();
		
		Car c1 = new Bus(); // 버스는 자동차다.
		c1.run();
		// c1.안내방송(); // 사용불가
		// 참조 타입의 메소드만 사용 가능해서 컴파일 오류 발생
		Bus b2 = (Bus)c1; // c1이 참조하는 것을 Bus 타입으로 b2도 참조하라
		// c1이 참조하는 Bus 인스턴스를 Bus타입으로 변환해서 b2가 참조하게 하라는 의미
		b2.안내방송();
		// c1이 참조하는 Bus 인스턴스를 원래의 Bus 형태로 참조해서 사용하겠다고 선언하는 것
		
		Car c2 = new SuperCar();
		c2.run();
	}
	// 버스는 후륜구동으로 달리도록 구현해 놨기 때문에 버스를 자동차라고 불러도 버스는 후륜구동으로 달린다.
	
	// ★★★★★메소드가 오버라이딩되면 무조건 자식의 메소드가 실행된다.
	// Car도 public void run() 메소드를 가지고 있고, Bus도 public void run() 메소드를 가지고 있어도 Bus의 run() 메소드가 실행된다.
	
	// 자식 인스턴스틑 부모 타입의 참조 변수로 참조하는 것은 당연히 가능하다. 
	// Car c2 = new 이층버스()도 문제없다.
	
	// c1은 Car 타입이기 때문에 Bus 타입의 b2로 참조하게 하려면 (Bus)를 붙여저서 c1이 참조하는 것이 (Bus)로 참조할 수 있어 프로그래머인 내가 보증해라는 의미로 붙여줘야 한다.
}
