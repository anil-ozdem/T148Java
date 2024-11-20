package w03_sorular;

public class Q02_SayiveHarfDegerleri {

    public static void main(String[] args) {
        /*
        Q2- 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.
         */
        for (int i = 0; i <= 255; i++) {
            char harf = (char) i;
            System.out.println("Sayi: " + i + ", Karakter: " + harf);
        }
    }
}
