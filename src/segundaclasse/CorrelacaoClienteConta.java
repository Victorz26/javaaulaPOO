package segundaclasse;


import java.util.Random;
import java.util.Scanner;

public class CorrelacaoClienteConta {
	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		Conta novaConta1 = new Conta();
		
		Conta novaConta2 = new Conta();
		
		novaConta1.setCliente(new Cliente());
		
		novaConta2.setCliente(new Cliente());
		
		novaConta1.setSaldo(new Random().nextDouble());
		novaConta2.setSaldo(new Random().nextDouble()); 
		
		novaConta1.Debito = new Random().nextDouble();
		novaConta2.Debito = new Random().nextDouble();
		
		novaConta1.Credito = new Random().nextDouble();
		novaConta2.Credito = new Random().nextDouble();
		
		System.out.println("digite os nomes dos titulares das respectivas contas: ");
		novaConta1.getCliente().setNome(leTeclado.nextLine()); 
		novaConta2.getCliente().setNome(leTeclado.nextLine()); 
		
		novaConta2.setNumeroConta("83677-5");
		novaConta1.setNumeroConta("89033-0"); 
		novaConta1.getCliente().setCpf("05045082550");
		novaConta2.getCliente().setCpf("05045083902");
		
		Boolean validaMaiorSaldoUm = novaConta1.getSaldo() > novaConta2.getSaldo();
		Boolean validaMaiorSaldoDois = novaConta2.getSaldo() > novaConta1.getSaldo();
		
		if(validaMaiorSaldoUm) {
			System.out.println("a maior conta é a de: " + novaConta1.getCliente().getNome() + " com saldo de: " + novaConta1.getSaldo());
		} else if(validaMaiorSaldoDois) {
			System.out.println("o maior saldo é o de: " + novaConta2.getCliente().getNome() + " com saldo de: " + novaConta2.getSaldo());
		} else {
			System.out.println("as contes tem saldo igual");
		}
		
		System.out.println("o credito é a soma de: " + novaConta1.Credito + " com : " + novaConta1.getSaldo() + " a soma da: " + novaConta1.ImplementarCredito());
		System.out.println("o debito é a subtração de: " + novaConta1.Debito + " com : " + novaConta1.getSaldo() + " a soma da: " + novaConta1.ImplementarDebito());
		
		System.out.println("o credito é a soma de: " + novaConta2.Credito + " com : " + novaConta2.getSaldo() + " a soma da: " + novaConta2.ImplementarCredito());
		System.out.println("o debito é a subtração de: " + novaConta2.Debito + " com : " + novaConta2.getSaldo() + " a soma da: " + novaConta2.ImplementarDebito());

		leTeclado.close();
		
	
	}



}
