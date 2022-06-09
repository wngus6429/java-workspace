import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		Animal ani = new Dog(); //upCasting
		ani.eat();
		
		ani=new Cat();
		ani.eat();
		// ani.night();
		// Cat cc = (Cat)ani;
		// cc.night();
		((Cat)ani).night(); // downCasting
	}
}
