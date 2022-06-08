public class TPC06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 67;
		int b = 89;
		int answer = sum(a, b);
		System.out.println(answer);
		int[] come = makeArr();
		int hap = 0;
		for (int i = 0; i < come.length; i++) {
			hap += come[i];
		}
		System.out.println(hap);
	}
	// void�株 �ｦｬ奓ｴ�揆 﨑們ｧ� �賦�ｲ��共�株�ｱｰ
	// static �⊂�ｦｬ �据�牟 �梭�牟�幣 �ｰ罷｡� 嶸ｸ�ｶ懦腹��� �梭�共. 
	// ��罹｡� �譜�据�牟 �梭�牟�巡 �共�･ｸ �ｰｩ�ｲ菩擽 �梭�搆. �共�搆�乱 �└�ｪ�
	// sum�擽�攵�株 﨑ｨ��俾ｰ� �ｩ罷ｪｨ�ｦｬ�乱 �梭�牟�幣 main�乱��� 嶸ｸ�ｶ懦腹��� �梭�共
	public static int sum(int a, int b) {
		int v = a + b;
		return v;
	}
	// 10, 20, 30 �ｳｵ��俯｡� 﨑俾ｳ� �狂�揆 �ｲｽ�垈
	// �ｷｼ�魂 﨑懋ｰ罹ｧ� �ｦｬ奓ｴ 﨑���� �梭�牟��� return 10, 20, 30 �擽�涓 嶸倣�� �譜�勢
	public static int[] makeArr() {
		int x = 10;
		int y = 20;
		int z = 30;
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		return arr;
	};
}
