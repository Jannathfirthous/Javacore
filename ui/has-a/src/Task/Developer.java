package Task;

public class Developer extends Employee {
	Project project;
	String clientName;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String client) {
		this.clientName = client;
	}

	public Developer(String name,int salary) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(Project project, String clientName,String name) {
		super(name);
		this.project = project;
		this.clientName = clientName;

	}

	@Override
	public String toString() {
		return "Developer [project=" + project + ", clientName=" + clientName + "]";
	}

	public void worksOnProject() {
		/*System.out.println(name);
		System.out.println(salary);*/
		//System.out.println(project.getProjectName());
		System.out.println(name+" working on "+project.getProjectName());
	}

}
