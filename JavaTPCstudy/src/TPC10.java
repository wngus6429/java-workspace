package practice;

import kr.bit.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		// int, float, char, boolean -> PDT,
		// 嵓�ｦｬ�ｯｸ寀ｰ�ｸ醐ム�桿
		int a = 10;
		// �ｱ��擽�攵�株 �梵�｣醐�菩揆 �ｧ誤豆�梵 --> 增ｴ�椈�侃�｡�
		// �ｰ晧ｲｴ ��晧┳
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
