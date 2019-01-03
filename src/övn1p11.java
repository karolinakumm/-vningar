import java.util.Scanner;

public class övn1p11 {

	public static void main(String[] args) {

		Scanner scan;
		scan = new Scanner(System.in);

		int årtillpension;
		final int pension = 65;
		int age;

		System.out.print("Skriv in din ålder: ");
		age = scan.nextInt();

		System.out.println();

		årtillpension = pension - age;
		System.out.println("Du går i pension om: " + årtillpension + "år");

		scan.close();

	}

}
