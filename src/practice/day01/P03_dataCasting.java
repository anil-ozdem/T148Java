package practice.day01;

import java.util.Scanner;

public class P03_dataCasting {

    public static void main(String[] args) {


        /*
            Kullanicidan iki double sayi alin ve ilk sayi ikinci sayiya bolun
            sonucun tam sayi kismini yazdirin.


     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen iki adet ondalikli sayi giriniz...");

        System.out.print("1. Sayi: ");
        double sayi1 = scan.nextDouble();

        System.out.print("2. Sayi: ");
        double sayi2 = scan.nextDouble();

        System.out.println("Iki sayinin bolumunun tam sayi kismi: " + (int) (sayi1 / sayi2));

        // int bolum=(int)(sayi1/sayi2);
        // System.out.println("Iki sayinin bolumunun tam sayi kismi:" + bolum);

        // Kod duzeni icin --------> Win: CTRL+ALT+L
    }
}
