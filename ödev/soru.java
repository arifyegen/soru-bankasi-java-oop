package proje1;
// sadece bir soru üzerinde duruyoruz burada 
public class Soru{
    private String soru;
    private int zorluk;
    private String[] cevaplar;
    private int puan;
    private char dCevap;

    public Soru(String soru, String[] cevaplar, char dCevap, int zorluk,int puan){
        this.soru=soru;
        this.cevaplar=cevaplar;
        this.zorluk=zorluk;
        this.puan=puan;
        this.dCevap=dCevap;
    }
    /**
     * @return the cevaplar
     */
    public String[] getCevaplar() {
        return cevaplar;
    }
    /**
     * @param cevaplar the cevaplar to set
     */
    public void setCevaplar(String[] cevaplar) {
        this.cevaplar = cevaplar;
    }
    /**
     * @return the soru
     */
    public String getSoru() {
        return soru;
    }
    /**
     * @param soru the soru to set
     */
    public void setSoru(String soru) {
        this.soru = soru;
    }
    /**
     * @return the zorluk
     */
    public int getZorluk() {
        return zorluk;
    }
    /**
     * @param zorluk the zorluk to set
     */
    public void setZorluk(int zorluk) {
        this.zorluk = zorluk;
    }
    /**
     * @return the puan
     */
    public int getPuan() {
        return puan;
    }
    /**
     * @param puan the puan to set
     */
    public void setPuan(int puan) {
        this.puan = puan;
    }
    /**
     * @return the dCevap
     */
    public char getdCevap() {
        return dCevap;
    }
    /**
     * @param dCevap the dCevap to set
     */
    public void setdCevap(char dCevap) {
        this.dCevap = dCevap;
    }
}