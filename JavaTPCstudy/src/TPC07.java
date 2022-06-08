package practice;

public class TPC07 {
	public static void main(String[] args) {
		int a = 20;
		float b = 56.7f;
		float v =sum(a, b); //Call by value 값을 전달하는 방법
		System.out.println(v);
		// 매개변수로 던질때 갯수랑 타입이 맞아야한다.
		int[] arr = {1,2,3,4,5};
		int sumvalue = arrSum(arr); //Call by Reference(번지)
		System.out.println(sumvalue);
	}
	// 같은 클래스 파일안이라서 private 언제든지 호출이 가능하지.
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
