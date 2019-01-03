import java.util.Scanner;

public class övn2p1 {

	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);

		String name1, name2;

		System.out.print("Skriv in ett förnamn: ");
		name1 = scan.nextLine();

		System.out.print("Skriv in ett efternamn: ");
		name2 = scan.nextLine();

		System.out.println();

		System.out.print(name1 + ", " + name2);

		scan.close();
	}

}
