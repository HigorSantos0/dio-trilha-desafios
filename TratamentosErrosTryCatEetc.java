import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentosErrosTryCatEetc {
	public static void main(String[] args) {
		
			try {
				Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
				
				System.out.print("Entre com seu nome: ");
				String nome = entrada.next();
				
				System.out.print("Entre com o sobrenome: ");
				String sobreNome = entrada.next();
				
				System.out.print("Entre com a sua idade: ");
				int idade = entrada.nextInt();
				
				System.out.print("Entre com sua altura: ");
				double altura = entrada.nextDouble();
				
				System.out.printf("Ola, me chamo %s %s. Tenho %d anos e minha altura e' %.2f. ", nome, sobreNome, idade, altura);
				
				entrada.close();
				
			}
			catch(InputMismatchException e) {
				System.out.println("Os campos Idade e altura precisam ser numericos! ");
			}
			
			
	}

}
