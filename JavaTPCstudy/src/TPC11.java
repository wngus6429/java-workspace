import kr.bit.BookVO;

public class TPC11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookVO b = new BookVO();
		b.title="fundingCode";
		b.price=1000;
		b.company="what";
		b.page=100;
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page);
	}
}
