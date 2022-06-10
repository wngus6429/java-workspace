package kr.poly;

public class TV implements RemoCon {
	int currCH = 70;
	public void chUp() {
		if (currCH < RemoCon.MAXCH) {
			currCH += 1;
			System.out.println("TV의 채널 올라감" + currCH);
		} else {
			currCH = 1;
			System.out.println("TV의 채널 올라감" + currCH);
		}
	}
	public void chDown() {
		if (currCH > RemoCon.MINCH) {
			currCH -= 1;
			System.out.println("TV의 채널 내려감" + currCH);
		} else {
			currCH = 100;
			System.out.println("TV의 채널 내려감" + currCH);
		}
	}
	public void internet() {
		System.out.println("인터넷이 된다");
	}
	
}
