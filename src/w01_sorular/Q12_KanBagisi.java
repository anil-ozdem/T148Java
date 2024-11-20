package w01_sorular;

import java.util.Scanner;

public class Q12_KanBagisi {

    public static void main(String[] args) {

        /*
        Q12 -// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
         */


         Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas= scanner.nextInt();
        System.out.println("Lutfen kilonuzu giriniz: ");
        int kilo= scanner.nextInt();

        if (yas<18){
            System.out.println("18 yasindan kucuk oldugunuz icin kan bagisi yapamazsiniz.");
        } else if (yas >= 18 && kilo < 50) {
            System.out.println("Kilonuz istenilen degerleri karsilamadigi icin kan bagisi yapamazsiniz.");
        } else if (yas >= 18 && kilo >= 50) {
            System.out.println("Kan bagisi yapabilirsiniz");
        }

    }
}
