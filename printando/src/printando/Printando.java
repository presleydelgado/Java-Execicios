package printando;

public class Printando {
	public static void main(String[] args) {
		//metodo1();
		metodo2();
	}
	/*Printar na tela o rosto proposto :  
	  +"""""+                                                                                                      
	 [| o o |]                                                                                                     
	  |  ^  |                                                                                                      
	  | '-' |                                                                                                      
	  +-----+ 
	*/
	
	public static void metodo1() {
		//Metodo 1 de forma comum com prints
		System.out.println(" +\"\"\"\"\"+");
		System.out.println("[| o o |]");
		System.out.println(" |  ^  |");
		System.out.println(" | '-' |");
		System.out.println(" +-----+");
	}
	public static void metodo2() {
		//metodo 2 usando array 
		String [] face = {" +\"\"\"\"\"+ " , "[| o o |]"," |  ^  |"," | '-' |"," +-----+"};
				
		for (int i = 0; i < face.length; i++) {
			System.out.println(face[i]);
		}
	}
}
                                                 
                                                
                                                 
                                                 
