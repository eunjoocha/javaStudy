package javaStudy;

public class User {
	private String email;
	private String password;
	private String name;
	
	// 생성자를 하나라도 만들게 되면 기본 생성자가 자동으로 안만들어진다.
	public User(String name, String email) {
		// System.out.println("hello"); // 오류
		this(name, email, null);
		// this생성자는 super생성자를 제외하고 첫 줄에 있어야 한다.
	}

	// 생성자 오버로딩 : 생성자는 매개변수의 개수가 다르거나, 타입이 다르다면 여러개 가질 수 있다.
	// 매개변수의 순서를 맞추는 것이 좋다.
	public User(String name, String email, String password) {
		this.email = email;
		this.password = password;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + "]";
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}
	
	// getter만 가지고 있는 객체 : 불변(Immutable) 객체 (ex. String)
	// String이 가지고 있는 모든 메소드는 String 내부의 값은 변화시키지 않는다.
	
	// 생성자
//	인스턴스를 생성할 때 사용
//	어떤 값을 가지고 인스턴스가 만들어지게 하고 싶다면 생성자를 사용
//	클래스 작성 시 생성자를 하나도 만들지 않았다면 자동으로 기본 생성자가 생성
//	기본 생성자는 매개변수를 하나도 받지 않는 생성자
	
	// 개발자 입장이 아니라 사용자 입장에서 개발
	
	// 자신의 생성자를 호출할 때는 this()를 사용
	// this는 인스턴스 자기 자신을 참조할 때 사용하는 키워드
	// this() 생성자는 자기 자신의 생성자
	// this() 생성자는 생성자 안에서만 사용 가능
	// this() 생성자는 생성자 안에서 super() 생성자를 호출하는 코드 다음이나, 첫번째 줄에 위치해야 한다.
}
