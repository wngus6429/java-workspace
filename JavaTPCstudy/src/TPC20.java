import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		// 부모클래스를 사용하지 않음.
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class 파일과 Cat.class 파일 소스를 몰라도
		// 부모를 알게 되면 이런식으로 사용 할수 있다.
		Animal ani = new Dog(); //upcasting(자동형변환)이 되는거지
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		// ani.night(); 이건 불가능
		((Cat)ani).night(); // ani타입을 cat 타입으로 바꿔서 해야함
		// 부모 타입을 자식 타입으로 바꿈, 다운 캐스팅. (강제형변환)
	}

}
