package capitulo3;

public class GradeBook {
	
	private String courseName; // nome do curso
	
	//configurar nome do curso
	public void setCoursename(String name){
		courseName= name;// armazena o nome
	}
	
	//método para recuperar o nome
	public String getCourseName(){
		return courseName;
	}
	
	// método display
	public void displayMessage(){
		System.out.printf("Welcome to the GradeBook for\n%s!\n", courseName);
		
		
	}//fim método
}// fim da classe
