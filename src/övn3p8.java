import java.util.Scanner;
public class �vn3p8 {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 int talett, taltv�;
	 
	 System.out.print("Ange tal 1: ");
	 talett = scan.nextInt();
	 
	 System.out.print("Ange tal 2: ");
	 taltv� = scan.nextInt();
	 
	 if (talett > taltv�)
		 System.out.print(talett + " �r st�rre �n " + taltv�);
	 else if (talett < taltv�)
		 System.out.println(taltv� + " �r st�rre �n " + talett);
	 else {
		 System.out.println("Talen �r lika");
		 
	 }
	 scan.close();

	}

}
