package projects;


// DAO: Data Access Object
//  - 데이터 등록, 수정, 삭제, 조회, 검색
// DTO: Data Transfer Object
//  - 

public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private int age;
	private String addr;
	
	전역변수
	생성자(default)
	생성자(2)
	생성자(3)
	getter()
	setter()
	출력()
	
	public MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public MemberDTO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	MemberDTO(5개) {
		
	}
	
	
}