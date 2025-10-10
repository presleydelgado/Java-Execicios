import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        num1();
    }
    public static Scanner scanner = new Scanner(System.in);

    public static void num1(){
        System.out.println("Digite o primeiro número : ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número : ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número : ");
        int num3 = scanner.nextInt();
        System.out.println("Digite o quarto número : ");
        int num4 = scanner.nextInt();
        System.out.println("Digite o quinto número : ");
        int num5 = scanner.nextInt();

        int resultado = media(num1,num2,num3,num4,num5);
        System.out.println("Resultado : " + resultado);
    }
    public static int media(int n1,int n2,int n3, int n4, int n5){
        int total = (n1 + n2 + n3 + n4 + n5) / 5;
        return total;
    }
}
