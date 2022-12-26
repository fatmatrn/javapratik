package marketSorusu;

public class MarketRunner {
    public static void main(String[] args) {


        Market market = new Market();

        Market ekmek = new Market("ekmek",4.0,1,100);
        System.out.println("urunadi: " + ekmek.urunAdi+" fiyat: "+ekmek.urunFiyati+" skt: "+ekmek.sonKullanmaTarihi+" adet: "+ekmek.urunAdedi+" toplamUrun: "+ekmek.toplamUrun);

        Market nutella = new Market("nutella",4.0,20,200);
        System.out.println("urunadi: " + nutella.urunAdi+" fiyat: "+nutella.urunFiyati+" skt: "+nutella.sonKullanmaTarihi+" adet: "+nutella.urunAdedi+" toplamUrun: "+nutella.toplamUrun);

        Market bardak = new Market("bardak",4.0,1000);
        System.out.println("urunadi: " + bardak.urunAdi+" fiyat: "+bardak.urunFiyati+" skt: "+bardak.sonKullanmaTarihi+" adet: "+bardak.urunAdedi+" toplamUrun: "+bardak.toplamUrun);






    }
}
