import java.util.Scanner;
public class övn2p2 {

	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);

		String namn;
		
		System.out.print("Skriv in ett namn: ");
		namn = scan.nextLine();
		
		int antal = namn.length();
		System.out.println(namn + ", ditt namn innehåller " + antal + " tecken");
		
		scan.close();
	}

}
