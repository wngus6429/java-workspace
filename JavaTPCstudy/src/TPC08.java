package practice;

public class TPC08 {
	// static이 있어야 메모리 위에 올라가고 main이 반드시 필요함
	public static void main(String[] args) {
		int a =30;
		int b =60;
		int answer =add(a, b); // static method Call
		System.out.println(answer);
	} // static 밑에 없으면 위에 add 에러난다.
	// 즉 static이란건 프로그램을 실행하기전에 메서드의 기계어 코드를
	// 자동으로 메모리에 로딩을 시키기위한 키워드
	// 그리고 static zone 고정된 위치에 자동으로 로딩을 되게 만드는 역할을 한다.
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
