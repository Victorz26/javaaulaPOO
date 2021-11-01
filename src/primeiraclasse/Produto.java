package primeiraclasse;

public class Produto {
	static final int QUANTIDADE_MINIMA_ESTOQUE = 10;
	
	String nome;
	
	Boolean qtdminima;
	
	Integer quantidade;
	
	
	Boolean eNecessarioReporEstoque() {
		if (quantidade < QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		
		return false;
}
}