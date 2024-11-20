package w03_sorular;

import java.util.Scanner;

public class Q05_EpostaDegistirme {

    public static void main(String[] args) {

        /*
        Q5 -kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir e-posta adresi giriniz.");
        String eposta = scanner.nextLine();

        if (eposta.contains("hotmail")) {
            eposta = eposta.replace("hotmail", "gmail");

        }
        System.out.println("Guncellenmis e-posta adresi: " + eposta);

    }
}
