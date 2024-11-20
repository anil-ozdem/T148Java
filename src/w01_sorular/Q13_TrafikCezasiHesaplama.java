package w01_sorular;

import java.util.Scanner;

public class Q13_TrafikCezasiHesaplama {

    public static void main(String[] args) {

        /*
        Q13 -: Kulanicidan aracinin hizini aliniz Trafik cezasinin
		 * degerini hesaplayin. 45 hiz siniridir.
		 * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
		 * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
		 * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
		 * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
		 * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
		 * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen hizinizi giriniz:");
        int hiz = scanner.nextInt();
        System.out.println("Ehliyetiniz var mı? Evet icin 1'i, Hayir icin 2'yi tuslayiniz.");
        int ehliyetDurumu = scanner.nextInt();
        boolean ehliyetVarMi = (ehliyetDurumu == 1);
        int ceza = 0;
        if (hiz > 45) {
            if (hiz >= 55 && hiz <= 74) {
                ceza = 100;
            } else if (hiz >= 75 && hiz <= 84) {
                ceza = 150;
            } else if (hiz >= 85 && hiz <= 94) {
                ceza = 320;
            } else if (hiz > 94) {
                ceza = 500;
            }
            if (!ehliyetVarMi) {
                ceza += 200;

            }
            System.out.println("Ceza miktariniz: " + ceza + "$");
        } else System.out.println("Hiz sinirini gecmediginiz icin ceza yok.");

    }
}
