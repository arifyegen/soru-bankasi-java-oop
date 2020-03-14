
package proje1;


import java.util.*;

public class SoruBankası{
    
    static enum secenek {YAPILMADI,EKLE,SİL,LİSTELE,CIKIS}
   
    static String[] sorular;
    static Scanner input =new Scanner(System.in);

    
     public static void main(final String[] args) {
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
		System.out.print("* Seciminiz: ");
    }
     
    private static secenek secimAl(){
         final secenek secim= secenek.YAPILMADI;
         final int secim = input.nextInt();
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
    private static void secimiCalistir(final secenek secim){
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
    // soruları listeleme metodu 
    private static void sListele(){
        int i=0;
        System.out.println("\n------------sorular---------");
        for (final Soru soru : sorular){
            System.out.println(i+"->"+soru);
            i++;
        }
        System.out.println("\n----------------------------\n\n");
    }
    // sorunun içinde arama metodu düzeltilecek 
    public static void sIcindeListele(){
        System.out.println("lütfen hangi katagoride seçim yapacaksanız giriniz");
        System.out.println("1. Soru metni içinde arama");
        System.out.println("2. Soru şıklarının metinleri içinde");
        System.out.println("3. Doğru şıkları üzerinden arama ");
        System.out.println("4. Puan üzerinden arama");
        System.out.println("5. Zorluk derecesinden arama");
        final int ara = input.nextInt();

        switch(ara){
            case(1):
                metinIci();
                break;
            case(2):
                sikMetinIci();
                break;
            case(3):
                dogruSikIci();
                break;
            case(4):
                puanIci();
                break;
            case(5):
                zorlukIci();
                break;        
            default:
                break;
        }
       
    }

    //metin içinde arama yapma metodu 
    public static void metinIci(){

    }
    //sik metni icinde arama yapma metodu
    public static void sikMetinIci(){

    }
    //dogru sik icinde arama 
    public static void dogruSikIci(){

    }
    public static void puanIci(){

    }
    public static void zorlukIci(){
        System.out.println("");
    }
    //soru ekleme metodu 
    public static  void sEkle(){
        
        System.out.println("sorunun bilgilerini giriniz: ");
        final Soru s = new Soru();
		
		System.out.print("soru: ");
		final String soru = input.next().trim();
		s.setSoru(soru);
		
        System.out.print("cevaplar: \n ***ilk girdi A sikki, ikinci girdi B sikki, ucuncu girdi C sikki, dorduncu girdi D sikki****\n");
        final String [] siklar;
        for (int i =0;i<4;i++){
        siklar[i] = input.next().trim();    
        s.setCevaplar(siklar);
        }
        System.out.println(" zorluk: \n 1: kolay 2: orta 3: zor \n");
        final int zorluk = input.nextInt();
        s.setZorluk(zorluk);

        System.out.println("doğru cevap: \n a: Asikki, b:B sikki, c:C sikki, d:D sikki\n");       
        final char dCevap =input.next().trim();
    }
    //soru silme metodu eklendi 
    private static void sSil() {
        final Soru s = new Soru();
        final Scanner input = new Scanner();
		System.out.print("Silinecek sorunun numarasını giriniz: ");
		final int index = input.nextInt();
		if(index > sorular.size()) {
			System.out.println("Soru silinemedi!");
		}else {
			final Soru s = sorular.get(index-1);
			sorular.remove(index-1);
			System.out.println(s+" --> Soru silindi \n\n\n");
		}
	}
    
}