package capitulo3;

import java.util.Scanner;

public class GradeBookTest {

	//método main
	public static void main (String[]args){
		
		//cria scanner
		Scanner in = new Scanner(System.in);
		
		//criando objeto
		GradeBook myGradeBook = new GradeBook();
		
		// Valor inicial de courseName
		System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName());
		
		//prompt para entra do nome do curso
		System.out.println("Please enter the course name");
		//String nameOfCourse= in.nextLine();// lê um linha de texto
		String theName=in.nextLine();//Lê uma linha de texto
		myGradeBook.setCoursename(theName);// configura o nome do curso
		System.out.println();// gera saída de uma linha em branco
		
		// chamando o método
		myGradeBook.displayMessage();
	}//fim do main
}//fim classe
