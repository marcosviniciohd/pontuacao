package br.com.marcosfernandes;

import java.util.Locale;
import java.util.Scanner;

public class Pontuacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("-------------------------------- ");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO ");
		
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		int quantCompraAno = sc.nextInt();
		
		System.out.print("Qual o ticket m�dio? ");
		double ticketMedio = sc.nextDouble();
		
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		int atrasoPagamento = sc.nextInt();
		
		System.out.print("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)? ");
		char formaPagamento = sc.next().charAt(0);
		
		
		
		
		
		sc.close();
		
	}

}
