package w03_sorular;

import java.util.Scanner;

public class Q01_Bosluk {

    public static void main(String[] args) {
        /*
        Q1 -Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin = scanner.nextLine();

        if (metin.contains(" ")) {
            System.out.println("Girdiginiz metinde bosluk karakteri vardir.");
        } else System.out.println("Girdiginiz metinde bosluk karakteri yoktur.");

    }
}
