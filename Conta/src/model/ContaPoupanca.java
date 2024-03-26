package model;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	@Override
	public void deposita(double valor) {
		super.deposita(valor - 1);
	}
	
	@Override
	public void atualiza(double taxa) {
		double taxaP = (taxa / 100);

		super.deposita((getSaldo() * taxaP) * 3);
	}
}