package w01_sorular;

import java.util.Scanner;

public class Q11_Ucgen {

    public static void main(String[] args) {

        /*
        Q11 - *  Kullanicidan 3 tane pozitif  tam sayi aliniz.
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
	      herhangi iki kenar farkı diger kenardan büyük olmali
             a+b>c>a-b
             a+c>b>a-c
             b+c>a>b-c
		a=b=c ise es kenar ucgen
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz ucgenin ilk kenarini tam sayi olacak sekilde giriniz: ");
        int a = scanner.nextInt();
        System.out.println("Lutfen olusturmak istediginiz ucgenin ikinci kenarini tam sayi olacak sekilde giriniz: ");
        int b = scanner.nextInt();
        System.out.println("Lutfen olusturmak istediginiz ucgenin ucuncu kenarini tam olacak sekilde giriniz: ");
        int c = scanner.nextInt();


        if (a == b && b == c) {
            System.out.println("Bu bir eskenar ucgendir.");
        } else if (a + b > c && a - b < c &&
                a + c > b && a - c < b &&
                b + c > a && b - c < a) {
            System.out.println("Bu ucgen olabilir.");
        } else {
            System.out.println("Bu ucgen olamaz.");
        }


    }
}
