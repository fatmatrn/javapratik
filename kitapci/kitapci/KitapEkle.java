package kitapci;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class KitapEkle extends KitapBilgileri {
    static Scanner input = new Scanner(System.in);
    static Set<Map.Entry<Integer, KitapBilgileri>> kitap = kitaplar.entrySet();

    public static void menu() {
        System.out.println("* 1-kitap ekle\n" +
                "* 2-numara ile kitap goruntule\n" +
                "* 3-yazar ile kitap goruntule\n" +
                "* 4-fiyat ile kitap goruntule\n" +
                "* 5-numara ile kitap sil\n" +
                " * 6-cikis");

        int a = input.nextInt();
//        if (a==6){
//            cikis();
//        }else {


        switch (a) {
            case 1:
                kitapEkle();
                menu();
                break;
            case 2:
                numaraIleGoruntule();
                menu();
                break;
            case 3:
                yazarIleGoruntule();
                menu();
                break;
            case 4:
                fiyatIleGoruntule();
                menu();
                break;
            case 5:
                kitapSil();
                menu();
           break;
            case 6:
                cikis();
                break;

            default:
                System.out.println("Uygun bir secim yapiniz");
                menu();
                break;
      //  }
        }


    }

    public static void cikis() {
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");


    }

    public static void kitapEkle() {
        System.out.println("lutfen kitap bilgilerini giriniz");
        input.nextLine();
        System.out.println("kitapAdi: ");
        String kitapAdi1 = input.nextLine();
        System.out.println("kitapyazari: ");
        String kitapYazari1 = input.nextLine();

        System.out.println("kitapfiyati: ");
        double kitapFiyati1 = input.nextDouble();
        KitapBilgileri obj = new KitapBilgileri(kitapAdi1, kitapYazari1, kitapFiyati1);
        kitaplar.put(kitapNo, obj);
        kitapNo++;
        System.out.println(kitaplar);
    }

    public static void kitapSil() {

        System.out.println("silmek istediginiz kitap no giriniz");
        Integer a = input.nextInt();
        System.out.println(a + " nolu kitap bilgileri:" + kitaplar.get(a));
        kitaplar.remove(a);
        System.out.println("kitap silindi");
        System.out.println(kitaplar);
    }

    public static void numaraIleGoruntule() {

        System.out.println("kitap no giriniz");
        Integer a = input.nextInt();
        System.out.println(a + " nolu kitap bilgileri:" + kitaplar.get(a));

    }

    public static void yazarIleGoruntule() {
        System.out.println("kitap yazari giriniz");
        input.nextLine();
        String yazar = input.nextLine();
        for (Map.Entry<Integer, KitapBilgileri> w : kitap) {
            if (w.getValue().kitapYazari.equals(yazar)) {
                System.out.println(w.getKey() + " nolu kitap " + w.getValue());
            }
        }
    }

    public static void fiyatIleGoruntule() {

        System.out.println("kitap fiyati giriniz");
        double fiyat = input.nextDouble();
        for (Map.Entry<Integer, KitapBilgileri> w : kitap) {
            if (w.getValue().kitapFiyati == fiyat) {
                System.out.println(w.getKey() + " nolu kitap  " + w.getValue());
            }
        }


    }

}



