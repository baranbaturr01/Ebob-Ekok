public class AsalCarpan {

	private int asaldeger;
	private int katsayi;

	public AsalCarpan(int asaldeger, int katsayi) {
		super();
		this.setAsaldeger(asaldeger);
		this.setKatsayi(katsayi);
	}

	public int getAsaldeger() {
		return asaldeger;
	}

	public void setAsaldeger(int asaldeger) {
		this.asaldeger = asaldeger;
	}

	public int getKatsayi() {
		return katsayi;
	}

	public void setKatsayi(int katsayi) {
		this.katsayi = katsayi;
	}

	@Override
	public String toString() {

		return String.valueOf(getAsaldeger()) + " sayısından " + String.valueOf(getKatsayi()) + " adet çarpan mevcut.";
	}

}
