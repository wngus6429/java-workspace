package practice;

public class TPC09 {
	// 밑에 메소드 sum, static이 없을시 접근방법
	public static void main(String[] args) {
		int a=56;
		int b=22;
		// int answer = sum(a,b);
		// 객체를 메모리에 생성해서 강제로 올려야함. 그래서 new사용
		// heap Area에 생성됨
		TPC09 tpc = new TPC09();
		int answer = tpc.sum(a, b);
		System.out.println(answer);
	}
	public int sum(int a, int b) {
		int v=a+b;
		return v;
	}
}
