package capitulo3;

public class GradeBook {
	
	private String courseName; // nome do curso
	
	//configurar nome do curso
	public void setCoursename(String name){
		courseName= name;// armazena o nome
	}
	
	//m�todo para recuperar o nome
	public String getCourseName(){
		return courseName;
	}
	
	// m�todo display
	public void displayMessage(){
		System.out.printf("Welcome to the GradeBook for\n%s!\n", courseName);
		
		
	}//fim m�todo
}// fim da classe
