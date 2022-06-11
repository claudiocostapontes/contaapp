package br.com.contaapp;

public class Conta implements ContaInterface {
	// Atributos
	private String agencia;
	private String numeroConta;
	private double saldo;
	private Usuario titularConta;
	
	// Construtor
	public Conta(String agencia, String numeroConta) {
		// TODO Auto-generated constructor stub
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}

	// Métodos da Interface
	@Override
	public String depositarValor(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
		return "Valor depositado com sucesso.";
	}

	@Override
	public String sacarValor(double valor) {
		// TODO Auto-generated method stub
		if (valor > this.saldo)
			return "Saldo insuficiente.";
		else {
			this.saldo -= valor;
			return "Saque efetuado com sucesso.";
		}
		
	}

	// Métodos de acesso
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(Usuario titularConta) {
		this.titularConta = titularConta;
	}

}
