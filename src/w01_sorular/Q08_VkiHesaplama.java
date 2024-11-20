package w01_sorular;

import java.util.Scanner;

public class Q08_VkiHesaplama {

    public static void main(String[] args) {

        /*
        Q08 - Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		                   Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilo giriniz(kg): ");
        double kilo = scanner.nextDouble();
        System.out.println("Lutfen boy giriniz(metre cinsinden, orn: 1,72): ");
        double boy = scanner.nextDouble();
        double vki = (kilo / (boy*boy));

        System.out.println("Vucut kitle indeksiniz: " + vki);


    }
}
