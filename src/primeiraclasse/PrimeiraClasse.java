package primeiraclasse;

public class PrimeiraClasse {
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "smartphone";
		
		produto.quantidade = 9;
	
		RecebeProduto(produto);
	
		Boolean qtdminimaReporEstoque = produto.quantidade <= 10;
	
		EstoqueEmDia(produto, qtdminimaReporEstoque);
	}

	static void RecebeProduto(Produto produto) {
		System.out.println("é necessário repor o estoque de " + produto.nome + "?");
	}
	static void EstoqueEmDia(Produto produto, Boolean qtdMinimaPReporEstoque) {
		if(qtdMinimaPReporEstoque) {
			System.out.println("voce precisa repor o estoque");
		} else {
			System.out.println("não precisa repor o estoque");
		}
	}
//		static Boolean eNecessarioReporEstoque(Produto produto) {
//		if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
//			return true;
//		}
//		
//		return false;
	
}
