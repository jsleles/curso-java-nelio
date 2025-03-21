package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}


	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double impostoPago() {
		double percentualImposto = 0.0;
		if (numeroDeFuncionarios <= 10) {
			percentualImposto = 0.16;
		} else {
			percentualImposto = 0.14;
		}
		return rendaAnual * percentualImposto;
		
	}

}
