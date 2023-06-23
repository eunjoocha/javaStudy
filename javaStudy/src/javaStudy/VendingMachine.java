package javaStudy;

public class VendingMachine {
	// 필드 : 가지는 것들
	// 생성자
	// 메소드 : 기능 
	public String pushProductButton(int menuId) {
		System.out.println(menuId + "를 전달받았습니다. ");
		return "콜라";
	}
	// VendingMachine에 추가된 메소드를 VendingMachineMain의 main메소드에서 레퍼런스 변수를 이용해 호출
}
