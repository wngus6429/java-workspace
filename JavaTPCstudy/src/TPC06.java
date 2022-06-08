package practice;

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
	// void는 리턴을 하지 않겠다는거
	// static 끼리 되어 있어야 바로 호출할수 있다. 
	// 서로 안되어 있어도 다른 방법이 있음. 다음에 설명
	// sum이라는 함수가 메모리에 있어야 main에서 호출할수 있다
	public static int sum(int a, int b) {
		int v = a + b;
		return v;
	}
	// 10, 20, 30 복수로 하고 싶을 경우
	// 근데 한개만 리턴 할수 있어서 return 10, 20, 30 이런 형태 안됨
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
