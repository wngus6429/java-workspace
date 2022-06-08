public class TPC07 {
	public static void main(String[] args) {
		int a = 20;
		float b = 56.7f;
		float v =sum(a, b); //Call by value �ｰ廷揆 ���峡﨑俯株 �ｰｩ�ｲ�
		System.out.println(v);
		// �ｧ､�ｰ罹ｳ���俯｡� �腰�ｧ壱阜 �ｰｯ��俯梠 夋��桿�擽 �ｧ樌符�幣﨑罹共.
		int[] arr = {1,2,3,4,5};
		int sumvalue = arrSum(arr); //Call by Reference(�ｲ溢ｧ�)
		System.out.println(sumvalue);
	}
	// �ｰ呷捩 增ｴ�椈�侃 甯護攵�譜�擽�攵��� private �椋��罹蕩�ｧ� 嶸ｸ�ｶ懍擽 �ｰ��冠﨑們ｧ�.
	private static int arrSum(int[] x) {
		int hap =0;
		for (int i = 0; i < x.length; i++) {
			hap += x[i];
		}
		return hap;
	}
	public static float sum(int a, float b) {
		float v =a+b;
		return v;
	}
}
