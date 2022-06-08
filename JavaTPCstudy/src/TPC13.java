import kr.bit.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		// �ｱ� 繞｡> class(BookDTO) 繞｡> �ｰ晧ｲｴ 繞｡> �攤�侃奓ｴ�侃
		String title = "spring";
		int price = 25000;
		String company = "comcomm";
		int page = 8890;
		// dto(Object:�ｰ晧ｲｴ), 
		BookDTO dto; // dto(instance:�攤�侃奓ｴ�侃)
		dto=new BookDTO(title, price, company, page); 
		// �擽�徐﨑俾ｸｰ
		bookPrint(dto);
	}
	public static void bookPrint(BookDTO dto) {
		System.out.print(dto.title+"\t");
		System.out.print(dto.price+"\t");
		System.out.print(dto.company+"\t");
		System.out.println(dto.page+"\t");
	}
}
