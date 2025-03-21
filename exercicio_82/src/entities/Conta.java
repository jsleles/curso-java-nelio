package entities;

public class Conta {
	private int number;
	private String name;
	private double saldo;
	
	public Conta(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public Conta(int number, String name, double initialDeposit) {
		super();
		this.number = number;
		this.name = name;
		depositar (initialDeposit);
 	}

	public int getNumber() {
		return number;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

    public String toString() {
    	return "Account " 
    			+ this.number 
    			+ ", Holder: "
    			+ this.name 
    			+ ", Balance: $"
    			+ String.format("%.2f", this.saldo);
    	
    }
	
	public void depositar (double deposito ) {
		this.saldo += deposito;
	}
	
	public void sacar (double saque) {
		this.saldo -= ( saque + 5.00);
	}
	
}
