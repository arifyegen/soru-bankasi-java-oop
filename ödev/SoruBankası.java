package proje1;


import java.util.*;

public class SoruBankası{
    
    static enum secenek {YAPILMADI,BASLA,EKLE,SİL,LİSTELE,CIKIS}
   
    static String[] sorular;
    static Scanner input =new Scanner(System.in);

    //main fonk.
     public static void main(String[] args) {
        secenek secim = secenek.YAPILMADI;
        do{
            ekranaSecimleriListele();
            secim = secimAl();
            secimiCalistir(secim);
        }while (secim != secenek.CIKIS);
        
        }
    //seçimleri ekrana yazar
     private static void ekranaSecimleriListele(){
        System.out.println("-------------------------");
		System.out.println("| 1. Sorulara basla     |");
		System.out.println("| 2. Soru Ekle          |");
		System.out.println("| 3. Soru Sil           |");
		System.out.println("| 4. Sorulari Listele   |");
		System.out.println("| 5. Cikis              |");
		System.out.println("-------------------------");
		System.out.print("* Seciminiz: ");
    }
     //seçenekleri değişkenler atar 
    private static secenek secimAl(){
         secenek secilen= secenek.YAPILMADI;
         int secim= input.nextInt();
         switch(secim){
             case 1:
                 secilen = secenek.BASLA;
                break;
             case 2:
                 secilen = secenek.EKLE;
                 break;
             case 3:
                 secilen = secenek.SIL;
                 break;
             case 4:
                 secilen = secenek.LISTELE;
                 break;
             case 5:
                 secilen =secenek.CIKIS;
                 break;
             default:
                 break;
         }
         return secilen;
     }
     //listenelen seçimleri çalıştırır
    private static void secimiCalistir(secenek secim){
        switch (secim){
            case BASLA:
                sinavaBasla();
                break;
            case EKLE:
                sEkle();
                break;
            case SIL:
                sSil();
                break;
            case LISTELE:
                listeListeleme();
                break;
            default :
                break;
        }
    }
    //sinava baslama metodu
    private static void sinavaBasla(){
        int note=0,degisken;
        for (int i= 0; i<10; i++)
        {
            degisken = rand.nextInt(sorular.length);
            System.out.println(sorular[degisken]);
            char verilenCevap = input.nextLine().trim();
            if (verilenCevap == cevaplar[degisken])
            {
                System.out.println("verilen cevap dogru");
                note = note+ (get.zorluk*get.Puan);
            }else{
                System.out.println("verilen cevap dogru değildir");
                System.out.println("dogru cevap"+get.cevaplar[degisken]);
            }
            if (note >= 100){
                System.out.println("notunuz 100 olmuştur");
                break;
            }else if (i==9)
            {
                System.out.println("sınav bitmiştir"+note);
                break;
            }else{
                continue;
            }
               
        }
    }
    // listelem seçeneklerini listeleme metodu
    private static void listeListeleme(){
        System.out.println("listeleme seklini giriniz");
        System.out.println("sorulari listelemek icin 1");
        System.out.println("bir kritere göre listeleme icin 2");
        int listeIcınAl = input.nextInt();
        if (listeIcınAl == 1){
            sListele();
        }else{
            sIcindeListele();
        }
    }
    // soruları listeleme metodu 
    private static void sListele(){
        int i=0;
        System.out.println("\n------------sorular---------");
        for (Soru soru : sorular){
            System.out.println(i+"->"+soru);
            i++;
        }
        System.out.println("\n----------------------------\n\n");
    }
    // sorunun içinde arama metodu duzeltilecek 
    private static void sIcindeListele(){
        System.out.println("lutfen hangi katagoride seçim yapacaksanız giriniz");
        System.out.println("1. Soru metni içinde arama");
        System.out.println("2. Soru şıklarının metinleri içinde");
        System.out.println("3. Doğru şıkları uzerinden arama ");
        System.out.println("4. Puan uzerinden arama");
        System.out.println("5. Zorluk derecesinden arama");
        int ara = input.nextInt();

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
    private static void metinIci(){
        sorular srlr = new sorular[i];
        String srlrAl = input.nextLine().trim();
        System.out.println("lutfen aramak istediginiz cumleyi giriniz");
        
        for (int i =0;i<sorular.length;i++)
        {
            if (srlrAl == sorular[i].contains(metinAl))
            {
                System.out.println("girilen kelime ile ilgili sorular");
                System.out.println(sorular[i]);
            }else{
            System.out.println("böyle bi cumle bulunmamakta");
                }
        }
    }
    //sik metni icinde arama yapma metodu eklenecek 
    private static void sikMetinIci(){
        cevaplar cvp = new cevaplar[i];
        string cvpAl = input.nextLine().trim();
        System.out.println("lütfen cevaplarda aramak istediginiz cumleyi giriniz ");
        for (int i=0;i<cevaplar.length;i++)
        {
            if (cvpAl == cevaplar[i].contains(cvpAl))
            {
                System.out.println(cevaplar[i]);
            }else{
                System.out.println("böyle bir cumle iceren sik bulunamadi");
            }
        }
    }
    //dogru sik icinde arama 
    private static void dogruSikIci(){
        System.out.println("lutfen Hangi sikki istediginizi belirtiniz");
        String sikAl = input.nextLine().trim();
        for (int i = 0;i<sorular.length;i++){
            switch(sikAl.toLowerCase()){
                case(a):
                {
                     System.out.println(sorular.dCevap[i]);
                }
                case(b):
                {
                    System.out.println(sorular.dCevap[i]);
                }
                case(c):
                {
                    System.out.println(sorular.dCevap[i]);
                }
                case(d):
                {
                    System.out.println(sorular.dCevap[i]);
                }
            }
            
        }
    }
    //zorluk seviyesine göre siralandirma eklendi
    private static void puanIci(){
        System.out.println("lutfen arama yapmak istediginiz puani giriniz (10,20,30)");
        int pAl = input.nextInt();
            for (int i = 0 ; i< sorular.length;i++){
                if (soru.puani == 10){
                    System.out.println(soru[i]);
                }else if(soru.puani == 20){
                    System.out.println(soru[i]);
                }else if (soru.puani[i]){
                     System.out.println(soru[i]);
                }else{
                     System.out.println(pAl+"bu seviyede bir zorluk nulunamadi");
                }
            }    
    }
    // zorluk seviyesine göre sıralndırıldı algoritma incelenecek !!!
    private static void zorlukIci(){
        System.out.println("lutfen zorluk derecesini belirtiniz");
        System.out.println("kolay icin 1");
        System.out.println("orta icin 2");
        System.out.println("zor icin 3");
        int zAl = input.nextInt();
        switch(zAl){
            case(1):
            for (int i = 0;i<sorular.length;i++)
            {
                if (soru.zorluk[i] == 1){
                System.out.println("zor soru numaraları" +sorular[i]);
                } else {
                    System.out.println("bu derece zorlukta bir soru yazılmadı");
                }
            }break;
            case(2):
            for (int i = 0;i<sorular.length;i++)
            {
                if (soru.zorluk[i] == 2){
                System.out.println("zor soru numaraları" +sorular[i]);
                } else {
                    System.out.println("bu derece zorlukta bir soru yazılmadı");
                }
            }break;
            case(3):
            for (int i = 0;i<sorular.length;i++)
            {
                if (soru.zorluk[i] == 3){
                System.out.println("zor soru numaraları" +sorular[i]);
                } else {
                    System.out.println("bu derece zorlukta bir soru yazılmadı");
                }
            }
            break;
            default:
            break;
        }
    }
    //soru ekleme metodu 
    private static  void sEkle(){
        
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
        Scanner input = new Scanner();
		System.out.print("Silinecek sorunun numarasını giriniz: ");
		int index = input.nextInt();
		if(index > sorular.length) {
			System.out.println("Soru silinemedi!");
		}else {
			sorular s = sorular.get(index-1);
			sorular.remove(index-1);
			System.out.println(s+" --> Soru silindi \n\n\n");
		}
	}
    
}