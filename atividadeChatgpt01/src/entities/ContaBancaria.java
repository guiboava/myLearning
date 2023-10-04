package entities;

public class ContaBancaria {

	private double saldo;
	private String titular;

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}
	public String saldo() {
		return this.saldo();
	}
}
