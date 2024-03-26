package model;

public class Conta {
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void atualiza(double taxa) {
	double taxaP = (taxa / 100);
		
		this.saldo += (this.saldo * taxaP);
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}	
}