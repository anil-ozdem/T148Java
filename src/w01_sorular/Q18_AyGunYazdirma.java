package w01_sorular;

import java.util.Scanner;

public class Q18_AyGunYazdirma {

    public static void main(String[] args) {

        /*
        Q18 -Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ay numarasını giriniz (1-12): ");
        int ay = scanner.nextInt();

        String gunSayisi = "";
        String ayAdi = "";

        if (!(ay >= 1 && ay <= 12)) {
            System.out.println("Gecersiz");
        } else {
            switch (ay) {

                case 1:
                    ayAdi = "Ocak";
                    gunSayisi = "31";
                    break;
                case 2:
                    ayAdi = "Subat";
                    gunSayisi = "28";
                    break;
                case 3:
                    ayAdi = "Mart";
                    gunSayisi = "31";
                    break;
                case 4:
                    ayAdi = "Nisan";
                    gunSayisi = "30";
                    break;
                case 5:
                    ayAdi = "Mayis";
                    gunSayisi = "31";
                    break;
                case 6:
                    ayAdi = "Haziran";
                    gunSayisi = "30";
                    break;
                case 7:
                    ayAdi = "Temmuz";
                    gunSayisi = "31";
                    break;
                case 8:
                    ayAdi = "Ağustos";
                    gunSayisi = "31";
                    break;
                case 9:
                    ayAdi = "Eylul";
                    gunSayisi = "30";
                    break;
                case 10:
                    ayAdi = "Ekim";
                    gunSayisi = "31";
                    break;
                case 11:
                    ayAdi = "Kasim";
                    gunSayisi = "30";
                    break;
                case 12:
                    ayAdi = "Aralik";
                    gunSayisi = "31";
                    break;
            }
            System.out.println(ayAdi + " ayi " + gunSayisi + " gundur.");

        }
    }
}

