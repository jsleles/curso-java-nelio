package exceptions;

public class DomainException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DomainException() {
		super("Ocorreu um erro na aplicação");
	}
	
	public DomainException(String mensagem) {
		super(mensagem);
	}

}
