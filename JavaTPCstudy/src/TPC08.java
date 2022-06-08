public class TPC08 {
	// static�擽 �梭�牟�幣 �ｩ罷ｪｨ�ｦｬ �怱�乱 �豫�攵�ｰ��ｳ� main�擽 �ｰ俯糖�亨 﨑�囈﨑ｨ
	public static void main(String[] args) {
		int a =30;
		int b =60;
		int answer =add(a, b); // static method Call
		System.out.println(answer);
	} // static �ｰ卓乱 �螺�愍�ｩｴ �怱�乱 add �乱�洳��罹共.
	// �ｦ� static�擽�梳�ｱｴ 嵓�｡懋ｷｸ�棹�揆 �共嵂駕葺�ｸｰ���乱 �ｩ肥�罹糖�攪 �ｸｰ�ｳ�牟 �ｽ罷糖�･ｼ
	// �梵�徐�愍�｡� �ｩ罷ｪｨ�ｦｬ�乱 �｡罹畠�揆 �亨墲､�ｸｰ�怱﨑� 墲､�寥�糖
	// �ｷｸ�ｦｬ�ｳ� static zone �ｳ���簿頗 �怱�ｹ們乱 �梵�徐�愍�｡� �｡罹畠�揆 �据�ｲ� �ｧ誤糖�株 �溜﨑��揆 﨑罹共.
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
