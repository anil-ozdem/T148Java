package miniMarketProject;

import static miniMarketProject.P01_GirisEkrani.*;
import static miniMarketProject.P05_fisYazdir.fisYazdir;

public class P04_Market {

    public static void main(String[] args) {

    }
    public static void market() {
        System.out.println("====== Market Reyonuna Hos Geldiniz ======");
        System.out.println("Lutfen satin almak istediginiz urun kodunu giriniz");
        System.out.println("------          Urun Listesi          ------");
        System.out.println("301-Dubai Cikolatasi 350₺\n302-Pecete 25₺\n303-5 Lt Su 30₺\n304-Nutella 180₺\n305-Tuvalet Kagidi 189₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 301 && urunKodu <= 305) {
                System.out.println("Kac paket alacaksiniz ?");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 301:
                        urunAdi = "Dubai Cikolatasi";
                        urunFiyati = 350;
                        System.out.println(urunAdedi + " paket " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 302:
                        urunAdi = "Pecete";
                        urunFiyati = 25;
                        System.out.println(urunAdedi + " paket " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 303:
                        urunAdi = "5 Lt Su";
                        urunFiyati = 30;
                        System.out.println(urunAdedi + " paket " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 304:
                        urunAdi = "Nutella";
                        urunFiyati = 180;
                        System.out.println(urunAdedi + " paket " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 305:
                        urunAdi = "Tuvalet Kagidi";
                        urunFiyati = 189;
                        System.out.println(urunAdedi + " paket " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Odemeniz gereken toplam tutar: " + toplam + "₺");
                sepet += urunAdi + ": " + urunFiyati + "₺ ";
                System.out.println("\nBaska bir urun almak icin urun kodunu giriniz\n\nAna menuye donmek icin 0 tusuna basiniz.\n\nFisinizi yazdirmak icin 4 tusuna basiniz ");


            } else if (urunKodu == 0) {
                girisEkrani();

            } else if (urunKodu == 4) {
                fisYazdir();
            } else {
                System.out.println("\nYanlis bir tuslama yaptiniz...\n");
                girisEkrani();
            }
            ekUrun = false;
        }
    }
}

