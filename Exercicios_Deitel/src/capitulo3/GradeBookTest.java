package capitulo3;

import java.util.Scanner;

public class GradeBookTest {

	//m�todo main
	public static void main (String[]args){
		
		//cria scanner
		Scanner in = new Scanner(System.in);
		
		//criando objeto
		GradeBook myGradeBook = new GradeBook();
		
		// Valor inicial de courseName
		System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName());
		
		//prompt para entra do nome do curso
		System.out.println("Please enter the course name");
		//String nameOfCourse= in.nextLine();// l� um linha de texto
		String theName=in.nextLine();//L� uma linha de texto
		myGradeBook.setCoursename(theName);// configura o nome do curso
		System.out.println();// gera sa�da de uma linha em branco
		
		// chamando o m�todo
		myGradeBook.displayMessage();
	}//fim do main
}//fim classe
