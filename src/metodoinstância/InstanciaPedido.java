package metodoinstância;

public class InstanciaPedido {
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.Setcodigo("12128182112");
		pedido.setDesconto(50.0);
		pedido.setSubTotal(200.0);
		
		
		
		System.out.println("o seu código é: " + pedido.getCodigo());
		System.out.println("o seu desconto é: " + pedido.getDesconto());
		System.out.println("o subtotal é: " + pedido.getSubTotal());
		System.out.println("o total é: " + pedido.getTotal());
	}

}
