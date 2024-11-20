package day24_stringBuilder_accessModifier;

public class P02_StringBuilder_Methods {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Nice have a day");



        // sb1 de yer alan degeri tersten yazdiriyoruz
        sb1.reverse();

        System.out.println(sb1);

        // Sb1 tersten yazilarak atandigi icin eski haline donmek istersek
        // Tekrar reverse methodu kullanilmalidir
        sb1.reverse();
        // Tersinin tersi kendisidir!
        System.out.println(sb1);

        // Isim ayni olsa bile String ve StringBuilder'da uygulama farkli olabilir

        String str="Wise";

        // Replace methodu index alarak istenen araliktaki metni silip
        // Yerine istediginiz metni koyar
        // Ilk index dahil ikinci index harictir.
        sb1.replace(0,4, str);
        System.out.println(sb1);

        // Delete methodu iki index girilerek iki index arasindaki veriyi siler.
        sb1.delete(0,12);
        System.out.println(sb1);

        // Herhangi bir indexteki veriyi silmek amaciyla kullanilir
        sb1.deleteCharAt(sb1.length()-1);
        System.out.println(sb1);

        // Herhangi bir indexe verilen string'i eklemek icin kullanilir
        sb1.insert(sb1.length(),"y");
        System.out.println(sb1);

        // Verilen indexten itibaren ilgili str degeri variable'a eklenir
        sb1.insert(0,"Wise have a ");
        System.out.println(sb1);




    }
}
