import java.util.Scanner;
public class övn1p13 {

	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		
		int tal1, tal2, summa; 
		double kvot;
		
		System.out.print("Skriv in ett tal: ");
		tal1 = scan.nextInt();
		
		System.out.print("Skriv in ytterligare ett tal: ");
		tal2 = scan.nextInt();
		System.out.println();
		
		summa = tal1 + tal2;
		System.out.println(tal1 + " + " + tal2 + " = " + summa);
		
		summa = tal1 - tal2;
		System.out.println(tal1 + " - " + tal2 + " = " + summa);
		
		summa = tal1 * tal2;
		System.out.println(tal1 + " * " + tal2 + " = " + summa);
		
		kvot = (double) tal1/tal2;
		System.out.println(tal1 + " / " + tal2 + " = " + kvot);
	
		scan.close();
	}

}
