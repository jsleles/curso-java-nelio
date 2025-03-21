package exceptions;

public class DomainException extends RuntimeException {
	
	public DomainException() {
		super("Ocorreu um erro na aplicação");
	}
	
	public DomainException(String mensagem) {
		super(mensagem);
	}

}
