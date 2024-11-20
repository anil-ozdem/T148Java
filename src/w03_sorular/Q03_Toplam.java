package w03_sorular;

import java.util.Scanner;

public class Q03_Toplam {

    public static void main(String[] args) {

        /*
        Q3 -Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 5 adet sayı giriniz.");

        int toplam = 0;
        int sayi;
        int sayiSayisi = 0;

        while (sayiSayisi < 5) {
            System.out.print((sayiSayisi + 1) + ". sayıyı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi < 5 || sayi > 10) {
                toplam += sayi;
            }
            sayiSayisi++;
        }
        System.out.println("Girdiğiniz sayılardan 5 ile 10 arasındaki sayılar hariç toplam: " + toplam);
    }
}