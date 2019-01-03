
public class övn4_1 {

	private String namn;
	private String personnr;
	private int timlön;
	private int arbetadeTimmar;
	private int lön;
	
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
	public int getTimlön() {
		return timlön;
	}
	public void setTimlön(int newTimlön) {
		timlön = newTimlön;
	}
	public int getArbetadeTimmar() {
		return arbetadeTimmar;
	}
	public void setArbetadeTimmar(int newArbetadeTimmar) {
		arbetadeTimmar = newArbetadeTimmar;
	}
	public int getLön() {
		return lön;
	}
	public void setLön(int timlön, int timmar) {
		lön = timlön * timmar; 
	}
}
