package w01_sorular;

import java.util.Scanner;

public class Q09_IsBitmeSuresi {

    public static void main(String[] args) {

        /*
        Q09 -   Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isci sayisini giriniz: ");
        int isciSayisi = scanner.nextInt();
        int gun=(10/isciSayisi);

        System.out.println("Isin bitecegi gun sayisi: "+gun);


    }
}
