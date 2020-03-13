package ödev;
import java.util.*;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class SoruBankası{
    String[] sorular;
    Scanner input = new Scanner();
    
    
    public static  void sEkle(){
        
        System.out.println("sorunun bilgilerini giriniz: ");
        Soru s = new Soru();
		
		System.out.print("soru: ");
		String soru = input.next().trim();
		s.setSoru(soru);
		
        System.out.print("cevaplar: \n ***ilk girdi A sikki, ikinci girdi B sikki, ucuncu girdi C sikki, dorduncu girdi D sikki****\n");
        String [] siklar;
        for (int i =0;i<4;i++){
        siklar[i] = input.next().trim();    
        s.setCevaplar(siklar);
        }
        System.out.println(" zorluk: \n 1: kolay 2: orta 3: zor \n");
        int zorluk = input.nextInt();
        s.setZorluk(zorluk);

        System.out.println("doğru cevap: \n a: Asikki, b:B sikki, c:C sikki, d:D sikki\n");       
        char dCevap =input.next().trim();
    }
    private static void sSil() {
        Soru s = new Soru();
        Scanner input = new Scanner();
		System.out.print("Silinecek sorunun indeksini giriniz: ");
		int index = input.nextInt();
		if(index > sorular.size()) {
			System.out.println("Kayit silinemedi!");
		}else {
			Soru s = sorular.get(index-1);
			sorular.remove(index-1);
			System.out.println(s+" --> Kayd silindi \n\n\n");
		}
	}
    
    public static void main(String[] args) {
       // sEkle();
        sSil();
        sEkle();
		
        }
    }
