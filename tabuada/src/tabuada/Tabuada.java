package tabuada;

import java.util.Scanner;

public class Tabuada {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		tabuada();

	}
	public static void tabuada() {
		System.out.println("De qual número será essa tabuada ? ");
		int num = scanner.nextInt();
		scanner.close();
		System.out.println("Tabuada do " + num);
		for(int i = 1; i <= 10; i++) {
			System.out.println( + i + " X " + num + " = " + i*num);
		}
	}
}

