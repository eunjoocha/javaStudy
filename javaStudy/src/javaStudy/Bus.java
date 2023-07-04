package javaStudy;
//Bus는 자동차의 한 종류다.
public class Bus extends Car {
	public void run() {
		System.out.println("후륜구동으로 달린다.");
	}
	
	public void 안내방송() {
		System.out.println("안내방송하다.");
	}
}

// 자바는 유니코드를 사용하고 있기 때문에 클래스 이름, 메소드 이름, 변수 이름을 한글로 작성할 수 있다.