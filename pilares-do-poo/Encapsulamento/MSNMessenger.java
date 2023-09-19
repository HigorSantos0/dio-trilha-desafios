package PilaresPoo.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
		salvarHistoricoMensagem();
	}
	public void salvarHistoricoMensagem() {
		System.out.println("Historico Salvo!");
		
	}
	
}