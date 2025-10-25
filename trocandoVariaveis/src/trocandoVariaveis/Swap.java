package trocandoVariaveis;

public class Swap {

	public static void main(String[] args) {
		int a,b,temp;
		a = 15;
		b = 27;
		System.out.println("Antes de trocar : a = " + a + " , b = " + b);
		//trocando
		temp = a;
		a = b;
		b = temp;
		System.out.println("Trocados : a = " + a + " , " + " b = " + b);
	}

}
