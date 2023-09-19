package PilaresPoo;

public class Autodromo {

	public static void main(String[] args) {
		
		Carro jeep = new Carro();
		
		//jeep.confereCambio();
		//jeep.confereCombustivel();
		jeep.ligar();
		jeep.setChassi("1234356");
		
		Moto f1200 = new Moto();
		
		f1200.setChassi("4554762");
		System.out.println(jeep.getChassi());
		System.out.println(f1200.getChassi());
		f1200.ligar();
		
		
	}
}
