package practice;

public class TPC05 {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		a[0][0] = 11;
		a[0][1] = 12;
		a[0][2] = 13;
		a[0][3] = 14;
		
		a[1][0] = 21;
		a[1][1] = 22;
		a[1][2] = 23;
		a[1][3] = 24;
		
		a[2][0] = 31;
		a[2][1] = 32;
		a[2][2] = 33;
		a[2][3] = 34;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
