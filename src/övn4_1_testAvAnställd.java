
public class �vn4_1_testAvAnst�lld {

	public static void main(String[] args) {

		�vn4_1 a = new �vn4_1();
		a.setNamn("Karro");
		a.setPersonnr("9201250561");
		a.setTiml�n(140);
		a.setArbetadeTimmar(320);
		
		a.setL�n(a.getTiml�n(), a.getArbetadeTimmar());

		System.out.println(a.getL�n());//Allt som har settats kan h�mtas och skrivas ut h�r
	}
}
