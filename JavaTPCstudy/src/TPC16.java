import kr.bit.OverLoad;

public class TPC16 {
	public static void main(String[] args) {
		OverLoad ov = new OverLoad();
		ov.hap(20, 50); // ov.hap_int_int(20,50)
		ov.hap(20.6f, 30); // ov.hap_float_int(20.6f,30)
		ov.hap(33.6f, 45.8f); // ov.hap_float_float(33.6f, 45.8f)
	}

}
