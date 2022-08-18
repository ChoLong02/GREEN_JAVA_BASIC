package interfaces;

import java.util.Scanner;

public class ToyMain {
	public static void main(String[] args) {
		// 인터페이스를 활용한 다형성
		IToy mazinger = new MazingerToyImpl();
		IToy pooh = new PoohToyImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("토이팩토리");
		System.out.println("제작할 인형을 선택하세요.");
		System.out.println("1.로봇 마징가");
		System.out.println("2.곰돌이 푸우");
		System.out.print(">> ");
		int num = sc.nextInt();
		
		if(num == 1) {
			makeToy(mazinger);
		} else if(num == 2) {
			makeToy(pooh);
		}
	}
	
	public static void makeToy(IToy toy) {
		System.out.println("인형 제작 Start");
		System.out.println("=>");
		System.out.println("==>");
		System.out.println("===>");
		System.out.println("인형 제작 End");
	}
}
