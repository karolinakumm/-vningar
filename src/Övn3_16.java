import java.util.Scanner;

public class �vn3_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double summa = 0;
		double medeltal = 0;
		int antalTal = 0;
		int tal;

		System.out.print("Skriv in ett heltal: ");
		tal = scan.nextInt();

		while (tal != 0) {
			summa += tal;
			antalTal++;
			System.out.print("Skriv in ett heltal: ");
			tal = scan.nextInt();
		}
		if (antalTal != 0)
			medeltal = summa / antalTal;
		System.out.print("Medeltal: " + medeltal);

		scan.close();
	}

}
