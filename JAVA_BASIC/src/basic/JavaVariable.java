package basic;

// 변수: 하나의 값을 저장할 수 있는 메모리 공간

// 자료형(데이터 타입)
//  1.기본자료형(8가지)
//   - short, byte, int, long
//   - float, double
//   - char
//   - boolean

//  2.객체자료형
//   - Class
//   - Array
//   - String
//   - 기본자료형을 제외한 모든 자료형은 "객체자료형"

public class JavaVariable {
	public static void main(String[] args) {
		// 문법: 변수 선언 및 초기화
		// int num; : 변수 선언
		// num = 4; : 변수 초기화
		
		// = : 대입연산자(우측에 있는 값을 좌측에 담음)
		// == : 동등연산자(같다, equal)
		int num = 4;
		
		int num2;
		num2 = 10;
		num2 = 50;
		
		// 상수: 한번 선언하면 바꾸지 않는 값
		// 상수는 "final" 키워드를 사용
		// 상수는 선언 + 초기화 문법으로만 사용 가능
		final double pi = 3.14;
		pi = 3.15;
	}
}










