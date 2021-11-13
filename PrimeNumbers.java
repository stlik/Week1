package day1.oct;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num =13;
		
		for (int i = 2; i<=num/2; i++) {
		
			if (num%2==0) {
				break;
			}
			
		}
		if (num%2==1) {
				System.out.println("prime number");
			}
			else {
				System.out.println("Not_PrimeNumber");
			}
		}
	}


