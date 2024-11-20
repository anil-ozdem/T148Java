package miniMarketProject;

import java.util.Scanner;

import static miniMarketProject.P02_Sarkuteri.sarkuteri;
import static miniMarketProject.P03_Manav.manav;
import static miniMarketProject.P04_Market.market;
import static miniMarketProject.P05_fisYazdir.cikis;
import static miniMarketProject.P05_fisYazdir.fisYazdir;

public class P01_GirisEkrani {
    public static Scanner scan = new Scanner(System.in);
    public static int urunKodu;
    public static String urunAdi;
    public static int urunFiyati;
    public static int urunAdedi;
    public static double toplam;
    public static boolean ekUrun;
    public static String sepet = "";

    public static void main(String[] args) {
        girisEkrani();
    }
    public static void girisEkrani() {
        System.out.println("============= WISE MARKET ===========");
        System.out.println("              Hos geldiniz           ");
        System.out.println();
        System.out.println("Lutfen Islem Secimi Yapiniz");
        System.out.println("------ Menu -------");
        System.out.println("1-Sarkuteri Reyonu\n2-Manav Reyonu\n3-Market Reyonu\n4-Fis yazdır\n5-Cikis");
        int secim = scan.nextInt();
        if (secim >= 1 && secim <= 5) {
            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
            }
        } else {
            System.out.println("Gecersiz bir secim yaptiniz");
            girisEkrani();
        }
    }
}
