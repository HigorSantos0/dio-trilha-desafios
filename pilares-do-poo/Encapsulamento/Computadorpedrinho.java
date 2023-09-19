package PilaresPoo.Encapsulamento;

import PilaresPoo.apps.FacebookMessenger;
import PilaresPoo.apps.MSNMessenger;
import PilaresPoo.apps.ServicoMensagemInstantanea;
import PilaresPoo.apps.TelegramMessenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegramMessenger();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
