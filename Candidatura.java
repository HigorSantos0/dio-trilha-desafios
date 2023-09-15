import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatura {
	public static void main(String[] args) {
		
		//analisarCandidatura(1900.0);
		//analisarCandidatura(2220.0);
		//analisarCandidatura(2000.0);
		//selecaoCandidatos();
		//imprimirSelecionador();
		String candidatos[] = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando) {
				tentativasRealizadas++;
			}
			else
				{
					System.out.println("Contato realizado com sucesso!");
				}
			
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu) {
			System.out.println("Conseguimos contato com o " + candidato + "na " + tentativasRealizadas + "tentativa.");
		}
		else
		{
			System.out.println("Nao conseguimos contato com " + candidato + ", numero maximo de tentativas " + tentativasRealizadas + "realizada");
		}
	}
	
	
	
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	
	static void imprimirSelecionador(){
		String candidatos[] = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o indeice do elemento");
		
		for(int indice = 0; indice < candidatos.length;indice++) {
			System.out.println("O candidato de n° " + (indice+1) + " e o " + candidatos[indice]);
		}
		
		//Forma abrevida via ForEach
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	static void selecaoCandidatos() {
		
		String candidatos[] = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELLA", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidadato "+  candidato + "solicitou este valor de salario: " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
			
		}
	}	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidatura(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato.");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta.");
		}
		else
			{
				System.out.println("Aguardando o resultado dos demais candidatos.");
			}
	}

}
