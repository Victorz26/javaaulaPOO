package metodoinstância;

public class Pedido {
	String codigo;
	
	Double desconto;
	
	Double subTotal;
	
	
	
	String getCodigo() {
		return codigo;
	}
	void Setcodigo(String codigo) {
		this.codigo = codigo;
	}
	Double getDesconto() {
		return desconto;
	}
	void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	Double getSubTotal() {
		return subTotal;
	}
	void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	Double getTotal() {
		return subTotal - desconto;
	}
//	void setTotal(Double total) {
//		this.total = total;
	
}

