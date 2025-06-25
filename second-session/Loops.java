import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        * Döngüler, belirli bir koşulu karşılayana kadar belirli bir kod bloğunu tekrarlayan yapılar sağlar.
        * Bu sayede programlar, belirli görevleri tekrarlayarak daha verimli ve dinamik çalışabilir.
        */
        System.out.println("Java Döngüleri");

        // while Döngüsü
        int countWhile = 0;
        while (countWhile < 5) {
            System.out.println("While Döngüsü - Adım " + countWhile);
            countWhile++;
        }

        // do-while Döngüsü
        int countDoWhile = 0;
        do {
            System.out.println("Do-While Döngüsü - Adım " + countDoWhile);
            countDoWhile++;
        } while (countDoWhile < 5);

        // for Döngüsü
        for (int countFor = 0; countFor < 5; countFor++) {
            System.out.println("For Döngüsü - Adım " + countFor);
        }

        // foreach Döngüsü (Diziler ve Koleksiyonlar için)
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int num : numbers) {
            System.out.println("Foreach Döngüsü - Sayı: " + num);
        }


        //Market Alışverişi örneği
        String[] alisverisListesi = { "Elma", "Süt", "Ekmek", "Yumurta", "Mısır gevreği" };

        for (String urun : alisverisListesi) {
            System.out.println(urun + " sepete ekleniyor.");
        }

        //Geri Sayım Saati örneği
        int geriSayim = 10;

        while (geriSayim > 0) {
            System.out.println("Geri Sayım: " + geriSayim);
            geriSayim--;
        }
        System.out.println("Etkinlik başladı!");

        //Kullanıcı Girişi Doğrulama örneği

        Scanner tarayici = new Scanner(System.in);
        int yas;

        do {
            System.out.print("Yaşınızı girin: ");
            yas = tarayici.nextInt();
        } while (yas < 0 || yas > 120);

        System.out.println("Geçerli yaş girildi: " + yas);

    }
}
