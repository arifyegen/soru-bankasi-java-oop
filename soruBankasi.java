package soruBankasi;
// util altýndaki tüm sýnýflarý ekledik.
import java.util.*;

public class Banka {
	// girdiðimiz verileri aslýnda bir diziye dödürdük
	enum sorIslevi {
	sEkle,
	sSil,
	sListele,
	sYok,
	son,
}
	static Vector<Kisi> sorular = null;
	// Kalvyeden veri alýmý 
	static Scanner alInput = new Scanner(System.in);
	// Main 
	public static void main(String args[]) {
		
		sorular = new vector <>();
		Secenek secim = Secenek.sYok;
		
		do {
			ekranSecimListesiGetir();
			secim = secimAl();
			secimiCalistir(secim);
		}while (secim != Secenek.CIKIS);
		
	}
	private static void ekranaSecimListesiniGetir() {
		
		System.out.println("*************************");
		System.out.println("*                       *");
		System.out.println("* 1. Soru Ekle          *");
		System.out.println("* 2. Soru Sil           *");
		System.out.println("* 3. Sorularý Listele   *");
		System.out.println("* 4. Çýkýþ              *");
		System.out.println("*                       *");
		System.out.println("*************************");
		System.out.print("* Seçiminiz: ");
	}
	private static Secenek secimiAl() {
		// TODO Auto-generated method stub
		
		Secenek secilen = Secenek.sYok; 
		int secim = input.nextInt();
		switch (secim) {
			case 1:
				secilen = Secenek.EKLE;
				break;
			case 2:
				secilen = Secenek.SIL;
				break;
			case 3:
				secilen = Secenek.LISTELE;
				break;
			case 4:
				secilen = Secenek.CIKIS;
				break;
			default:
				break;
		}
		return secilen;
	}
	private static void secimiCalistir(Secenek secim) {
		switch (secim) {
			case EKLE:
				soruEkle();
				break;
			case SIL:
				soruSil();
				break;
			case LISTELE:
				sorularýListele();
				break;
			default:
				break;
		}
		
	}
	private static void soruSil() {
		System.out.print("Silinecek sorunun indeksini giriniz: ");
		int index = alInput.nextInt();
		if(index > sorular.size()) {
			System.out.println("Böyle bir soru yok!");
		}else {
			Soru k = sorular.get(index-1);
			sorular.remove(index-1);
			System.out.println(k+" -->  silindi \n\n\n");
		}
	}
	private static void soruEkle() {
		 soru = new soru();
		
		System.out.println("Eklenecek soruyu yazýnýz: ");
		
		System.out.print("Soru: ");
		String soru = alInput.next().trim();
		k.setSoru(soru);
		
		System.out.print("siklar: ");
		String siklar = alInput.next().trim();
		k.setSiklar(siklar);
		
		sorular.add(k);
		
		System.out.println(" soru eklendi \n\n\n");
		
	}

}
