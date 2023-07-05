package javaStudy;

public class UserExam {
	public static void main(String[] args) {
		User user = new User("김재환", "DOOSAN@NAVER.COM");
		// 생성자가 없으면 기본 생성자가 만들어지기 때문에 오류가 발생하지 않는다.
//		System.out.println(user.getName());
//		System.out.println(user.getEmail());
		System.out.println(user); // user의 toString() 메소드가 자동 호출
		
		User user2 = new User("홍길동", "h@naver.com", "1234");
		System.out.println(user2.getName());
		System.out.println(user2.getEmail());
		System.out.println(user2.getPassword());
		System.out.println(user2);
	}
}
