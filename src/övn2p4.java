import java.util.Scanner;
import java.text.DecimalFormat;

public class övn2p4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat mjau = new DecimalFormat(".##");
		
		String NAMN, namn;
		int hyra, kvm;
		double kostnad;
		String malala;
		
		
		System.out.print("Ange ägarens namn: ");
		namn = scan.nextLine();
		
		System.out.print("Ange din månadshyra: ");
		hyra = scan.nextInt();
		
		System.out.print("Ange lägenhetens storlek i kvadratmeter i månaden: ");
		kvm = scan.nextInt();
		
		kostnad = (double) hyra/kvm;
		NAMN = namn.toUpperCase();
		malala = mjau.format(kostnad);
		System.out.print(NAMN + " du betalar " + malala + " kronor per kvadratmeter i månaden.");
		
		scan.close();
	}

}
