package p1;

import java.util.Scanner;

public class DeviceApp {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new DeviceApp().startWork();
	}

	public void startWork() {

		while (true) {

			System.out.println("Choose Devices ");
			System.out.println("1. Laptop ");
			System.out.println("2. Mobile");

			switch (sc.nextInt()) {
			case 1:
				Laptop l = new Laptop();
				l.setLapTopdetails("Laptop", "M2", 50000, 4, "Apple Macbook Air", 32);
				l.playGames();
				break;

			case 2:
				Mobile m = new Mobile();
				m.setMobliedetails("Mobile", "M3", 10000, 4, "Poco M3", 64);
				m.playGames();
				break;

			default:
				System.out.println("Wrong Option");
				System.exit(0);
				break;
			}

		}

	}

}
