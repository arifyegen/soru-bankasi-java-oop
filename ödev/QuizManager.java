package proje1;
// burada tüm sorular ve cevaplar üzerinde duruyoruyz
public class QuizManager{
    
    private String sorular;
    private String cevaplar;

    public QuizManager(String sorular, String cevaplar){
        this.cevaplar=cevaplar;
        this.sorular=sorular;
    }
    /**
     * @return the sorular
     */
    public String getSorular() {
        return sorular;
    }
    /**
     * @param sorular the sorular to set
     */
    public void setSorular(String sorular) {
        this.sorular = sorular;
    }
    /**
     * @return the cevaplar
     */
    public String getCevaplar() {
        return cevaplar;
    }
    /**
     * @param cevaplar the cevaplar to set
     */
    public void setCevaplar(String cevaplar) {
        this.cevaplar = cevaplar;
    }

}
