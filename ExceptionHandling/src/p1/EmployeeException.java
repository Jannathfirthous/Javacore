package p1;

public class EmployeeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public EmployeeException() {
		super();
	}

	public EmployeeException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String toString() {
		return msg;
	}

}
