
public class �vn4_1 {

	private String namn;
	private String personnr;
	private int timl�n;
	private int arbetadeTimmar;
	private int l�n;
	
	public String getNamn() {
		return namn;
	}
	public void setNamn(String newNamn) {
		namn = newNamn;
	}
	public String getPersonnr() {
		return personnr;
	}
	public void setPersonnr(String newPersonnr) {
		personnr = newPersonnr;
	}
	public int getTiml�n() {
		return timl�n;
	}
	public void setTiml�n(int newTiml�n) {
		timl�n = newTiml�n;
	}
	public int getArbetadeTimmar() {
		return arbetadeTimmar;
	}
	public void setArbetadeTimmar(int newArbetadeTimmar) {
		arbetadeTimmar = newArbetadeTimmar;
	}
	public int getL�n() {
		return l�n;
	}
	public void setL�n(int timl�n, int timmar) {
		l�n = timl�n * timmar; 
	}
}
