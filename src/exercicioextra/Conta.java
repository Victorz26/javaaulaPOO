package exercicioextra;

public class Conta {
	
	
	String numeroConta;
	
	Double saldo;

	String senha;
	
	Integer valor;
	
	public static boolean verificaSenha(String senha){
		if(senha.length() <= 6){
			return true;
		}
		return false;
	}
	
	Double ImplementarCredito() {
		return saldo + valor;
	}
	
	Double ImplementarDebito() {
		return saldo - valor;
	}
}


