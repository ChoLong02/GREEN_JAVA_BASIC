package kiosk;


// 세트, 단품, 음료, 사이드 메뉴를 출력해주는 기능
public class PrintMenu {
	
	public void printSet() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 1.기본 세트(떡볶이 + 오뎅) 5500");
		System.out.println("▒▒ 2.커플 세트(떡볶이 + 오뎅 + 순대) 8500");
		System.out.println("▒▒ 3.가족 세트(떡볶이 + 오뎅 + 순대 + 튀김) 10000");
	}
	public void printSingle() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 1.떡볶이(3000)");
		System.out.println("▒▒ 2.오뎅(3000)");
		System.out.println("▒▒ 3.순대(3000)");
	}
	public void printDrink() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 1.코카콜라(1500)");
		System.out.println("▒▒ 2.스프라이트(1500)");
		System.out.println("▒▒ 3.쿨피스(1000)");
	}
	public void printSide() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 1.만두(1500)");
		System.out.println("▒▒ 2.모듬튀김(2000)");
		System.out.println("▒▒ 3.소세지(1500)");
	}
}
