package w01_sorular;

import java.util.Scanner;

public class Q10_DortIslem {

    public static void main(String[] args) {

        /*
        Q10 - * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz ilk tam sayiyi giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("Lutfen islem yapmak istediginiz ikinci tam sayiyi giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("Lutfen hangi islemi yapmak istiyorsanız onu tuslayiniz.\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        int islemNo = scanner.nextInt();
        int sonuc = 0;

        if (islemNo == 1) {
            sonuc = (sayi1 + sayi2);

            System.out.println("Islem sonucunuz: " + sonuc);

        }
        if (islemNo == 2) {
            sonuc = (sayi1 - sayi2);

            System.out.println("Islem sonucunuz: " + sonuc);
        }
        if (islemNo == 3) {
            sonuc = (sayi1 * sayi2);

            System.out.println("Islem sonucunuz: " + sonuc);
        }
        if (islemNo == 4) {
            if (sayi1 < sayi2) {
                System.out.println("Girdiginiz ilk sayi ikinci sayidan buyuk olmalidir");
            } else {
                sonuc = (sayi1 / sayi2);
                System.out.println("Islem sonucunuz: " + sonuc);
            }


        }
    }
}
