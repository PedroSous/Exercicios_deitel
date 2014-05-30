package capitulo2;

import java.util.Scanner;

public class Soma_de_inteiros {
	// método principal
	public static void main (String[]args){
		
		//criar um Scanner para obeter entrada da janela de comando
		Scanner in = new Scanner(System.in);
		
		// variaveis
		int number1;
		int number2;
		int sum;
		
		System.out.print("Entre  com o primeiro numero: ");
		number1 = in.nextInt(); // le o primeiro numero
		
		System.out.print("Entre com o segundo numero: ");
		number2 = in.nextInt(); //le o segundo numero
		
		sum = number1 + number2;
		
		System.out.printf("A soma é %d\n", sum); // exibe a soma 
	}//fim main

}//fim classe
