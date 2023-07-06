package javaStudy;

public class Car2Exam02 {
	public static void main(String[] args) {
		// Car2 c = new Car2(); // Car2는 추상클래스가 인스턴스가 안돼서 오류
		Bus2 b = new Bus2();
		b.run();
		
		SportsCar s1 = new SportsCar("스포츠카");
		s1.run();
	
		//Car2 c =......;
		//c.run(); // 어떤 결과가 나올까요?
		// 결과는 알수 없다.
		// Car2는 추상 클래스라 ...에 자식만 나올 수 있다. new Car2는 불가
		// 컴파일러는 c라는 변수가 어떤 인스턴스를 참조하는지 모른다면 실행되기 전까지 run 메소드 결과를 알 수 없다
		// java와 같이 실행 이후에 알 수 있는 언어가 동적인 언어
		
		System.out.println("-----------");
		Car2[] array = new Car2[2]; // Car2를 2개 참조할 수 있는 배열을 선언
		// Car2의 자식들을 참조할 수 있는 배열
		// Object 배열은 Object의 자식들을 모두 참조할 수 있는 배열
		array[0] = new Bus2();
		array[1] = new SportsCar("sportsCar");
		for(Car2 c2 : array) {
			c2.run();
		}
		// 일반화 시킨다와 추상 클래스를 고민해보기
	}
}
