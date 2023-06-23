package javaStudy;

public class MathBeanTest {
	public static void main(String[] args) {
		// static이 붙은 메소드는 해당 메소드를 가진 클래스가 인스턴스가 되지 않더라도 사용 가능
		// JVM이 해당 메소드를 실행할 수 있다.
		
		MathBean math = new MathBean();
		// MathBean이 가지고 있는 메소드를 사용하려면 MathBean 인스턴스를 생성
		// new MathBean();
		// MathBean 인스턴스가 만들어지고, 메모리에 올라가게 된다.
		
		// MathBean 인스턴스는 Heap이라고 불리는 메모리에 올라간다.
		
		// 자바를 깊게 알려면 메모리 구조를 잘 알아야 한다.
		
		// JDK 버전에 따라 이 Heap 메모리 구조도 달라진다. 찾아보기!
		
		// 인스턴스를 참조 변수 math가 가리킨다.
		
		// TV 리모컨 = new TV();
		// 생성된 것은 TV 인스턴스인데 참조하는 것은 리모컨이라는 변수
		
		// 리모컨의 버튼을 누르면, 실제 TV인스턴스가 동작한다.
		
		// math.getOne(); 을 하면 math가 참조하는 MathBean 인스턴스의 메소드가 실행
		
		// 참조변수를 이용해 인스턴스를 다룬다.
		
		math.printClassName();
		math.printNumber(5000);
		int x = math.getOne();
		System.out.println(x);
		int value = math.plus(200, 300);
		System.out.println(value);
		
	}
}
