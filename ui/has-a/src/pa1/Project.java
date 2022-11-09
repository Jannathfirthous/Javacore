package pa1;

public class Project extends Employee {

	String projectName;
	int allocatedDays;

	public Project(String projectName, int allocatedDays) {
		super();
		this.projectName = projectName;
		this.allocatedDays = allocatedDays;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getAllocatedDays() {
		return allocatedDays;
	}

	public void setAllocatedDays(int allocatedDays) {
		this.allocatedDays = allocatedDays;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", allocatedDays=" + allocatedDays + "]";
	}

}
