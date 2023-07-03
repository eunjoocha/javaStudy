package com.example.main;

import com.example.util.Calculator;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int value = cal.plus(50, 100);
		System.out.println(value);
		
		com.example.util2.Calculator cal2 = new com.example.util2.Calculator();
		int value2 = cal2.divide(100, 50);
		System.out.println(value2);
	}
	// import는 JVM에게 어떤 패키지의 Calculator를 사용하게 할 것인지 알려주는 역할을 한다.
	// 메모리에 올리는 일을 하는 것은 아니다.
	// 동일한 이름의 클래스가 여러 패키지에 있을 수 있기 때문에 잘 구분해서 import하여 사용해야 한다.
	// 이름이 같은 클래스를 모두 import하고 사용하려고 하면 클래스 이름만 가지고는 어떤 package의 클래스를 사용할지 알 수 없다.
	// 같은 이름의 클래스를 사용할 땐, 하나는 import를 해서 사용하고 또 다른 하나는 클래스명 앞에 패키지명까지 붙여서 사용해야 한다.
}
