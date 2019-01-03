import java.util.Scanner;
public class övn3p8 {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 int talett, taltvå;
	 
	 System.out.print("Ange tal 1: ");
	 talett = scan.nextInt();
	 
	 System.out.print("Ange tal 2: ");
	 taltvå = scan.nextInt();
	 
	 if (talett > taltvå)
		 System.out.print(talett + " är större än " + taltvå);
	 else if (talett < taltvå)
		 System.out.println(taltvå + " är större än " + talett);
	 else {
		 System.out.println("Talen är lika");
		 
	 }
	 scan.close();

	}

}
