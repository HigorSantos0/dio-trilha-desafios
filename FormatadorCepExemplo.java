
public class FormatadorCepExemplo {

	public static void main(String[] args) {
		
		try {
			String cepFormatado = formatarCep("25535450");	
			System.out.println(cepFormatado);
		}
		catch(CapInvalidoException e) {
			System.out.println("O cep nao corresponde as regras de negocio!");
		}
		
	}
	static String formatarCep(String cep) throws CapInvalidoException {
		if(cep.length() != 8)
		
		throw new CapInvalidoException();
		
		return "25535450";
	}
}
