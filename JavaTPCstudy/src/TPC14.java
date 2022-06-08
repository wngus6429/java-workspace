import kr.bit.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		MemberVO m = new MemberVO();
		
		m.setName("주현님");
		m.setAge(50);
		m.setTel("010-2551");
		m.setAddr("이타바시");
		System.out.print(m.getName() + "\t");
		System.out.print(m.getAge() + "\t");
		System.out.print(m.getTel() + "\t");
		System.out.print(m.getAddr() + "\t");
	}
}
