package javaStudy;

public class Exam01 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.i);
		p1.printI();
		System.out.println("--------------");
		Child c1 = new Child();
		System.out.println(c1.i);
		c1.printI();
		System.out.println("--------------");
		Parent p2 = new Child(); // 오류가 나지 않는 이유는 Child는 Parent의 자식
		System.out.println(p2.i); // 5
		p2.printII();
		p2.printI(); // 15
	}
}

// 메소드는 오버라이드 되면 무조건 자식의 메소드가 실행된다.
// Parent 타입으로 참조하지만 메소드는 오버라이딩 되었기 때문에 자식의 printI() 메소드가 실행되고
// 자식의 printI() 메소드는 자식의 i값을 출력해서 15가 출력된다.
// 필드는 타입의 것을 사용하기 때문에 5가 출력된다.

// 필드가 오버라이딩 되서 자식의 값이 사용된다면 부모 클래스를 만든 사람이 예상하지 못한 결과가 출력될 것이다.
// 그렇기 때문에 필드는 타입을 따라간다.

// 필드는 Type을 따라가고, 메소드는 오버라이딩된 자식의 메소드가 실행된다.

// 메소드 오버라이딩만 기억한다.
// 메소드가 오버라이딩 되면 무조건 자식의 것이 실행된다만 기억하면 된다.

// 정보은닉(information hiding)은 객체지향의 중요한 기법이다.
// 중요한 필드는 은닉하고, 필드는 메소드를 통해서만 접근해서 사용하도록 한다.
// 필드를 은닉한다.(외부에서 필드에 접근하지 못하도록 한다.)

// System.out.println(p1.i);
// 필드를 직접 접근하는 코드는 좋은 코드가 아니고 메소드를 통해 접근해야 한다.
// 객체 지향 문법 중 접근 지정자를 사용해서 은닉하게 된다.

// 앞으로 클래스를 만들 때 정보를 외부에 드러나지 않도록 하는 기법들에 대해 배우게 될 것인데 이것은 마치 신호등을 세우는 것과 비슷하다.
// 신호등을 세워 제어를 하는 것처럼 객체 지향 문법을 이용해서 좋은 객체를 만들어야 한다.
