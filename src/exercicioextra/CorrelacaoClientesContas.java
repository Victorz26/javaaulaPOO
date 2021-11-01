package exercicioextra;

import java.util.Random;
import java.util.Scanner;

public class CorrelacaoClientesContas {
	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		Cliente cliente = new Cliente();
		cliente.conta = new Conta();
		String ultimaMensagem;
		
		while(true) {
			System.out.println("Menu: 1 - Cadastrar usuário");
			System.out.println("Menu: 2 - Consultar saldo");
			System.out.println("Menu: 3 - Creditar em conta");
			System.out.println("Menu: 4 - Debitar em conta");
			System.out.println("Menu: 5 - Sair");
			Integer Menu = leTeclado.nextInt();
		
			switch (Menu) {
				case 1 :   
					System.out.println("digite seu nome: ");
					ultimaMensagem = leTeclado.next();
					cliente.nome = ultimaMensagem;
					
					System.out.println("digite seu cpf: ");
					ultimaMensagem = leTeclado.next();
					cliente.cpf = ultimaMensagem;
					
					
					
					while(true) {
						System.out.println("digite a sua senha : ");
						
						ultimaMensagem = leTeclado.next();
						if (Conta.verificaSenha(ultimaMensagem)) {
							System.out.println("senha válida");
							break;
						} 
					}
					cliente.conta.senha = ultimaMensagem;
					cliente.conta.numeroConta = new Random().nextInt(10000)  + "-" + new Random().nextInt(10) ;
					System.out.println(cliente.conta.numeroConta);
					cliente.conta.saldo = 0.0;
					
					break;
				case 2 :
					System.out.println("consultando seu saldo");
					System.out.println("digite o número da conta: " );
					ultimaMensagem  = leTeclado.next();
					if (cliente.conta.numeroConta.equals(ultimaMensagem)) {
						System.out.println("numero da conta valida " );
						
					}else {
						
						break;
					}
					
					System.out.println("digite a sua senha : ");
					ultimaMensagem = leTeclado.next();
					if (cliente.conta.senha.equals(ultimaMensagem)) {
						System.out.println("senha válida, exibindo saldo: " + cliente.conta.saldo);
					}else {
						System.out.println("conta invalida");
						
					}
					break;
				case 3 :
					System.out.println("digite o numero da conta");
					ultimaMensagem = leTeclado.next();
					
					System.out.println("digite o valor a ser creditado");
					cliente.conta.valor = leTeclado.nextInt();
					
					System.out.println("valor: " + cliente.conta.valor + " creditado a conta" + " saldo total: " + cliente.conta.ImplementarCredito());
					break;
				case 4 :
					
					System.out.println("digite o valor a ser debitado da conta");
					cliente.conta.valor = leTeclado.nextInt();
					
					
					System.out.println("digite o numero da conta");
					ultimaMensagem = leTeclado.next();
					if (cliente.conta.numeroConta.equals(ultimaMensagem)) {
						System.out.println("numero da conta valida " );
						
					}else {
						
						break;
					}
					System.out.println("digite a sua senha : ");
					ultimaMensagem = leTeclado.next();
					if (cliente.conta.senha.equals(ultimaMensagem)) {
						System.out.println("senha válida, debitado o valor: " + cliente.conta.valor + " seu saldo final é: " + cliente.conta.ImplementarDebito());
					}else {
						System.out.println("conta invalida");
					}	
						break;
				case 5 : 
					System.err.println("nao digitou um número válido, saindo do programa!");
					System.exit(1);
				default:
					System.err.println("ERRO!! Você nao digitou um número válido");
					System.exit(1);
			}
		
		}	
	}
			
}
