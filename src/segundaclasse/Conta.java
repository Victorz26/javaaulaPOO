package segundaclasse;

public class Conta {
	
	private Double saldo;
	
	private String numeroConta;
	
	private Cliente cliente;
	
	Double Debito;
	
	Double Credito;
	
	Double ImplementarDebito() {
		return saldo - Debito;
	}
	Double ImplementarCredito() {
		return saldo + Credito;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
