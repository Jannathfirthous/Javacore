package ListTask;

public class MainEmployee {
	public static void main(String[] args) {
		EmployeeService s=new EmployeeService();
    String codes[]=s.getEmployeeCodes();
    for(String empid:s.getEmployees())
    {
        if( empid.endsWith("011")) {
            System.out.println(empid.substring(0,3)+"-Chennai");
        }
        else if(empid.endsWith("022"))
        {
            System.out.println(empid.substring(0,3)+"-Delhi");
        }
        else if(empid.endsWith("080"))
        {
            System.out.println(empid.substring(0,3)+"-Ap");
        }
        else if(empid.endsWith("020"))
        {
            System.out.println(empid.substring(0,3)+"-Hyderabad");
        }
    
    }    
        
    }
}
