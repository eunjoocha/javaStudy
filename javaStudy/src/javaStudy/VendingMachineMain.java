package javaStudy;

public class VendingMachineMain {
	public static void main(String[] args) {
	// static이 붙은 메소드는 클래스 메소드
	// 클래스 메소드는 인스턴스를 생성하지 않고도 사용 가능
	// 메모리에 올라가 있는 것만 사용 가능한데 클래스 메소드는 인스턴스를 생성하지 않고도 메모리에 올라간다.
		
	// 폰노이만의 프로그램 내장 방식
	// 모든 프로그램은 메모리에 올라 가야지만 실행될 수 있다.
	
	// new를 사용해야 클래스가 메모리에 올라가서 인스턴스가 될 수 있다.
	// 인스턴스로 메모리에 올라가야 오브젝트라고 부를 수 있고 사용할 수 있다.
	
	// 메인 메소드 안에는 String 클래스도 사용 : VendingMachineMain은 String 클래스에 의존
//		VendingMachine vm1 = new VendingMachine();
		VendingMachine vm2 = new VendingMachine();
		// 메모리 상에 VendingMachine이 생성
		// vm1이라는 이름으로 가리키는 것
		
		// 메인 메소드가 동작하려면 VendingMachine이 필요
		// 해당 클래스가 main 메소드 안에서 사용되고 있기 때문이다.
		// 메인 메소드에서 VendingMachine을 사용하는데, VendingMachine 클래스가 존재하지 않는다면 컴파일 오류가 발생
		// VendingMachine 클래스가 있어야만 main 메소드는 컴파일되고 실행된다.
		// 그렇기 때문에 의존한다고 표현
		
		// VendingMachineMain 클래스는 VendingMachine 클래스에 의존
	
		// main 메소드가 없는 클래스는 실행되지 않기 때문에 VendingMachineMain이라는 클래스에서 main 메소드를 작성하고 VendingMachine 인스턴스를 생성
	
		// 클래스명 변수명　 = new 　　　 클래스명();
		// 참조타입 참조면수 = new 연산자 생성자 
		
//		String product = vm1.pushProductButton(100);
//		System.out.println(product);
		
		// 메뉴 아이디 100을 전달 받고, "콜라"가 리턴 
		// 리턴된 "콜라"는 product 변수가 참조하게 된다.
		// product의 값인 "콜라"가 출력되고 main 메소드가 종료되면서 자바 애플리케이션은 종료
		
		VendingMachine.printVersion();
		// static한 메소드는 클래스명 다음에 사용
		
		String product2 = vm2.pushProductButton(200);
		System.out.println(product2);
		
		// 자바에서 new 연산자를 사용하면 인스턴스가 생성
		// 인스턴스는 Heap이라는 메모리 영역에 올라간다.
		
//		VendingMachine vm1 = new VendingMachine();
// 		VendingMachine vm2 = new VendingMachine();
		// 위 코드가 실행되면 Heap 메모리에 2개의 인스턴스가 올라간다.
		
		// 자바 소스는 javac 명령을 통해 컴파일 된다.
		// javac VendingMachine.java
		// javac VendingMachineMain.java
		// 2개의 클래스를 컴파일 한 후 실행할 땐 main메소드를 가지고 있는 VendingMachineMain을 실행
		// java VendingMachineMain
		// IntelliJ가 아닌 터미널에선 위와 같이 실행해야 한다.
		// java 명령이 JVM(Java Virtual Machine)이다.
		// JVM이 VendingMachineMain을 실행해주게 된다.
		
		// JVM은 VendingMachineMain을 어디서 찾아서 실행할까?
		
		// javac를 이용해 컴파일을 하면, 소스 파일이 있던 곳에 class파일이 생성된다.
		// JVM이 클래스를 실행하려면, 일단 클래스를 찾아야 한다.
		// 현재 폴더?, out 폴더? 컴파일하는 위치 등은 다 틀린 대답이다.
		
		// java Hello.java 명령을 실행하면 Hello.class 파일이 생성된다.
		// java Hello 라고 하면 실행되었는데, 이 떄 JVM은 Hello를 java가 실행되는 경로에서 찾는다고 하면 틀린 답이다.
		// 현재 폴더에 Hello.class 파일이 있다 하더라도 현재 폴더에서 찾는다라고 하면 틀린 답이다.
		
		// JVM은 CLASSPATH 경로에서 Hello 클래스를 찾아서 실행한다.
		// CLASSPATH에 .(점)이 있을 경우 현재 경로에서 클래스를 찾을 수 있게 된다.
		
		// IntelliJ는 소스를 컴파일 하고 out/production/프로젝트 폴더 아래에 class 파일을 생성한다.
		// 해당 폴더를 IntelliJ는 CLASSPATH로 인식하게 해준다.
		
		// IntelliJ가 java로 실행할 때 -classpath라는 옵션을 준다.
		// 해당 옵션 뒤의 경로가 모두 CLASSPATH로 인식된다.
		
		// Hello 클래스는 classpath로 잡힌 경로를 찾아서 실행하게 된다.
		
		// JVM은 클리스를 어디서 찾습니까?
		
		// java VendingMachineMain
		// 위와 같이 실행하면 CLASSPATH에서 VendingMachineMain 클래스를 찾게 된다.
		// VendingMachineMain 클래스를 JVM은 읽어 들이고 읽어 들인 클래스 정보를 PERM 이라는 메모리 영역에 저장한다.
		// 클래스 자체에 대한 정보(인스턴스가 아님)가 PERM 영역에 올라가게 된다.
		
		// 클래스 정보가 PERM 영역에 올라가게 되면, JVM은 해당 클래스가 어떤 static 메소드를 가지고 있는지 인스턴스 메소드를 가지고 있는지 모두 알게 된다.
		// JVM은 프로그램 시작 점인 main 메소드를 찾게 된다.
		// 그리고 main 메소드를 실행하게 된다.
		// Java Stack이라고 불리는 메모리 영역에 실행된 메소드 정보가 올라가게 된다.
		// Stack은 FILO 자료구조라고 한다.
		// 먼저 들어간 자료가 가장 나중에 나온다.
		// JVM은 PERM 메모리에 올라가 있는 VendingMachineMain 클래스에서 main 메소드를 찾는다.
		// main 메소드를 찾고, 해당 메소들 정보를 Java Stack에 넣어 준다.
		// Java Stack에 저장된 메소드 실행 정보 하나를 스택 엔트리(Stack Entry)라고 한다.
		// main 메소드 안에 선언된 변수들은 스택 엔트리에 저장된다. 이러한 변수를 로컬(local) 변수라고 한다.
		// main 메소드의 argument인 String[] args도 스택 엔트리에 생성된다.
		// args 변수는 String 배열 타입이다.
		// main 메소드가 실행되면, Heap 메모리에 String 배열 인스턴스가 만들어지고 이 인스턴스를 args 변수가 참조하게 된다.
		// 스택 엔트리에는 프로그램 카운트라고 해서 몇 번째 줄을 실행하고 있는지 정보도 기억하고 있다.
		// 다음 줄을 실행할 때마다 프로그램 카운트는 증가한다.
		
		// VendingMachine.printVersion();
		// JVM은 위의 코드를 만나면 printVersion() 메소드는 static 메소드이기 때문에 실행 가능하다고 판단하고 실행해준다.
		// printVersion() 메소드가 실행되면 Java Stack에 스택 엔트리가 하나 더 추가된다.
		// printVersion() 메소드가 실행 후에 종료가 되면 해당 메소드의 실행 정보를 담고 있는 스택 엔트리는 자바 스택에서 제거된다.
		// 그리고 나서 main 메소드의 printVersion()을 호출한 다음 줄을 실행하게 된다.
		// VendingMachine vm1 = new VendingMachine();
		// VendingMachine 인스턴스가 Heap 메모리에 생성되고 스택 엔트리의 vm1 변수가 참조하게 된다.
		// pushProductButton() 메소드가 호출되면서 자바 스택엔 스택 엔트리가 생성된다.
		// 그리고 pushProductButton() 메소드에 선언된 변수 menuId가 스택 엔트리에 생성된다.
		// pushProductButton() 메소드가 실행되면서 menuId를 출력하고 "콜라" 문자열을 리턴한다.
		// pushProductButton() 메소드가 종료되면서 자바 스택에서 제거된다.
		// 그리고 pushProductButton() 메소드가 리턴한 값을 product에 저장하고 출력한다.
		// 다시 한 번 vm2의 pushProductButton() 메소드가 호출되고 product값을 출력하고 나서 main() 메소드가 종료된다.
		// main() 메소드가 종료되면서 main() 메소드의 실행 정보를 가지고 있는 스택 엔트리가 자바 스택에서 제거된다.
		// 자바 스택에는 더 이상 남아있는 스택 엔트리가 없게 된다.
		// 메소드 안에 선언된 변수를 지역 변수라 하고, 지역 변수는 메소드가 종료되면 사라진다.
		// 메소드 안에 선언된 지역 변수는 메소드가 실행될 때 생성되고 종료될 때 사라진다.
		// 같은 메소드를 동시에 열 번을 호출한다면 그 메소드 안의 지역 변수는 각각 다른 영역에 저장되어 사용된다.
		
		// 동시에 메소드가 호출되도 문제가 없다.
	}
}
