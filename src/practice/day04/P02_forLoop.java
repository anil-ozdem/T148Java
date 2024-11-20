package practice.day04;

import java.util.Scanner;

public class P02_forLoop {

    public static void main(String[] args) {

        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String metin = scanner.nextLine();
        int sayac = 0;

        for (int i = 0; i < metin.length(); i++) {

            if (metin.toUpperCase().charAt(i) == 'A') {
                sayac++;


            }
            if (metin.toUpperCase().charAt(i) == 'C') {
                break; // Bu kosul saglaninca for dongusu bitise kadar gitmese dahi durdurulur
            }

        }
        System.out.println("Cumledeki 'a' harfi sayisi : " + sayac);

        System.out.println("=======================================================================");

        for (int i = 0; i < 10 ; i++) {
            if (i==3){
                   continue;} // i=3 oldugu zaman islem yapmadan devam eder
            System.out.print(i + " ");
        }

    }
}