package sorular;

public class soruBanka {
	private String soru;
	private String siklar;
	// constructor eklemdi
	public soruBanka () {
		this.soru = "";
		this.siklar = "";
	}
	
	// fonksiyon i�erisine aktarmak i�in   
	public soruBanka (String soru, String siklar ) {
		this.soru = soru;
		this.siklar = siklar;
	}
	
	//sorular� get ve set metodlar� ile �ag�rmak i�in haz�rland�.
	public String getSoru() {
		return soru ;
	}
	public void setSoru(String soru) {
		this.soru = soru;
	}
	public String getSiklar() {
		return siklar;
	}
	public void setSiklar(String siklar) {
		this.siklar=siklar;
	}
	//Override ara�t�r?
}