package area;

import java.util.Scanner;

public class AreaPerimetro {

	public static void main(String[] args) {
		conta();
	}
	public static void conta(){
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Insira a largura: ");
	    double largura = scanner.nextDouble();  
	    System.out.println("Insira a altura: ");
	    double altura = scanner.nextDouble();
	    System.out.println("Area :  " + largura * altura);
	    System.out.println("Perimetro : " + 2 * (largura + altura));
	    scanner.close();
	}
}
