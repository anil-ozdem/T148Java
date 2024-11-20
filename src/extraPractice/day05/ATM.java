package extraPractice.day05;

import java.util.Scanner;

public class ATM {
    static Scanner scanner = new Scanner(System.in);
    static String kartNo ="123456";
    static String sifre ="1234";
    static double bakiye = 30000;
    static double miktar = scanner.nextDouble();

    public static void main(String[] args) {
        /*
      ATM EKRANI VE ISLEMLER
 -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
    eger herhangi birini yanlis girerse tekrar girmesini isteyin.
 -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
 -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
 -Menu listesinde;
        Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
        islemleri olacaktır.
 -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
 -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
     eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
- Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
  */


    }

    public static void giris() {

        System.out.println("******************* JAVABANK'A HOS GELDINIZ *******************\\n" +
                "Guvenliginiz icin sifrenizi kimseyle paylasmayiniz\n" +
                "*****************************\n");

        System.out.println("Kart numaranizi giriniz");
        String kKartNo = scanner.nextLine();

        System.out.println("Sifrenizi giriniz");
        String sifre = scanner.nextLine();

        kKartNo = kKartNo.replaceAll("//s", "");
        if (kKartNo.equals(kartNo)&& sifre.equals(sifre)) {
            menu();
        } else {
            System.out.println("Hatali giris yaptiniz yeniden deneyiniz");
            giris();
        }


    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir islem seciniz: \n"+
                "1- Bakiye Sorgulama\n"+
                "2- Para Yatirma\n"+
                "3- Para Cekme\n"+
                "4- Para Gonderme\n"+
                "5- Sifre Degistirme\n"+
                "6- Cikis\n"+
                "Seciminiz:");
        int secim= scanner.nextInt();

        switch (secim) {
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraYatirma();

                break;
            case 3:
                paraCekme();
                break;
            case 4:
                paraGonderme();
                break;
            case 5:
                sifreDegistirme();
                break;
            case 6:
                System.out.println("Bankamizi tercih ettiginiz icin tesekkur ederiz");
                System.exit(0);
            default:
                System.out.println("Hatali tuslama yaptiniz, lutfen tekrar deneyiniz");
                menu();
        }
    }

    private static void sifreDegistirme() {
    }

    private static void paraGonderme() {
    }

    private static void paraCekme() {
        if (miktar<=bakiye){

        }
    }

    private static void paraYatirma() {

        bakiye += miktar;
       bakiyeSorgulama();
    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz: " + bakiye);
        menu();
    }
}
