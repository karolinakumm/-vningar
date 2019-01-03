import java.util.Scanner;

public class övn3p21 {

	public static void main(String[] args) {
		int tal;
		int min;
		int max;

		Scanner scan = new Scanner(System.in);

		System.out.print("Ange tal 1: ");
		tal = scan.nextInt();
		min = tal;
		max = tal;

		for (int i = 2; i <= 5; i++) {
			System.out.print("Ange tal" + i + ": ");
			tal = scan.nextInt();

			if (tal > max) {
				max = tal;
			}
			if (tal < min) {
				min = tal;
			}

		} // for
		System.out.println("Största: " + max + "\nminsta: " + min);
		scan.close();
	}

}
