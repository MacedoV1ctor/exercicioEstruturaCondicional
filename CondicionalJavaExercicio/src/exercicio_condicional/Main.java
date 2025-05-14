// Exercicio condicional
package exercicio_condicional;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public String verificaNegativo(){
		String response = "";
		float numero = 0;
		
		System.out.println("Digite um número para verificar se é negativo");
		numero = sc.nextFloat();
		
		if (numero < 0) {
			response = "É negativo!";
		} else {
			response = "É positivo!";
		}
		
		
		return response;
	}
	
	
	public String verificaParImpar(){
		String response = "";
		float numero = 0;
		
		System.out.println("Digite um número para verificar se é par");
		numero = sc.nextFloat();
		
		if (numero % 2 == 0) {
			response = "É par!";
		} else {
			response = "É ímpar";
		}
		
		
		return response;
	}
	
	
	public String verificaMultiplo(){
		String response = "";
		float x = 0;
		float y = 0;
		
		System.out.println("Digite o primeiro valor");
		x = sc.nextFloat();
		
		System.out.println("Digite o segundo valor");
		y = sc.nextFloat();
		
		if (x > y) {
			if (x % y == 0) response = "São múltiplos";
			else response = "Não são múltiplos";
		} else if (y > x) {
				if (y % x == 0) response = "São múltiplos";
				else response = "Não são múltiplos";
		} else {
			response = "São múltiplos";
		}
			
		 
			return response;
	}
	
	public String verificaHoraJogo(){
		String response = "";
		float horaInit = 0;
		float horaFinal = 0;
		float duracao = 0;
		
		System.out.println("Digite a hora inicial do jogo:");
		horaInit = sc.nextFloat();
		
		System.out.println("Digite a hora final do jogo:");
		horaFinal = sc.nextFloat();
		
		if (horaInit <  horaFinal) {
			duracao = (horaFinal - horaInit);
		} else {
			duracao = (24 - horaInit) + horaFinal;
			System.out.println(duracao);
		}
		
		
		return "A duração total do jogo foi de: " + duracao;
	}
	
	public String calcPedido() {
		int codigoItem = 0;
		int quantidade = 0;
		double conta = 0;
		
		System.out.println("Digite o código do item que você quer:");
			codigoItem = sc.nextInt();
		System.out.println("Digite a quantidade de itens que você quer");
			quantidade = sc.nextInt();
			
		switch (codigoItem) {
			case 1: {
				conta = (4.00 * quantidade);
				break;
		
			} case 2: {
				conta = (4.50 * quantidade);
				break;
			
			} case 3: {
				conta = (5.00 * quantidade);
				break;
			
			} case 4: {
				conta = (2.00 * quantidade);
				break;
				
			} case 5: {
				conta = (1.50 * quantidade);
				break;
				
			} 
		}
		
		return "Sua conta total é de R$:" + conta;
		
	}
	
	public String selectInterval() {
		String response = "";
		double number = 0.0;
	
		System.out.println("Digite um número qualquer");
			number = sc.nextDouble();
			
		if ( number > 25 && number  <= 50 ) {
			response = "Intervalo (25,50]";
			
		} else if ( number >= 0 && number <= 25) {
			response = "Intervalo [0,25]";
			
		} else if ( number >= 75 && number <= 100) {
			response = "Intervalo (75,100]";
			
		} else {
			response = "Fora de intervalo";
			
		}
		
		return response;
	}
	
	public String descobQuadr() {
		double x = 0.0;
		double y = 0.0;
		
		String response = "";
		
		System.out.println("Digite  o primeiro valor double");
			x = sc.nextDouble();
		
		System.out.println("Digite o segundo valor double");
			y = sc.nextDouble();
			
		if (x == 0.0 && y == 0.0 ) {
			response = "Origem";
			
		} else if (x > 0.0 && y > 0.0) {
			response = "Está no quadrante 1";
			
		} else if (x > 0.0 && y < 0.0) {
			response = "Está no quadrante 4";
		
		} else if  (x < 0.0 && y < 0.0) {
			response = "Está no quadrante 3";
		
		} else if (x < 0.0 && y > 0.0) {
			response = "Está no quadrante 2";
		
		} else {
			response = "Não pertence a nenhum quadrante";
		}
		
		return response;
		
	}
	
	public String calcImpost() {
		double salario = 0.0;
		String response = "";
		double conta = 0.0;
		
		System.out.println("Digite o valor do salário");
			salario = sc.nextDouble();
			if (salario <= 2000.00) {
				response = "Isento";

	        } else if (salario <= 3000.00) {
	        	conta = (salario - 2000.00) * 0.08;
	        	response =  "R$" + conta;

	        } else if (salario <= 4500.00) {
	        	conta = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
	        	response = "R$" + conta;

	        } else {
	        	conta = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;
	        	response = "R$" + conta;
	        }			
			
		return response;
		
	}
	
	public static void main(String[] args) {
		
		//instanciamento da classe para utilizar as funções.
		Main  ce = new Main();
	
		/* 1) Verificar se um número digitado pelo usuário é negativo;
		System.out.println(ce.verificaNegativo());*/
		
		/* 2) Verifica se um número é par ou ímpar
		System.out.println(ce.verificaParImpar()); */
		
		/* 3) Veririfica se dois valores são múltilploes entre sí
		System.out.println(ce.verificaMultiplo()); */ 
		
		/*
		4)
		Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
		sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma 
		duração mínima de 1 hora e máxima de 24 horas.
		System.out.println(ce.verificaHoraJogo());
		*/
		
		/* 
		5) 
		Com base na tabela abaixo, escreva um programa que leia o código de um 
		item e a quantidade deste item. A seguir, calcule e mostre o valor da conta
		pagar. 
		System.out.println(ce.calcPedido());*/ 
		
		/*
		6)
		Você deve fazer um programa que leia um valor qualquer e apresente uma 
		mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		(75,100]) este valor se encontra. Obviamente se o valor não estiver em 
		nenhum destes intervalos, deverá ser impressa a mensagem 
		“Fora de intervalo”. */
		//System.out.println(ce.selectInterval());
		
		
		/*7) Le 2 numeros double e verifica em qual quadrante do plano ele pertence */
		//System.out.println(ce.descobQuadr());
		
		/* 8 Calcula imposto acumulado seguindo a tabela */
		//System.out.println(ce.calcImpost());
		
	}
}
