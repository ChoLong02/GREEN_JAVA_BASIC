package basic;

// 함수
// : 자주 사용하는 기능
//  - JAVA제공: 내장함수(built-in function)
//  - 직접 개발: 사용자 정의 함수
//  - 다른 사람개발: 외장함수(라이브러리) : import 라이브러리명

// 함수 사용하는 방법
// 1.함수 정의
// 2.함수 호출

// 함수가 끝나는 지점
// 1. }
// 2. return

// return
// 1.데이터 반환 타입: return 변수 or 값  ★데이터반환타입과 동일
// 2.return 만 단독으로 사용 가능
//   - 데이터 반환 X, 함수 종료(= })
public class JavaMethod {
	
	// () X, return X
	public static void printJoin() {
		System.out.println("회원가입을 축하합니다.");
		
		return;
	}
	
	// () O, return O
	public static int printName(String name) {
		System.out.println(name + "회원님 가입을 축하합니다.");
		int num = 1;
		return num;  // 1
	}
	
	public static void main(String[] args) {
		printJoin();
		int result = printName("그린컴퓨터학원");
		System.out.println("끝");
	}
}
