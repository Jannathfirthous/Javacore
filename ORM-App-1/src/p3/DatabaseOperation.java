package p3;

import java.util.*;
import java.sql.*;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

import org.hibernate.Session;

public class DatabaseOperation {
	Scanner sc = new Scanner(System.in);
	Scanner strSc = new Scanner(System.in);
	Scanner l = new Scanner(System.in);

	public static void main(String[] args) {
		Session hibernate = HibernateConnection.getHibernateLink();

		Parent parent = new Parent("jahir", "Seydaly", 9234578912L);
		Parent grandparent = new Parent("abdulkasim", "faritha", 7665334222L);

		Vaccination v1 = new Vaccination("Chickenpox", LocalDate.of(2022, 3, 10).toString(), "no next dose",
				LocalDate.of(2022, 3, 10).toString(), "good", 200);
		Vaccination v2 = new Vaccination("Diptheria", LocalDate.of(2022, 3, 10).toString(), "Tetanus",
				LocalDate.of(2022, 3, 10).toString(), "good", 400);
		Vaccination v3 = new Vaccination("Hepatitis A", LocalDate.of(2022, 3, 10).toString(), "Hepatitis B",
				LocalDate.of(2022, 3, 10).toString(), "good", 800);
		Vaccination v4 = new Vaccination("Polio", LocalDate.of(2022, 3, 10).toString(), "Rotavirus",
				LocalDate.of(2022, 3, 10).toString(), "good", 900);
		Doctor d = new Doctor(100, "William", 10, 654897198L, "Kid specialization");
		Doctor d1 = new Doctor(102, "jan", 4, 6543215677L, "Heart specialization");
		Doctor d2 = new Doctor(101, "rocky", 6, 654321566L, "kidney specialization");
		Doctor d3 = new Doctor(103, "mike", 6, 654321566L, "Surgery specialization");

		List<Vaccination> AllVaccinationCertificates = Arrays.asList(v1, v2, v3, v4);
		List<Doctor> allDoctor = Arrays.asList(d, d1, d2, d3);

		Kid k1 = new Kid(LocalDate.of(2022, 7, 20).toString(), "Jannath", "female", 5);

		Hospital H = new Hospital(102, "Hospital - A", "A123");

		k1.setId(102);
		k1.setParentInfo(parent);
		k1.setParentInfo(grandparent);
		k1.setAllVaccination(AllVaccinationCertificates);
		k1.setHospitalInfo(H);
		H.setAlldoctor(allDoctor);

		insertKid(hibernate, k1);
		while (true) {
			DatabaseOperation db = new DatabaseOperation();
			System.out.println(" --------- MENU ---------");

			System.out.println("1. Add Kid ");
			System.out.println("Enter 1 to add Kid :");

			switch (new Scanner(System.in).nextInt()) {
			case 1:
				db.addKidDetails();
				break;

			default:
				break;
			}// end of while
		} // end of switch

	}// end of main

	public static void insertKid(Session hibernate, Kid k) {

		Transaction t1 = hibernate.beginTransaction();

		hibernate.save(k); // code to save kid in the database

		t1.commit();
		hibernate.close();

		System.out.println(" 5. Database commit & hibernate closed ...");
	}

	public void addKidDetails() {

		System.out.println("Enter Kid Name ");
		String kidname = strSc.nextLine();

		System.out.println("Enter DOB of kid: ");
		String dob = strSc.nextLine();
		System.out.println("Enter Gender of kid: ");
		String gender = strSc.nextLine();

		System.out.println("Enter Kid Weight ");
		int weight = sc.nextInt();

		System.out.println("Enter father name:");
		String fatherName = strSc.nextLine();

		System.out.println("Enter Mother name");
		String motherName = strSc.nextLine();

		System.out.println("Enter Phone number :");
		Long phno = l.nextLong();

		Parent p = new Parent(fatherName, motherName, phno);
		Kid K = new Kid(kidname, dob, gender, weight);
		int id = new Random().nextInt(200);
		K.setId(id);
		System.out.println("Kid Id : " + K.getId());

		KidDb kb = new KidDb();
		try {
			boolean status = kb.addKid(K, p);

			if (status) {
				System.out.println("INFO :- Kid details Added " + K.getId());
			} else {
				System.err.println("WARNING :- Contact to customer care , Kid details not added");
			}
		} catch (Exception e) {
			System.err.println("WARNING :- Contact to customer care , Kid details not added");
			System.out.println(e);
		}

	} // end addkidDetails

}// end of class
