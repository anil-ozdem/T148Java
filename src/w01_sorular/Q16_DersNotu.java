


package w01_sorular;

import java.util.Scanner;

public class Q16_DersNotu {

    public static void main(String[] args) {

        /*
        Q16 -Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not = scanner.nextInt();


        if (not >= 0 && not < 50) {
            System.out.println("Harf notunuz: D");
        } else if (not >= 50 && not < 60) {
            System.out.println("Harf notunuz: C");
        } else if (not >= 60 && not < 80) {
            System.out.println("Harf notunuz: B");
        } else if (not >= 80 && not <= 100) {
            System.out.println("Harf notunuz: A");
        } else {
            System.out.println("Gecerli not giriniz");


        }
    }
}



























































