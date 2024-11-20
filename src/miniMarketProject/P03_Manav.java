package miniMarketProject;

import static miniMarketProject.P01_GirisEkrani.*;
import static miniMarketProject.P05_fisYazdir.fisYazdir;

public class P03_Manav {

    public static void main(String[] args) {

    }
    public static void manav() {
        System.out.println("====== Manav Reyonuna Hos Geldiniz ======");
        System.out.println("Lutfen satin almak istediginiz urun kodunu giriniz");
        System.out.println("------          Urun Listesi          ------");
        System.out.println("201-Yerli Muz 59₺\n202-Portakal 49₺\n203-Elma 39₺\n204-Patates 35₺\n205-Sogan 25₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 201 && urunKodu <= 205) {
                System.out.println("Kac kg alacaksiniz ?");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 201:
                        urunAdi = "Yerli Muz";
                        urunFiyati = 59;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 202:
                        urunAdi = "Portakal";
                        urunFiyati = 49;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 203:
                        urunAdi = "Elma";
                        urunFiyati = 39;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 204:
                        urunAdi = "Patates";
                        urunFiyati = 35;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
                        break;
                    case 205:
                        urunAdi = "Sogan";
                        urunFiyati = 25;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati: " + (urunFiyati * urunAdedi) + "₺");
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
