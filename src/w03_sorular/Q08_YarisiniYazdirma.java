package w03_sorular;

import java.util.Scanner;

public class Q08_YarisiniYazdirma {

    public static void main(String[] args) {

        /*
        Q8 -	StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        String sonuc = (kelime.length()%2==0)
                ? kelime.substring(0,kelime.length()/2)
                : "Lütfen çift uzunlukta bir kelime giriniz.";

        System.out.println("Girdiginiz kelimenin ilk yarisi: " + sonuc);




    }
}
