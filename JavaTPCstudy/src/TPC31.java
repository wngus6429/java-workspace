package practice;

import kr.tpc.Inflern;

public class TPC31 {
	public static void main(String[] args) {
		// Inflern inf = new Inflern(); //private박혀 있으면 접근몬함
		// inf.tpc();
		// inf.java(); //static이 붙어 있으면 밑에 밑줄쳐짐 주의해라고
		// 밑에처럼 접근하는게 존나게 간단하다.
		Inflern.tpc();
		Inflern.java(); // static은 살짝 기울어짐.
	}
}
