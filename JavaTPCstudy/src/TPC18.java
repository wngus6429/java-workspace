import java.lang.*; //이게 생략이 되어 있음.

import com.google.gson.Gson;

import kr.bit.BookVO;
import kr.bit.MyUtil; //혹은 import kr.tpc.*

public class TPC18 {
	public static void main(String[] args) {
		// 1. java에서 제공해주는 클래스들.. api
		// 문자열 (String)
		String str = new String("APPLE");
		System.out.println(str.toLowerCase());
		
		// 2. 직접 만들어서 사용하는 class들... DTO/VO, DAO, utility.. API
		MyUtil my = new MyUtil();
		int sum = my.hap();
		System.out.println(sum);
		
		// 3. 다른 회사에서 만들어 놓은 클래스들.. API
		// Gson -> json // https://mvnrepository.com/
		Gson g = new Gson();
		BookVO vo = new BookVO("자바", 1300, "주", 800);
		String json = g.toJson(vo);
		System.out.println(json);
		// {"title":"자바","price":1300,"company":"주","page":800}
	}
}
