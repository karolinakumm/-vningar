
public class övn4_1_testAvAnställd {

	public static void main(String[] args) {

		övn4_1 a = new övn4_1();
		a.setNamn("Karro");
		a.setPersonnr("9201250561");
		a.setTimlön(140);
		a.setArbetadeTimmar(320);
		
		a.setLön(a.getTimlön(), a.getArbetadeTimmar());

		System.out.println(a.getLön());//Allt som har settats kan hämtas och skrivas ut här
	}
}
