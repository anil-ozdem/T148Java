package w01_sorular;

import java.util.Scanner;

public class Q17_RakamlariYazdirma {

    public static void main(String[] args) {

        /*
        Q17 -Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 100 || sayi > 999) {
            System.out.println("Lutfen 3 basamakli bir sayi giriniz. ");
        } else {
            int birler = sayi % 10;
            int onlar = (sayi / 10) % 10;
            int yuzler = sayi / 100;

            switch (yuzler) {
                case 1:
                    System.out.print("Yuz ");
                    break;
                case 2:
                    System.out.print("Iki yuz ");
                    break;
                case 3:
                    System.out.print("Uc yuz ");
                    break;
                case 4:
                    System.out.print("Dort yuz ");
                    break;
                case 5:
                    System.out.print("Bes yuz ");
                    break;
                case 6:
                    System.out.print("Alti yuz ");
                    break;
                case 7:
                    System.out.print("Yedi yuz ");
                    break;
                case 8:
                    System.out.print("Sekiz yuz ");
                    break;
                case 9:
                    System.out.print("Dokuz yuz ");
                    break;

            }
            switch (onlar) {

                case 1:
                    System.out.print("on ");
                    break;
                case 2:
                    System.out.print("yirmi ");
                    break;
                case 3:
                    System.out.print("otuz ");
                    break;
                case 4:
                    System.out.print("kirk ");
                    break;
                case 5:
                    System.out.print("elli ");
                    break;
                case 6:
                    System.out.print("altmis ");
                    break;
                case 7:
                    System.out.print("yetmis ");
                    break;
                case 8:
                    System.out.print("seksen ");
                    break;
                case 9:
                    System.out.print("doksan ");
                    break;
            }
            switch (birler) {
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki ");
                    break;
                case 3:
                    System.out.print("uc ");
                    break;
                case 4:
                    System.out.print("dort ");
                    break;
                case 5:
                    System.out.print("bes ");
                    break;
                case 6:
                    System.out.print("alti ");
                    break;
                case 7:
                    System.out.print("yedi ");
                    break;
                case 8:
                    System.out.print("sekiz ");
                    break;
                case 9:
                    System.out.print("dokuz ");
                    break;
            }


        }
    }
}
