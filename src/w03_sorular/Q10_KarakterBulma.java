package w03_sorular;

public class Q10_KarakterBulma {

    public static void main(String[] args) {

        /*
        Q10 -Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         */
        String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(random.substring(random.indexOf("A"), random.indexOf("A") + 1) + " " +
                random.substring(random.indexOf("L"), random.indexOf("L") + 1) + " " +
                random.substring(random.indexOf("I"), random.indexOf("I") + 1));

    }
}
