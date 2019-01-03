import java.util.Scanner;

public class övn2p3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String trosa;
		
		System.out.print("Skriv in en text: ");
		trosa = scan.nextLine();
		
		String replaceString = trosa.replace("m","x");
		System.out.println(replaceString);

		scan.close();
	}

}
