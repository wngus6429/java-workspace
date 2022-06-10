package kr.poly;

public abstract class Animal { 
	// 밑에 abstract때문에 추상클래스가됨 (불완전객체)
	// Animal ani = new Animal() 이게 안됨
	public abstract void eat(); // 추상메서드(불완전한메소드)
	public void move() { // 구현메소드
		System.out.println("무리를지어서 이동");
	}
}
