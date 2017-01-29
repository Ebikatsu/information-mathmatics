import java.util.*;

class binomial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double bino = 0;
		System.out.println("n p x");
		String[] inputs = sc.nextLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		double p = Double.parseDouble(inputs[1]);
		int x = Integer.parseInt(inputs[2]);
		for (int k=0; k <= x; k++) {
			bino += combination(n, k)*times(p,k)*times(1-p, n-k);
		}
		System.out.println(bino);
	}

	public static int combination(int a, int b) {
		int comb = 1;
		for (int i=a, j = 1; j <= b; i--, j++) {
			comb *= i;
			comb /= j;
		}
		return comb;
	}

	public static double times(double p, int n) {
		double t = 1;
		for (int i=1; i<=n; i++) {
			t *= p;
		}
		return t;
	}
}
