package br.com.marcosfernandes;

import java.util.Locale;
import java.util.Scanner;

public class Pontuacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("-------------------------------- ");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO ");
		
		System.out.print("Quantas compras o cliente fez no último ano? ");
		int quantCompraAno = sc.nextInt();
		
		System.out.print("Qual o ticket médio? ");
		double ticketMedio = sc.nextDouble();
		
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		int atrasoPagamento = sc.nextInt();
		
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		char formaPagamento = sc.next().charAt(0);
		
		int pontos, escore;
		double volumeCompras = ( ticketMedio * quantCompraAno );
		
		if ( volumeCompras > 3000 ) {
			pontos = 60;
		}
		else if ( volumeCompras > 0 && volumeCompras <= 3000 && quantCompraAno > 2 ) {
			pontos = 40;
		}
		else if ( volumeCompras > 0 && volumeCompras <= 3000 ) {
			pontos = 20;
		}
		else {
			pontos = 0;
		}
		
		System.out.print("Score de volume de compras = " + pontos + " pontos");
		
		
		
		
		sc.close();
		
	}

}
