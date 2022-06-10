package kr.poly;

public class Radio implements RemoCon {
	public void chUp() {
		System.out.println("Radio의 채널 올라감");
	}
	public void chDown() {
		System.out.println("Radio의 채널 내려감");
	}
	public void internet() {
		System.out.println("Radio 는 인터넷이 안된다");
	}
	
}
