import java.util.Scanner;

public class �vn1p11 {

	public static void main(String[] args) {

		Scanner scan;
		scan = new Scanner(System.in);

		int �rtillpension;
		final int pension = 65;
		int age;

		System.out.print("Skriv in din �lder: ");
		age = scan.nextInt();

		System.out.println();

		�rtillpension = pension - age;
		System.out.println("Du g�r i pension om: " + �rtillpension + "�r");

		scan.close();

	}

}
