package basic;

public class JavaStaticUse {
	public static void printName(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {  //
		// JavaStatic javaStatic = new JavaStatic();
		JavaStatic.name = "체리";
		System.out.println(JavaStatic.BANK_GOLD);
		
		printName("그린컴퓨터");
	}
}


// 객체생성 => heap영역 인스턴스 만들어짐
// static => OS영역 값이 생성
