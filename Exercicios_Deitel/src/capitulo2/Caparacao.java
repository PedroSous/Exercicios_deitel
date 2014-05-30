package capitulo2;

import java.util.Scanner;

public class Caparacao {

	// método principal
	public static void main(String[]args){
		
		Scanner in = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.print("Entre com primeiro numero: ");
		number1 = in.nextInt();// lê primeiro numero
		
		System.out.print("Entre com segundo numero: ");
		number2 = in.nextInt();// Lê o segundo numero
		
		if(number1== number2){// number 1 igul number 2
			System.out.printf("%d==%d\n", number1, number2);
		}
		if(number1!= number2){// diferentes
			System.out.printf("%d!=%d\n", number1,number2);
		}
		if(number1 < number2){// number2 maior que 1
			System.out.printf("%d < %d\n", number1, number2);
		}
		if(number1 > number2){// number 1 maoir 2
			System.out.printf("%d > %d\n", number1, number2);
		}
		if(number1 <= number2){// number2 maior que 1
			System.out.printf("%d < %d\n", number1, number2);
		}
		if(number1 >= number2){// number 1 maoir 2
			System.out.printf("%d > %d\n", number1, number2);
		}
		
	}//fim main
}//fim classe
