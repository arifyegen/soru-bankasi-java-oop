
package proje1;


import java.util.*;

public class SoruBankası{
    
    static enum secenek {YAPILMADI,EKLE,SİL,LİSTELE,CIKIS}
   
    static String[] sorular;
    static Scanner input =new Scanner(System.in);

    
     public static void main(String[] args) {
        secenek secim = secenek.YAPILMADI;
        do{
            ekranaSecimleriListele();
            secim = secimAl();
            secimiCalistir(secim);
        }while (secim != secenek.CIKIS);
        
        }
     
    
     private static void ekranaSecimleriListele(){
                System.out.println("-------------------------");
		System.out.println("|                       |");
		System.out.println("| 1. Soru Ekle          |");
		System.out.println("| 2. Soru Sil           |");
		System.out.println("| 3. Sorulari Listele   |");
		System.out.println("| 4. Cikis              |");
		System.out.println("|                       |");
		System.out.println("-------------------------");
		System.out.print("* Se�iminiz: ");
    }
     
    private static secenek secimAl(){
         secenek secim= secenek.YAPILMADI;
         int secim = input.nextInt();
         switch(secim){
             case 1:
                 secilen = secenek.EKLE;
                 break;
             case 2:
                 secilen = secenek.SIL;
                 break;
             case 3:
                 secilen = secenek.LISTELE;
                 break;
             case 4:
                 secilen =secenek.CIKIS;
                 break;
             default:
                 break;
         }
         return secilen;
     }
    private static void secimiCalistir(secenek secim){
        switch (secim){
        
            case EKLE:
                sEkle();
                break;
            case SIL:
                sSil();
                break;
            case LISTELE:
                sListele();
                break;
            default :
                break;
        }
    }
    // for hatası çözülecek 
    private static void sListele(){
        int i=0;
        System.out.println("\n------------sorular---------");
        for (Soru soru : sorular){
            System.out.println(i+"->"+soru);
            i++;
        }
        System.out.println("\n----------------------------\n\n");
    }
    
    
    
    //soru ekleme metodu 
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
    //soru silme metodu eklendi 
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
    
}