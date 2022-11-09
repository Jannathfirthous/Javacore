package Task;

import java.util.Scanner;

import pa1.SalesManager;

public class MainRunner {
	Scanner sc = new Scanner(System.in);
	Scanner st = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountant a = new Accountant("jan", "Taxfile");
		a.worksOnTax();
		Project Whatsapp = new Project("What's App Advertisements", 15);
		Developer dev = new Developer(Whatsapp, "Rocky", "jan");
		dev.worksOnProject();
		Payroll pay = new Payroll("Jannath", "Developer", 7000, 1000, 2000);
		pay.payDetails();
		HrDetails hr = new HrDetails("Jannath", "08/09/2022", "ICICI", "Banglore");
		hr.hiringRecords();
		SalesManager salesManager = new SalesManager("jan", 10000, 100,1000);
		salesManager.worksOnGrowth();

		salesManager.setBasicSalary(200);
		int s = salesManager.getBasicSalary();
		System.out.println(s);

		salesManager.setMedicalInsurance(0);
		int i = salesManager.getMedicalInsurance();
		System.out.println(i);

	}

}
