package kitapci;

import java.util.HashMap;
import java.util.Scanner;
/*
 * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
 * baslayinca menu isminde bir method calissin		 * 1-kitap ekle		 * 2-numara ile kitap goruntule
 * 3-bilgi ile kitap goruntule		 * 4-numara ile kitap sil		 * 5-tum kitaplari listele
 * 6-cikis		 ************************************
 * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
 * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
 * olmali yani bir list'te tutmamiz gerek		 * 2-kitap numarasi 1000'den
 * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
 * count=1000; menu isminde bir method olusturmaliyim,		 * 3-kitap ekle diye bir
 * method olusturmliyim,bu method farkli bir classda		 * 4-kullanicidn kitap adi
 * yazar adi ve fiyat bilgileri istenmeli		 */


public class KitapBilgileri {
    static Integer kitapNo = 1000;
    String kitapAdi ;
    String kitapYazari;
    double kitapFiyati ;
   static HashMap<Integer, KitapBilgileri> kitaplar = new HashMap<Integer, KitapBilgileri>();
    Scanner scan = new Scanner(System.in);

    public KitapBilgileri() {
    }

    public KitapBilgileri(String kitapAdi, String kitapYazari, double kitapFiyati) {
        this.kitapAdi = kitapAdi;
        this.kitapYazari = kitapYazari;
        this.kitapFiyati = kitapFiyati;
    }

    @Override
    public String toString() {
        return "KitapBilgileri{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", kitapYazari='" + kitapYazari + '\'' +
                ", kitapFiyati=" + kitapFiyati +
                '}';
    }
}
