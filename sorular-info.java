package sorular;

public class sorular {
	private String soru;
	private String siklar;
	// constructor eklemdi
	public soru () {
		this.soru = "";
		this.siklar = "";
	}
	// fonksiyon i�erisine aktarmak i�in   
	public soru (String soru, String siklar ) {
		this.soru = soru;
		this.siklar = siklar;
	}
	
	//sorular� get ve set metodlar� ile �ag�rmak i�in haz�rland�.
	public String getSoru() {
		return soru ;
	}
	public void setSoru() {
		this.soru = soru;
	}
	public String getSiklar() {
		return siklar;
	}
	public void setSiklar() {
		this.siklar=siklar;
	}
	//Override ara�t�r?
}