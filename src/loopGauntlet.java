
public class loopGauntlet {
	public static void main(String[] args) {
		//1. Display all numbers from 0 to 100
		for(int i = 0;i<=100;i++) {
			//System.out.println(i);
		}
		//2. Display all numbers from 100 to 0. ALSO GOTEEM THIS IS THE BONUS CODE
		for(int i = 0;i<=100;i++) {
			//System.out.println(100 - i);
		}
		//3. Display all even numbers from 2 to 100
		for(int i = 0;i<=100;i=i+2) {
			//System.out.println(i);
		}
		//4. Display all odd numbers from 1 to 99
		for(int i = 1;i<100;i+=2) {
			//System.out.println(i);
		}
		//5. Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
		for(int i = 1;i<=500;i++) {
			if((i % 2) == 0) {
				//System.out.println(i + " is even");
			}else {
				//System.out.println(i + " is odd");
			}
		}
		//6. Display all multiples of 7 from 0 to 777.
		for(int i = 7;i<=777;i+=7) {
			//System.out.println(i);
		}
		//7. Print all the years you were alive and how old you were in each. e.g. “In 1979, i was 2 years old.” (for a really old person)
		for(int i = 0;i<=14;i++) {
			//System.out.println("In " + (2004 + i) + ", I was " + i + " year(s) old.");
		}
		//Prints 2 digit base 3 numbers
		for(int i = 0;i<3;i++) {
			for(int o = 0;o<3;o++) {
				//System.out.println(i + " " + o);
			}
		}
		for(int i = 1;i<9;i+=3) {
			for(int o = 0;o<3;o++) {
				//System.out.print((i + o) + " ");
			}
			//System.out.println();
		}
		for(int i = 1;i<101;i+=10) {
			for(int o = 0;o<10;o++) {
				//System.out.print((i + o) + " ");
			}
			//System.out.println();
		}
		for(int i = 1;i<=6;i++) {
			for(int o = 0;o < i;o++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
