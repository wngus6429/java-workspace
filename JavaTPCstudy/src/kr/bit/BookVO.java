package kr.bit;
// 책(오브젝트), 제목, 가격, 출판사, 페이지수
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	// 디폴트 생성자는 생략되어 있다.
	// 근데 밑에와 같이 생성자가 정의되어 있어서, 밑에 생성자가 없으면
	// 디폴트 생성자가 생성되어 있겠지. 맨밑에 생성자 저렇게 있으면
	// 디폴트 생성자를 바로 밑에와 같이 만들어주는거지.
	public BookVO() {
		//초기화작업
		this.title = "java";
		this.price = 1000;
		this.company = "easy";
		this.page = 99;
	}
	// 객체지향에서는 메서드의 이름이 같은게 복수 있어도 문제가 없음
	// 대신에 매개변수의 갯수 혹은 타입이 달라야한다.
	// 매개변수 이름은 아무거나 가능 순번만 맞으면되니
	// 생성자 메서드의 중복정의 (오버라이딩)
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
