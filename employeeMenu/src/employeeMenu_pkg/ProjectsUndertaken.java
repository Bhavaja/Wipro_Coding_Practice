package employeeMenu_pkg;

public class ProjectsUndertaken {
	
	String project_1;
	String project_2;
	
	public ProjectsUndertaken(String project_1,String project_2) {		
		this.project_1 = project_1;
		this.project_2 = project_2;	
	}
	
	public void display() {
		System.out.println("-----Project details------");
		System.out.println("Project 1: "+project_1);
		System.out.println("Project 2: "+project_2);
	}

}
