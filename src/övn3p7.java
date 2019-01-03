import java.util.Scanner;

public class övn3p7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pension = 65;
		int ålder;

		System.out.print("Skriv in din ålder: ");
		ålder = scan.nextInt();

		if (ålder > pension)
			System.out.println("Du har varit pensionär i: " + (ålder - pension) + " år");
		else if (ålder == pension)
			System.out.println("Grattis, du blev pensionär i år!!!");
		else {
			System.out.println("Du går i pension om: " + (pension - ålder) + " år");
		}
	scan.close();
	}

}
