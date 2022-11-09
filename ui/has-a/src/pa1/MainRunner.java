package pa1;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountant accountant = new Accountant("Jannath", 2000, "TaxFile", 2000000);
		accountant.worksOnTaxFile();

		Project whatsapp = new Project("what's App Advertisents", 15);
		Developer developer = new Developer(whatsapp, "Meta", "Rocky", 15000, 50000);
		developer.worksOnProject();

		SalesManager salesManager = new SalesManager("Jan", 90000, 15000, 0);
		salesManager.worksOnGrowth();

		salesManager.setSalary(200);
		int s = salesManager.getSalary();
		System.out.println(s);

		salesManager.setMedicalInsurance(0);
		int i = salesManager.getMedicalInsurance();
		System.out.println(i);

	}

}
