
public class Fibonacci {
	public static void main(String[] args) {
		int f = 0;
		int f1 = 1;
		System.out.println("And now...the Fibonacci sequence!");
		System.out.println(f);
		System.out.println(f1);
		for(int i = 0;i<30;i++) {
			int sum = f + f1;
			System.out.println(sum);
			f = f1;
			f1 = sum;
		}
	}
}
