import kr.bit.MemberVO;

public class TPC15 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO("홍길동", 40, "101011-10101", "서울");
		// setter메서드가 필요 없는 이유는 생성자메서드에서 값을 받아서 저장했기 때문
		System.out.println(m.toString());
		MemberVO m1=new MemberVO();
		m1.setName("나길동");
		m1.setAge(34);
		m1.setTel("010-2551-424");
		m1.setAddr("진주");
		
		System.out.print(m1.getName()+"\t");
		System.out.print(m1.getAge()+"\t");
		System.out.print(m1.getTel()+"\t");
		System.out.println(m1.getAddr()+"\t");
		
		System.out.println(m1.toString());
		System.out.println(m1);
	}
	
}
