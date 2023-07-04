package javaStudy;

public class Book {
	private String title;
	private int price; // 필드변수

	public int getPrice() {
		return this.price * 2;
	}
	// 메소드가 길어지면 메소드에서 선언된 지역 변수인지 필드인지 착각할 수 있기 때문에 인스턴스 필드를 사용할 때는 this.price라고 적어 줄 수 있다.
	// this는 내 자신 인스턴스를 참조하는 예약어
	
	// this는 클래스 메소드(static 메소드)에서 사용 가능할까?
	// 클래스 메소드는 인스턴스가 생성이 되지 않아도 사용 가능하다.
	// 메모리에 생성되는 시점이 다르기 때문에 클래스 메소드에서는 this를 사용할 수 없다.
	
	public void setPrice(int price) { // 지역변수(메소드 안에 선언된 변수)
		this.price = price;
	}
	// price : 지역변수 / this.price : 인스턴스 변수
	// 매개변수로 받은 지역변수 price로 this.price를 초기화한다.

	// 필드의 값을 수정하고 얻기 위한 메소드를 만든다. setter, getter
	
	// setter, getter 메소드를 프로퍼티(property)라고도 말한다.
	// setPrice(), getPrice()를 price 프로퍼티라고 한다.
	
	// price 필드와 price 프로퍼티의 차이점에 대해 말할 수 있어야 한다.
	
	// price 필드 : 클래스가 가지는 것
	// price 프로퍼티 : 클래스의 setter, getter 메소드
	
	public String getName() {
		return title;
	}

	public void setName(String title) {
		this.title = title;
	}
	
	// Book 클래스는 몇 개의 프로퍼티를 가지고 있습니까?
	// title, price 2개를 가지고 있다.
	
	// setTitle(), getTitle()을 setName(), getName()으로 변경했다면 Book 클래스는 name 프로퍼티를 가지게 된다.
}
