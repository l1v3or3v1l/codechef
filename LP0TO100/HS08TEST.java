import java.io.*;

public class HS08TEST {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		double a, b;
		a = Float.parseFloat(in[0]);
		b = Float.parseFloat(in[1]);
		if (a + 0.50 <= b && a % 5 == 0) {
			System.out.printf("%.2f", b - a - 0.50);
		} else {
			System.out.printf("%.2f", b);
		}
	}
}