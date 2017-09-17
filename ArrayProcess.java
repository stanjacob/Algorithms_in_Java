
public class ArrayProcess {
	public static double max(double[] a) {
		double max = a[0];
		for (int i = 1; i < a.length; ++i)
			if (a[i] > max) max = a[i];
		return max;
	}
	
	public static int max(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; ++i)
			if (a[i] > max) max = a[i];
		return max;
	}
	
	public static double average(double[] a) {
		double sum = 0.0;
		for (int i = 0; i < a.length; ++i) {
			sum += a[i];
		}
		return sum / a.length;
	}
	
	public static Number[] copy_array(Number[] a) {
		Number[] b = new Number[a.length];
		for (int i = 0; i < a.length; ++i) 
			b[i] = a[i];
		return b;
	}
	
	public static void aliasingExample() {
		int[] a = {1, 4, 2};
		int[] b = a; // b refers to same object as a, not copied
		b[2] = 24;
		System.out.println(a[2]); 
	}
	
	public static int[] reverse_array(int[] a) {
		for (int i = 0; i < (a.length / 2); ++i) {
			int temp = a[i];
			int opp_index = (a.length - 1) - i;
			a[i] = a[opp_index];
			a[opp_index] = temp;
		}
		return a;
	}
	
	public static double[][] mat_mult(double[][] a, double[][] b) {
		int M1 = a.length; int N1 = a[0].length;
		int M2 = b.length; int N2 = b[0].length;
		
		double[][] c = new double[M1][N2];
		for (int i = 0; i < M1; ++i) {
			for (int j = 0; j < N2; ++j) {
				for (int k = 0; k < N1; ++k)
					c[i][j] += a[i][k] * b[k][j];
			}
		}
		return c;
	}
	
	public static int abs(int x) {
		if (x < 0) return -x;
		else return x;
	}
	
	public static double abs(double x) {
		if (x < 0.) return -x;
		else return x;
	}
	
	public static boolean isPrime(int N) {
		if (N < 2) return false;
		for (int i = 2; i * i < N; ++i) {
			if (N % i == 0) return false;
		}
		return true;
	}
	
	public static double f(double x, double c) {
		return x*x - c;
	}
	
	public static double f_prime(double x) {
		return 2*x;
	}
	
	public static double sqrt(double c) {
		// using Newton's method
		// f(x) = x^2 - c*c
		// f'(x) = 2 * x
		// x1 = x0 - f(x0)/f'(x0)
		if (c < 0.0) return Double.NaN;
		
		double precision = 1e-3;
		double x0 = c;
		double x1 = x0 - f(x0, c)/f_prime(x0);
				
		while (abs(x1-x0) > precision) {
			x0 = x1;
			x1 = x0 - f(x0, c)/f_prime(x0);
		}
		
		return x1;
	}
	
	public static double hypotenuse(double x, double y) {
		return sqrt(x*x + y*y);
	}
	
	public static double harmonic_sum(int N) {
		double sum = 0;
		for (int i = 1; i < N; ++i)
			sum += (double)1/i;
		return sum;
	}
	
	public static void main(String[] args) {
		int M, N;
		M = 5; N = 10;
		double[][] matrix = new double[M][N]; // defaults to 0.0
		System.out.println(matrix[1].length);
		System.out.println(sqrt(2));
	}
}
