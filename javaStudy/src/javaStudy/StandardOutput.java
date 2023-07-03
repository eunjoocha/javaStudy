package javaStudy;

public class StandardOutput {
	public void println(boolean b) {
		System.out.println(b);
	}
	
	public void println(int i) {
		System.out.println(i);
	}
	
	public void println(double d) {
		System.out.println(d);
	}
	
	public void println(String s) {
		System.out.println(s);
	}
	
	// java StandardOutput
	public static void main(String[] args) {
		StandardOutput output = new StandardOutput();
		output.println(100);
		output.println("hello");
		output.println(10.5);
		output.println(false);
	}
	// 객체를 만들 땐 어렵게 만들어도, 사용하는 사람은 쉽게 쓸 수 있도록 만들어야 한다.
}	
