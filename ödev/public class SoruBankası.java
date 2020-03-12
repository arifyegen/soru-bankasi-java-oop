package odev;
import java.util.*;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class SoruBankası{
    String[] sorular;
    Scanner input = new Scanner();

    
    public  void sEkle(){
        Soru s = new Soru();
		
		System.out.println("sorunun bilgilerini giriniz: ");
		
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
    
    public static void main(String[] args) {
		sEkle();
		
        }
    }
