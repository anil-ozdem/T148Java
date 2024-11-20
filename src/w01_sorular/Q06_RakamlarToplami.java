package w01_sorular;

import java.util.Scanner;

public class Q06_RakamlarToplami {

    public static void main(String[] args) {

        /*
        Q06 -     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();

        int birlerBasamagi = sayi % 10;
        System.out.println("Birler basamagi: " + birlerBasamagi);
        sayi = sayi / 10;

        int onlarBasamagi = sayi % 10;
        System.out.println("Onlar basamagi: " + onlarBasamagi);
        sayi = sayi / 10;

        int yuzlerBasamagi = sayi % 10;
        System.out.println("Yuzler basamagi: " + yuzlerBasamagi);
        sayi = sayi / 10;

        int binlerBasamagi = sayi % 10;
        System.out.println("Binler basamagi: " + binlerBasamagi);
        sayi = sayi / 10;


        int onbinlerBasamagi = sayi % 10;
        System.out.println("Onbinler basamagi: " + onbinlerBasamagi);

        System.out.println("Girmis oldugunuz sayinin ilk iki ve son iki basamaktaki rakamların toplamı: " + (birlerBasamagi + onlarBasamagi + binlerBasamagi + onbinlerBasamagi));


    }
}
