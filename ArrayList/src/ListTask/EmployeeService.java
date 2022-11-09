package ListTask;

public class EmployeeService {
	 private String employees[]= {"101001011","102001022","103002011","104003080","105002020","106002080"};
     
	    public String[] getEmployees() {
		return employees;
	}

	public void setEmployees(String[] employees) {
		this.employees = employees;
	}

		public String[] getEmployeeCodes()
	    {
	        String codes[]=new String[employees.length];
	        int count=-1;
	        
	        for(String empid:employees)
	        {
	            codes[++count]=empid;
	        }
	        
	        return codes;
	    }

}
