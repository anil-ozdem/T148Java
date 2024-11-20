package miniMarketProject;

import static miniMarketProject.P01_GirisEkrani.*;
import static miniMarketProject.P05_fisYazdir.fisYazdir;

public class P02_Sarkuteri {

    public static void main(String[] args) {

    }
    public static void sarkuteri() {
        System.out.println("====== Sarkuteri Reyonuna Hos Geldiniz ======");
        System.out.println("Lutfen satin almak istediginiz urun kodunu giriniz");
        System.out.println("------          Urun Listesi          ------");
        System.out.println("101-Peynir  200₺\n102-Kaymak  150₺\n103-Sucuk  300₺\n104-Pastırma  250₺\n105-Kavurma  275₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 101 && urunKodu <= 105) {
                System.out.println("Kac paket alacaksiniz ?");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 101:
                        urunAdi = "Peynir";
                        urunFiyati = 200;
                        System.out.println(urunAdedi + " paket " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 102:
                        urunAdi = "Kaymak";
                        urunFiyati = 150;
                        System.out.println(urunAdedi + " paket " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 103:
                        urunAdi = "Sucuk";
                        urunFiyati = 300;
                        System.out.println(urunAdedi + " paket " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 104:
                        urunAdi = "Pastirma";
                        urunFiyati = 250;
                        System.out.println(urunAdedi + " paket " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 105:
                        urunAdi = "Kavurma";
                        urunFiyati = 275;
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
