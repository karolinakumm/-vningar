import java.util.Scanner;

public class �vn3p7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pension = 65;
		int �lder;

		System.out.print("Skriv in din �lder: ");
		�lder = scan.nextInt();

		if (�lder > pension)
			System.out.println("Du har varit pension�r i: " + (�lder - pension) + " �r");
		else if (�lder == pension)
			System.out.println("Grattis, du blev pension�r i �r!!!");
		else {
			System.out.println("Du g�r i pension om: " + (pension - �lder) + " �r");
		}
	scan.close();
	}

}
