package kiosk;

import java.util.Scanner;

public class KioskMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintMenu printMenu = new PrintMenu();
		
		// 배열을 활용해서 메뉴표와 가격표
		String [] nameSet = {"기본세트", "커플세트", "가족세트"};
		String [] nameSingle = {"떡볶이", "오뎅", "순대"};
		String [] nameDrink = {"코카콜라", "스프라이트", "쿨피스"};
		String [] nameSide = {"만두", "모듬튀김", "소세지"};
		
		int [] priceSet = {5500, 8500, 10000};
		int [] priceSingle = {3000, 3000, 3000};
		int [] priceDrink = {1500, 1500, 1000};
		int [] priceSide = {1500, 2000, 1500};
		
		String [] nameOrder = new String[10];  // 주문기록: 이름
		int [] priceOrder = new int[10];       // 주문기록: 가격
		
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 상무 떡볶이 1호점");
		System.out.println("▒▒   Version 1.0");
		System.out.println("▒▒   Written by ChoLong02");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("MSG: 상무떡볶이 1호점을 방문해주셔서 감사합니다.");
		System.out.println("MSG: 주문하고싶은 메뉴를 선택하세요.");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 1.세트메뉴");
		System.out.println("▒▒ 2.단품");
		System.out.println("▒▒ 3.음료");
		System.out.println("▒▒ 4.사이드");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		 
		int num;
		while(true) {
			System.out.print("번호 >> ");
			num = sc.nextInt(); 
			
			if (num < 1 || num > 4) { 
				System.out.println("MSG: 1~4의 값만 입력해주세요.");
			} else {
				break;
			} 
		} 
		
		if(num == 1) {          // 세트메뉴
			printMenu.printSet();
		} else if (num == 2) {  // 단품
			printMenu.printSingle();
		} else if (num == 3) {  // 음료
			printMenu.printDrink();
		} else if (num == 4) {  // 사이드
			printMenu.printSide(); 
		} 
		while(true) {
			System.out.print("번호 >> ");
			int select_num = sc.nextInt(); 
			
			if(select_num < 1 || select_num > 3) {
				System.out.println("MSG: 1~3의 값만 입력해주세요.");
			} else {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 저장 된 메뉴와 가격표 출력
		for (int i = 0; i < nameOrder.length; i++) {
			System.out.println(nameOrder[i]);
		}
		
		
		for (int i : priceOrder) {
			System.out.println(priceOrder[i]);
		}
		
		
		
		
		
	}
}
