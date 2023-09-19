package PilaresPoo.Equipamentos.multifuncional;

import PilaresPoo.Equipamentos.copiadora.Copiadora;
import PilaresPoo.Equipamentos.digitalizadora.Digitalizadora;
import PilaresPoo.Equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

	@Override
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MUNTIFUNCIONAL");
		
	}
	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MUNTIFUNCIONAL");
		
	}
	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MUNTIFUNCIONAL");
		
	}
}
