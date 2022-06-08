package practice;

import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		// 책 ㅡ> class(BookDTO) ㅡ> 객체 ㅡ> 인스턴스
		String title = "spring";
		int price = 25000;
		String company = "comcomm";
		int page = 8890;
		// dto(Object:객체), 
		BookDTO dto; // dto(instance:인스턴스)
		dto=new BookDTO(title, price, company, page); 
		// 이동하기
		bookPrint(dto);
	}
	public static void bookPrint(BookDTO dto) {
		System.out.print(dto.title+"\t");
		System.out.print(dto.price+"\t");
		System.out.print(dto.company+"\t");
		System.out.println(dto.page+"\t");
	}
}
