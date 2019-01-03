
public class Appartment {

	private int idnbr;
	private int hyra;
	private int yta;

	public void setIdnummer(int nyttIdnummer) {
		this.idnbr = nyttIdnummer;
	}
	public int getIdnummer() {
		return this.idnbr;
	}
	public void setHyra(int hyra) {
		this.hyra = hyra;
	}
	public int getHyra() {
		return this.hyra;
	}
	public void setYta(int yta) {
		this.yta = yta;
	}
	public int getYta() {
		return this.yta;
	}
	public int prisPer≈r() {
		return this.getHyra() * 12; //return hyra * 12;
	}
	public int prisPerKvmPer≈r() {
		return this.prisPer≈r() / yta;
	}
	public int prisPerKvm() {
		return this.hyra / yta;
	}
}
