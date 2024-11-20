package w03_sorular;

public class Q04_FiyatToplam {

    public static void main(String[] args) {

        /*
        Q4 - String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
         */

        String str1 = "13.99";
        String str2 = "10.55";

        double fiyat1 = Double.parseDouble(str1);
        double fiyat2 = Double.parseDouble(str2);

        System.out.println("Fiyatlarin toplami: " + (fiyat1 + fiyat2) + " dir");

    }
}
