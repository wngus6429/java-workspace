import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		// eat() -- 재정의(override), 
		// 안하면 부모의 ? 가 나온다. 다형성보장이 안됨
		// 추상클래스는 부모의역할을 위해 존재. 명령을 내리기위해 (Animal.java)
		Animal ani = new Dog();
		ani.eat(); // 동적 바인딩이 되어서 Dog.eat가 실행이된다.
		ani.move();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		ani = new Cat();
		ani.eat();
		ani.move();
		((Cat)ani).night(); // 다운캐스팅
	}
}
