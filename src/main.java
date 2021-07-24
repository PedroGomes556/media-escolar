import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Media mediaObj = new Media();
		
		System.out.println("*****Bem-vindo a calculadora de média escola!*****");
		System.out.print("Digite a 1° nota: ");
		float nota1 = teclado.nextFloat();
		System.out.print("Digite a 2° nota: ");
		float nota2 = teclado.nextFloat();
		System.out.print("Digite a 3° nota: ");
		float nota3 = teclado.nextFloat();
		
		float media = mediaObj.calculoMedia(nota1, nota2, nota3);
		
		System.out.printf("Sua média: %.1f",media);
		
	}

}
