package kr.bit;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	// �粕尞ｴ孖ｸ ��晧┳�梵 �ｩ肥�罹糖(��晤楫), 嵓�｡懋ｷｸ�棹�擽 �梵�徐�愍�｡� 﨑ｴ�､�
	//	public BookDTO() {
	//	  // �ｰ晧ｲｴ�･ｼ ��晧┳﨑俯株 �梠�羅﨑罹共.(�ｸｰ�ｳ�牟�ｽ罷糖)
	//		super();
	//	}
	// �ｧ溢垈�侃 �丶�･ｸ�ｪｽ�乱��� source, Generate Constructor Using Field
	// 﨑俯ｩｴ �梵�徐�愍�｡� �ｰ卓乱�ｻ� ��晧┳�擽�勢 繞弱┨繖ｷ
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
