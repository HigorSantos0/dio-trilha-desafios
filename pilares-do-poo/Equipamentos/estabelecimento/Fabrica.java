package PilaresPoo.Equipamentos.estabelecimento;

import PilaresPoo.Equipamentos.copiadora.Copiadora;
import PilaresPoo.Equipamentos.digitalizadora.Digitalizadora;
import PilaresPoo.Equipamentos.digitalizadora.Scanner;
import PilaresPoo.Equipamentos.impressora.Deskjet;
import PilaresPoo.Equipamentos.impressora.Impressora;
import PilaresPoo.Equipamentos.impressora.Laserjet;
import PilaresPoo.Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

	public static void main(String[] args) {
		
//		Impressora impressora = new Deskjet();
//		Impressora impressora = new Laserjet();
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Scanner scanner = new Scanner();
		
		
		Impressora impressora = em;
		//Digitalizadora digitalizadora = em;
		Digitalizadora digitalizadora = scanner;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
		
		
	}
}
