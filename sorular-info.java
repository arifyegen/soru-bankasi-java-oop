package sorular;

public class sorular {
	private String soru;
	private String siklar;
	// constructor eklemdi
	public soru () {
		this.soru = "";
		this.siklar = "";
	}
	// fonksiyon içerisine aktarmak için   
	public soru (String soru, String siklar ) {
		this.soru = soru;
		this.siklar = siklar;
	}
	
	//sorularý get ve set metodlarý ile çagýrmak için hazýrlandý.
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
	//Override araþtýr?
}