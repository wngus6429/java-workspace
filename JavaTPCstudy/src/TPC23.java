import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {

	public static void main(String[] args) {
		// 1. 다형성인수
		Dog d = new Dog();
		display(d); // 개처럼 먹다.
		Cat c = new Cat();
		display(c); // 고양이처럼 먹다.
	} //                          UpCasting
	private static void display(Animal r) { //다형성 인수
		r.eat();
		// night할려면
		if ( r instanceof Cat) {	 // Dog는 night가 없으니까.
			((Cat)r).night(); // DownCasting
		}
	}
}
