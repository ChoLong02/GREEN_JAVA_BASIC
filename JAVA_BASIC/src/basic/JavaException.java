package basic;

// 예외처리
// 1.예외: 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로
//        인해 발생하는 프로그램 오류
//   - 프로그램 실행 중에 발생하는 예외적인 상황!
//   - 예외는 단순한 문법오류가 아닌 실행 중간에 발생하는 정상적이지 않은 상황

//   - 프로그램 실행 시 예상치 못한 일로 예외가 발생하면, 프로그래머가
//     원하는 방향으로 움직이도록 만드는 일(예외처리)
//   - JVM(Java Virtual Machine) : JAVA 프로그램 실행
//     JVM은 예외가 발생하면 내용을 간단히 출력, 프로그램 종료


// 실행예외 종류
//  1.NullPointerException
//    : Null 값을 갖는 데이터가 있을 때
//  2.ArrayIndexOutOfBoundException
//    : 배열에서 인덱스 범위를 초과하여 사용하는 경우
//  3.NumberFormatException
//    : 문자열 데이터를 숫자로 변경하는 경우
//  4.ClassCastException
//    : 타입변환은 상위클래스와 하위클래스 간에 발생

// 예외가 발생했을 때 방법
// 1.try~catch 구문(예외 처리)
//  - try: 예외가 발생할 수도 있는 부분
//  - catch: 예외가 발생했을 때 어떻게 처리할것인가 결정
//  - finally: 예외가 발생하든 안하든 무조건적으로 실행

// DB 작업
// 1.try(Connection, 데이터 입력)
// 2.catch(예외가 발생했을 때 이케 하세요)
// 3.finally(Connection 끊음)

// try~catch or try~catch~finally

// try~catch~fianlly 순서

// 정상: try -> finally
// 비정상: try -> catch -> finally

// 2.throw(예외 강제발생)

// 3.throws(예외 전가)

// 4.사용자 정의 예외

//메인 클래스
// - main()  ---> MemberDAO 클래스
//              - memberJoin()함수 호출 



public class JavaException {
	public static void main() {
		try {
			// 예외가 발생 할 수도 있는 부분
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
