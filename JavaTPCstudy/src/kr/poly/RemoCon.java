package kr.poly;
//객체생성 X, RemoCon r = new RemoCon()
public interface RemoCon { 
	// static final (상수) 밑에 상수임. 생략되어 있다.
	public int MAXCH = 100; // RemoCon.MAXCH
	public final static int MINCH = 1; // RemoCon.MINCH
//	int MAXCH = 100;
//	int MINCH = 1;
	// 위에 interface를 하면 
	// 밑에 기능에 전부 abstract가 자동으로 들어감
	public void chUp();
	public void chDown();
	public void internet();
}