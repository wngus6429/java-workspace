package practice;

import kr.tpc.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		// int, float, char, boolean -> PDT,
		// 프리미티브타입
		int a = 10;
		// 책이라는 자료형을 만들자 --> 클래스로
		// 객체 생성
		BookDTO b = new BookDTO();
		b.title = "kuso";
		b.price = 1999;
		b.company = "blackcompany";
		b.page = 10;
		System.out.print(b.title+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page);
	}

}
