
public abstract class Vara {
	private String namn;
	private double inPris;
	private String varunr;
	
	public void setNamn(String namn) {
		this.namn = namn;
	}
	public String getNamn() {
		return namn;
	}
	public void setInPris(double pris) {
		inPris = pris;
	}
	public double getInPris() {
		return inPris;
	}
	public abstract double fpris();

}
