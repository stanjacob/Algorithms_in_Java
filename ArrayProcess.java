
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
		int N = a.length;
		double[][] c= new double[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				for (int k = 0; k < N; ++k)
					c[i][j] += a[i][k] * b[k][j];
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 4, 2, 24, 19};
		int[] b = a;
		b[2] = 24;
		System.out.println(a[2]);
		
		int M, N;
		M = 10; N = 10;
		double[][] matrix = new double[M][N]; // defaults to 0.0
		System.out.println(matrix[1][1]);
		
		a = reverse_array(a);
		for (int i = 0; i < a.length; ++i)
			System.out.println(a[i]);
	}
}
