import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();

	}

	public void run() {

		int n;

		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç farklý deðer gireceksiniz yaz : ");
		n = scan.nextInt();
		System.out.println(n + " sayý giriniz : (Boþluk býrakarak)");

		ArrayList<Sayi> myList = new ArrayList<Sayi>();
		int dizi[] = new int[n];
		for (int i = 0; i < n; i++) {
			dizi[i] = scan.nextInt();
			myList.add(new Sayi(dizi[i]));
			myList.get(i).asalCarpanlaraAyir();
			System.out.println((i + 1) + " sayi " + myList.get(i).toString());
		}

		System.out.println("Obeb " + obebBul(dizi, n));
		System.out.println("Okek " + okekBul(dizi));

//		myList.get(0).asalCarpanlaraAyir();
//		sayi2.asalCarpanlaraAyir();
//
//		System.out.println("Sayi 1 : " + sayi1.toString());
//		System.out.println("Sayi 2 : " + sayi2.toString());
//
//
//		System.out.println("Obeb " + obebBul(sayi1, sayi2));
//		System.out.println("Okek " + okekBul(sayi1, sayi2));
		// emin olamadým buralardan
	}

	int ebob, ekok, kalan, bolunen, bolen;

	public long okekBul(int[] array) {

		long array_ekok = 1;
		int carpan = 2;

		while (true) {
			int sayac = 0;
			boolean bolunebilir = false;

			for (int i = 0; i < array.length; i++) {

				if (array[i] == 0) {
					return 0;
				} else if (array[i] < 0) {
					array[i] = array[i] * (-1);
				}
				if (array[i] == 1) {
					sayac++;
				}

				if (array[i] % carpan == 0) {
					bolunebilir = true;
					array[i] = array[i] / carpan;
				}
			}

			if (bolunebilir) {
				array_ekok = array_ekok * carpan;
			} else {
				carpan++;
			}

			if (sayac == array.length) {
				return array_ekok;
			}
		}

	}

	static int ebob(int a, int b) {
		if (a == 0) {
			return b;
		}
		return ebob(b % a, a);
	}

	static int obebBul(int arr[], int n) {
		int result = arr[0];
		for (int i = 1; i < n; i++) {
			result = ebob(arr[i], result);
		}

		return result;
	}

}
