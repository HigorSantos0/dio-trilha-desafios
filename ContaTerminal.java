import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o numero da conta: ");
		numero = entrada.nextInt();
		
		System.out.println("Por favor, Digite o numero da agencia: ");
		agencia = entrada.next();
		
		System.out.println("Digite o seu nome: ");
		nomeCliente = entrada.next();
		entrada.next();
		
		System.out.println("Digite o seu saldo: ");
		saldo = entrada.nextDouble();
		
		
		
		System.out.printf("\"Ola %s, obrigado por criar uma conta em nosso banco, "
				+ "sua agencia e %s, conta %d e seu "
				+ "saldo %.2f ja esta disponivel para saque", 
				nomeCliente, agencia, numero, saldo);
		
		entrada.close();
	}

}
