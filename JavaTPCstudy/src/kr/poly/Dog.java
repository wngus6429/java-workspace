package kr.poly;

public class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("개처럼 먹다.");
	}
	// 이름, 나이, 상태정보
	// 아래껀 생략되어 있음
	//	public Dog() {
	//		super() // 부모를 부른다. new Animal()
	//	}
}
