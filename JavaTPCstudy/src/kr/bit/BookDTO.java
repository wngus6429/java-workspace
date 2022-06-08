package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	// 디폴트 생성자 메서드(생략), 프로그램이 자동으로 해줌
	//	public BookDTO() {
	//	  // 객체를 생성하는 작업한다.(기계어코드)
	//		super();
	//	}
	// 마우스 오른쪽에서 source, Generate Constructor Using Field
	// 하면 자동으로 밑에께 생성이됨 ㅎㄷㄷ
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
