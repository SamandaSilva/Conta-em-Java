package utilit;

public class Dados {

	private String titular;
	private int nConta;
	private double saldo;

	public Dados() {
		
	}
	
	public Dados(String titular, int nConta, double depInicial) {
		this.titular = titular;
		this.nConta = nConta;
		deposito(depInicial);
	}

	public Dados(String titular, int nConta) {
		this.titular = titular;
		this.nConta = nConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getnConta() {
		return nConta;
	}

	public double getDepInicial() {
		return saldo;
	}
	public void deposito(double deposito) {
		saldo += deposito;
	}
	public void saque(double saque) {
		saldo -= saque + 5.0;
	}
	
	public String toString() {
		return "Conta "
			+ nConta
			+", Titular: "
			+ titular
			+ ", Saldo: $ "
			+ String.format("%.2f", saldo);
			
	}

}
