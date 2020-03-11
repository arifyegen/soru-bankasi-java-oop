package soruBankas�;

public class sorular {
	private String soru;
	private String siklar;
	// constructor eklemdi
	public soru () {
		this.soru = "";
		this.siklar = "";
	}
<<<<<<< HEAD
	// fonksiyon i�erisine aktarmak i�in   
	public sorular (String soru, String siklar ) {
=======
	// fonksiyon içerisine aktarmak için   
	public soru (String soru, String siklar ) {
>>>>>>> 67f52effead225f34f8bcd6305e1cb14a6d184d6
		this.soru = soru;
		this.siklar = siklar;
	}
	
	//sorularý get ve set metodlarý ile çagýrmak için hazýrlandý.
	public String getSoru() {
		return soru ;
	}
	public void setSoru(String soru) {
		this.soru = soru;
	}
	public String getSiklar() {
		return siklar;
	}
	public void setSiklar(String sikler) {
		this.siklar=siklar;
	}
	//Override arastir?
}
