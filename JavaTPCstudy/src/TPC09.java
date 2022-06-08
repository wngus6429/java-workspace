public class TPC09 {
	// �ｰ卓乱 �ｩ肥�誤糖 sum, static�擽 �螺�揆�亨 ��滝ｷｼ�ｰｩ�ｲ�
	public static void main(String[] args) {
		int a=56;
		int b=22;
		// int answer = sum(a,b);
		// �ｰ晧ｲｴ�･ｼ �ｩ罷ｪｨ�ｦｬ�乱 ��晧┳﨑ｴ��� �ｰ菩�罹｡� �豫��､�幣﨑ｨ. �ｷｸ�椈��� new�ぎ�圸
		// heap Area�乱 ��晧┳�勢
		TPC09 tpc = new TPC09();
		int answer = tpc.sum(a, b);
		System.out.println(answer);
	}
	public int sum(int a, int b) {
		int v=a+b;
		return v;
	}
}
