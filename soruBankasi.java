package soruBankasi;
// util alt�ndaki t�m s�n�flar� ekledik.
import java.util.*;

public class Banka {
	// girdi�imiz verileri asl�nda bir diziye d�d�rd�k
	enum sorIslevi {
	sEkle,
	sSil,
	sListele,
	sYok,
	son,
}
	// nesneyi dizi olarak atad�k
	static Vector<soru> sorular = null;
	// Kalvyeden veri al�m� 
	static Scanner alInput = new Scanner(System.in);
	// Main 
	public static void main(String args[]) {
		// sorular i�in bir dizi 
		sorular = new vector <>();
		
		
		Secenek secim = Secenek.sYok;
		
		do {
			ekranSecimListesiGetir();
			secim = secimAl();
			secimiCalistir(secim);
		}while (secim != Secenek.CIKIS);
		
	}
	private static void ekranSecimListesiGetir() {
		
		System.out.println("*************************");
		System.out.println("*                       *");
		System.out.println("* 1. Soru Ekle          *");
		System.out.println("* 2. Soru Sil           *");
		System.out.println("* 3. Sorular� Listele   *");
		System.out.println("* 4. ��k��              *");
		System.out.println("*                       *");
		System.out.println("*************************");
		System.out.print("* Se�iminiz: ");
	}
	
	// se�im alma metodu
	private static Secenek secimiAl() {		
		Secenek secilen = Secenek.sYok; 
		int secim = input.nextInt();
		switch (secim) {
			case 1:
				secilen = Secenek.sEkle;
				break;
			case 2:
				secilen = Secenek.sSil;
				break;
			case 3:
				secilen = Secenek.sListele;
				break;
			case 4:
				secilen = Secenek.son;
				break;
			default:
				break;
		}
		return secilen;
	}
	//se�imi �al��t�rma metodu
	private static void secimiCalistir(Secenek secim) {
		switch (secim) {
			case sEkle:
				soruEkle();
				break;
			case sSil:
				soruSil();
				break;
			case sListele:
				sorular�Listele();
				break;
			default:
				break;
		}
		
	}
	private static void sorular�Listele() {
		int i = 1;
		System.out.println("\n--------Sorular-------\n\n");
		for (Soru soru : sorular) {
			System.out.println(i+"->"+soru);
			i++;
		}
		System.out.println("\n-------------------------\n\n");
	}

	
	private static void soruSil() {
		System.out.print("Silinecek sorunun indeksini giriniz: ");
		int index = alInput.nextInt();
		if(index > sorular.size()) {
			System.out.println("B�yle bir soru yok!");
		}else {
			Soru k = sorular.get(index-1);
			sorular.remove(index-1);
			System.out.println(k+" -->  silindi \n\n\n");
		}
	}
	private static void soruEkle() {
		 soru = new soru();
		
		System.out.println("Eklenecek soruyu yaz�n�z: ");
		
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
