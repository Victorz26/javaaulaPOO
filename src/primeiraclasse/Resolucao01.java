package primeiraclasse;

public class Resolucao01 {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Notebook XZ10";
		produto.quantidade = 8;
		
		System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + produto.eNecessarioReporEstoque());
	}
	
//	static Boolean eNecessarioReporEstoque(Produto produto) {
//		if (produto.quantidade < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
//			return true;
//		}
//		
//		return false;
//	}
	

}
