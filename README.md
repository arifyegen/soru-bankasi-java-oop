# soru-bankasi-java-oop
#soru

## 2. Sınıf Java oop Ödevidir

Ödevler guruplar halinde yapılmaktadır. Projeye eklenen Contributors tarafından beraber oluşturulup sunulacaktır.

Bu ders kapsamında verilecek ödevler ile bir sınav yapıcı uygulaması gerçekleştirilecektir. Bu uygulamada soru bankası oluşturma ve sınav hazırlama gibi bölümler olacaktır. Birinci ödevde sınav yapıcı bir uygulamanın ilk aşaması gerçekleştirilecektir. Buna göre, aşağıdaki istenen şeyler gerçekleştirilebilmelidir:

### Soru Bankası Soru Ekleme 
Soru bankasına yeni soru eklenebilmelidir. Her bir soru çoktan seçmeli soru türünde olup aşağıdaki özellikleri içerir:

> 
  * Soru Metni
  * a,b,c,d gibi cevap şıkları
  * Cevabın hangi şık oldugu
  * Puan
  * Zorluk derecesi (kolay normal ve zor gibi)
  
### Soru bankasından soru çıkarma

Soru bankasından soru çıkartılırken öncelikle silinecek sorunun soru bankasından **bulunması** gereklidir. Bunun için silinmek istenen sorunun bulunmasında **“soru metni”** üzerinden arama yapılacaktır. Arama yapılacak kelime soru metinleri içerisinden aranarak soru metni içerisinde aranan kelimenin geçtiği sorular listelenecektir. Daha sonra kullanıcı filtrelenmiş listeden istediği soruyu seçerek silebilecektir.

### Soru bankasındaki soruları listeleme

Soru bankasındaki soruların tümü listelenebileceği gibi belli bir kritere uyan sorular da listelenebilmelidir. Bu kriterler aşağıdaki gibidir:
>
  1) Soru metni içinde arama
  2) Soru şıklarının metinleri içinde
  3) Doğru şıkları üzerinden arama (örneğin cevabı A şıkkı olanları listele gibi)
  4) Puan üzerinden arama (örneğin puanı 10 olan soruları listele gibi)
  5) Zorluk derecesi üzerinden listeleme (örneğin zor soruları listele gibi)

### Sınav oluşturma
 Puan toplamı 100-110 arasında olacak şekilde soru bankasından rasgele sorular seçilerek bir sınav oluşturulacaktır. Sınav soruları kullanıcıya sıra ile sorulmalı ve cevapları alınarak sınav sonunda sınavdan alınan not ekranda yazılmalıdır.
 
 ### Çıkış
 Çıkış seçildiğinde program sonlandırılmalıdır 
