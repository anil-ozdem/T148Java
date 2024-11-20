package w03_sorular;

import java.util.Scanner;

public class Q07_YanYanaYazdirma {

    public static void main(String[] args) {

        /*
        Q7 - * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        String sonuc = (kelime.length() >= 3)
                ? kelime.substring(kelime.length() - 2) +
                kelime.substring(kelime.length() - 2) +
                kelime.substring(kelime.length()-2)
                : kelime;

        System.out.println(sonuc);


    }


}

