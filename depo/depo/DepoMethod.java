package depo;




import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepoMethod extends Depo {
    static Scanner input = new Scanner(System.in);

    //  urunTanimlama  ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.
    //     *
    //     *        urunListele    ==> tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.
    //     *
    //     *        urunGirisi        ==> giris yapmak istedigimiz urnunun id numarasi ile girecegiz.
    //     *
    //     *        urunuRafaKoy   ==> listeden urunu sececegiz ve id numarasina gore urunu rafa koyacagiz.
    //     *
    //     *    urunCikisi        ==> listeden urunu sececegiz ve urunun cikis yapcagiz. burada urun listesinden sadece miktarda degisiklik yapilacak.
    //     *                   urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.
    //     *        ===> yaptigimiz tum degisiklikler listede de gorunsun.
    //String urunAdi,String uretici,String birim



    public  static  void menu(){

        do {
            System.out.println("1-urun tanimlama\n2-urungirisi\n3-urunrafakoy\n4-uruncikisi\n5-urunlistele\n6-cikis\nislem seciniz");
            int secim = input.nextInt();
            if (secim==6){
                break;
            }
            switch (secim){
                case 1:
                    urunTanimlama();
                    break;
                case 2:
                    urunGirisi();
                    break;
                case 3:
                    rafaKoy();
                    break;
                case 4:
                    urunCikisi();
                    break;
                case 5:
                    urunListele();
                    break;
                default:
                    System.out.println("lutfen gecerli bir secim yapiniz");
            }

        }while (true);

    }
    public static void urunTanimlama() {


        input.nextLine();
        do {
            System.out.print("Lutfen tanimlamak istadiginiz urun bilgilerini giriniz!\nUrun Adi: ");
            String urunAdi = input.nextLine();
            System.out.print("Uretici Adi :");
            String uretici = input.nextLine();
            System.out.print("Birim Cinsi: ");
            String birim = input.nextLine();


                urunler.put(id, new Depo(urunAdi, uretici, birim));
                id++;

            System.out.println("Devam etmek istiyorsaniz 'e' ye  cikmak istiyorsaniz 'q' ye basiniz");
            char ch = input.nextLine().toLowerCase().charAt(0);
            if (ch == 'q') {
                break;
            }


        } while (true);


    }

    public static void urunListele() {
        Depo d1 = new Depo();

        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%n", "id", "urunadi", "uretici", "birim", "miktar", "raf");

        for (Map.Entry<Integer, Depo> w : urunler.entrySet()) {
            System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%n", w.getKey(), w.getValue().urunAdi,
                    w.getValue().uretici, w.getValue().birim, w.getValue().miktar, w.getValue().rafNo);
        }


    }

    public static void urunGirisi() {
        System.out.print("lutfen giris icin urun bilgilerini giriniz\nid:");
        Integer id = input.nextInt();

        if (urunler.containsKey(id)){
            System.out.println("miktar:");
            int miktar = input.nextInt();
            urunler.get(id).miktar+=miktar;

        }else {
            System.out.println("gecersiz id girdiniz. once urun tanimlayiniz");
            menu();
        }


    }


    public static void rafaKoy() {
        System.out.println("Rafa koymak icin Urun bilgilerini giriniz\nid:");
        Integer id = input.nextInt();
        if (urunler.containsKey(id)){
            System.out.println("rafno:");
            char rafno = input.next().charAt(0);
            urunler.get(id).rafNo=rafno;

        }else {
            System.out.println("gecersiz id girdiniz. once urun tanimlayiniz");
            menu();
        }

    }


    public static void urunCikisi() {
        System.out.println("Cikis icin urun bilgileri giriniz\nid:");
        Integer id = input.nextInt();
        if (urunler.containsKey(id)){
            System.out.println("miktar:");
            int cmiktar = input.nextInt();

            if (cmiktar>urunler.get(id).miktar){
                System.out.println("yeterli urun yok.lutfen miktari  en fazla "+urunler.get(id).miktar+"   olarak giriniz");
                urunCikisi();
            }else {
                urunler.get(id).miktar-=cmiktar;
            }

        }else {
            System.out.println("gecersiz id girdiniz. once urun tanimlayiniz");
            menu();
        }




    }


}
