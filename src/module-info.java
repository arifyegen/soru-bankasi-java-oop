package sorular;

public class soruBanka {
	private String soru;
	private String siklar;
	// constructor eklemdi
	public soruBanka () {
		this.soru = "";
		this.siklar = "";
	}
	
	// fonksiyon içerisine aktarmak için   
	public soruBanka (String soru, String siklar ) {
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
	public void setSiklar(String siklar) {
		this.siklar=siklar;
	}
	//Override araþtýr?
}