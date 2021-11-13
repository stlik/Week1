package day1.oct;

public class Integer_divisibles {

	public static void main(String[] args) {
	for (int i = 0; i <=100;  i++) {
	if (i%3==0 && i%5==0) {
	System.out.println("TRIZZ-FRIZZ="+i);
	}
	else if (i%3==0) {
	System.out.println("TRIZZ="+i);
	}
	else if (i%5==0) {
		System.out.println("FRIZZ="+i);
	}
	}
	}
	}


