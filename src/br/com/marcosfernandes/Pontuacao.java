package br.com.marcosfernandes;

import java.util.Locale;
import java.util.Scanner;

import com.sun.source.tree.Scope;

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
		
		int pontos, escore, pontosInad;
		int pontosFormPag = 0;
		String cliente;
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
		
		System.out.println("Score de volume de compras = " + pontos + " pontos");
		
		if (atrasoPagamento == 0 && quantCompraAno > 0) {
			pontosInad = 30;
		}else if (quantCompraAno > 0 && atrasoPagamento > 0) {
			pontosInad = 15;
		}else {
			pontosInad = 0;
		}
		System.out.println("Score de inadimplência = " + pontosInad + " pontos");
		
		if (formaPagamento == 'C' && quantCompraAno > 0) {
			pontosFormPag = 10;
		}else if (formaPagamento == 'D' && quantCompraAno > 0) {
			pontosFormPag = 5;
		}
		System.out.println("Score de forma de pagamento " + pontosFormPag + " pontos");
		
		escore = ( pontos + pontosInad + pontosFormPag );
		
		if (escore > 75) {
			cliente = "OURO";
		}else if (escore > 25 && escore <= 75) {
			cliente = "PRATA";
		}else {
			cliente = "BRONZE";
		}
		
		System.out.println("Classificação final = " + cliente );
		sc.close();
		
	}

}
