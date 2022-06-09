import kr.tpc.*;

public class TPC22 {
	public static void main(String[] args) {
		// upcasting
		// Cat ani = new Cat();
		// Object ani=new Cat();
		Animal ani = new Cat(); // upCasting
		ani.eat(); // 컴파일시점 -> Animal, 실행시점은->Dog
		
		// ani.night();
		// Cat c = (Cat)ani; // downCasting
		// c.night();
		((Cat)ani).night(); // 위에 2줄 축약버전
		
		ani=new Dog();
		ani.eat();
		// 다형성
		// 상위 클래스가 하위 클래스에게 동일한
		// 메세지로 서로 다르게 동작시키는 원리
		
		Object o = new Dog();
		// o.eat(); 위에 object가 dog의 부모가 맞기는한데.
		// 근데 object는 우리가 만든게 아니라 eat가 없지
		((Dog)o).eat(); //o를 Dog타입으로 바꿔서 찍기
		// 다운 캐스팅
 	}

}
