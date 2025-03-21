package entities;

public class PessoaFisica extends Pessoa{
	
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}


	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double impostoPago() {
        double percentualImposto = 0.0;
        if (rendaAnual < 20000) {
        	percentualImposto = 15.0 / 100;
        } else {
        	percentualImposto = 25.0 / 100;
        }
        return (rendaAnual * percentualImposto) - (gastosSaude * 0.5); 	
        
	}

}
