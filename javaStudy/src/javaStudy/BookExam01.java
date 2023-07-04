package javaStudy;

public class BookExam01 {
	public static void main(String[] args) {
		Book b1 = new Book();
//		b1.price = 100;
//		System.out.println(b1.price); // private는 직접 접근하지 못한다.
		// 필드를 직접 접근하는 것은 정보 은닉 관점에서 좋지 않다.
		// 외부에서 접근하지 못하도록 public 접근제한자를 private 접근제한자로 수정한다.
		b1.setName("즐거운 자바");
		b1.setPrice(500);
		System.out.println(b1.getPrice());
		System.out.println(b1.getName());
	}
}
