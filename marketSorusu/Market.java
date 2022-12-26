package marketSorusu;

import java.time.LocalDate;

public class Market {
    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;
    int urunAdedi;
     static  int toplamUrun;



    Market(String urunAdi,double urunFiyati,int aySonra,int urunAdedi) {
        this.urunAdi = urunAdi; //this().urunAdi==>bu classtaki urunAdi anlaminda karisikligi gidermek icin kullanilir.
        this.urunFiyati = urunFiyati;
        this.sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
        this.urunAdedi += urunAdedi;
        toplamUrun+=urunAdedi;
    }
 Market(){
     System.out.println("urun bilgi listesi");

 }
 Market(String urunAdi,double urunFiyati,int urunAdedi){
     this.urunAdi = urunAdi;
     this.urunFiyati = urunFiyati;
     this.urunAdedi=urunAdedi;
     this.sonKullanmaTarihi ="Bu urunun son kullanma tarihi yoktur.";
     toplamUrun+=urunAdedi;
 }
    public static  int adedBul(int...urunAdedi){
        int toplam = 0;
        for (int w:urunAdedi){
            toplam+=w;
        }
      return  toplam;
    }


}


