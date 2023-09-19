package PilaresPoo;

public class Carro extends Veiculo {
	
//	private String chassi;
//	
//	
//	public String getChassi() {
//		return chassi;
//	}
//	public void setChassi(String chassi) {
//		this.chassi = chassi;
//	}
	
	public void ligar () {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro ligado!");
		
	}
	
	private void confereCombustivel() {
		System.out.println("Confere Combustivel!");
	}
	private void confereCambio() {
		
		System.out.println("Conferindo Combio em P!");
	}

}
