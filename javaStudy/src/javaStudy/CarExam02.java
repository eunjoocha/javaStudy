package javaStudy;

public class CarExam02 {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1);	// println(Object x) - Object로 참조할 수 있는 것은 무엇이든 받을 수 있다.
		// Object 자손들은 이 메소드 의 매개변수로 모두 올 수 있다. 
		// javaStudy.Car@15db9742
		// Ctrl+Open Declaration
		System.out.println(c1.toString());
	}
}

// 부모 타입의 변수로 자식 인스턴스를 찹조할 수 있다.
// 조상 타입의 변수로 후손 인스턴스를 참조할 수 있다.
// Car c1 = new Bus(); // Bus는 Car의 자식이면 오류가 안난다.
// Car c2 = new 이층버스(); // 이층버스는 Car의 자손이다.
// Object o1 = new Car();
// Object o2 = new Bus();
// Object 03 = new 이층버스();
// System.out.pinrln(o1.toString()); == System.out.println(o1);

// equals() : 같은 값인지 비교할 때의 기준이 필요해서 반드시 오버라이딩해야 한다.
// hashcode()