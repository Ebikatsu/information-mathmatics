import java.util.*;
import java.math.*;

class poason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double px = 0;
		System.out.println("lamda x");
		String[] inputs = sc.nextLine().split(" ");
		double lamda = Double.parseDouble(inputs[0]);
		int x = Integer.parseInt(inputs[1]);
		for (int i=x; i>=0; i--){
			px += Math.exp(-1*lamda)*times(lamda, i)/kaijo(i);
		}
			// px += Math.exp(-1*lamda)*times(lamda, x)/kaijo(x);

		System.out.println(px);
	}

	public static int kaijo(int a) {
		int kaijo = 1;
		for (int i=1; i <= a; i++) {
			kaijo *= i;
		}
		return kaijo;
	}

	public static double times(double p, int n) {
		double t = 1;
		for (int i=1; i<=n; i++) {
			t *= p;
		}
		return t;
	}
}
