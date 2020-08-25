import java.util.ArrayList;
import java.util.List;

public class Sayi {

	private List<AsalCarpan> asalCarpanList = new ArrayList<>();
	private int sayi;

	public Sayi(int sayi) {
		super();
		this.sayi = sayi;
	}

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int newSayi) {
		sayi = newSayi;
	}

	public void asalCarpanlaraAyir() {

		int n = getSayi();

		for (int i = 2; i <= n; i++) {
			AsalCarpan asalcarpan = new AsalCarpan(0, 0);
			int count = 0;
			while (n % i == 0) {

				n /= i;
				count++;
			}
			asalcarpan.setAsaldeger(i);
			asalcarpan.setKatsayi(count);
			if (asalcarpan.getKatsayi() > 0) {
				asalCarpanList.add(asalcarpan);
			}
		}
	}

	public List<AsalCarpan> getAsalCarpanList() {
		return asalCarpanList;
	}

	public void setAsalCarpanList(List<AsalCarpan> asalCarpanList) {
		this.asalCarpanList = asalCarpanList;
	}

	@Override
	public String toString() {

		return String.valueOf(getSayi()) + getAsalCarpanList();
	}

}
