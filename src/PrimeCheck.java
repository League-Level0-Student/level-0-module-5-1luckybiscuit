import javax.swing.JOptionPane;

public class PrimeCheck {
	public static void main(String[] args) {
		boolean isPrime = false;
		String num = JOptionPane.showInputDialog("Give me a number!");
		int n = Integer.parseInt(num);
		for(int i = 2;i < n;i++) {
			if((n % i) == 0) {
				isPrime = true;
				break;
			}else {
				isPrime = false;
			}
		}
		if(isPrime == true) {
			JOptionPane.showMessageDialog(null, n + " is not prime--it is a composite number!");
		}else {
			JOptionPane.showMessageDialog(null, "I checked all the possibilities, and it turns out " + n + " is prime!");
		}
	}
}
