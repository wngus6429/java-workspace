package kr.tpc;

public class Inflern {
	// static 이 다 붙어 있으면 생성자를 쓸 필요가 없으므로
	// private를 박아주는게 좋다.
	private Inflern() {}
	// 인스턴스 메서드
	public static void tpc() {
		System.out.println("TPC, Fucking Fun");
	}
	// 클래스메서드
	public static void java() {
		System.out.println("Java lecture Very Fun");
	}
	// 인스턴스 메서드, 밑에 static이 없는 상태라서 
	// 위에 public Inflern(){} 해줘야함
	// public void FFack() {
	//    System.out.println("TPC, Fucking Fun");
	// }
}
