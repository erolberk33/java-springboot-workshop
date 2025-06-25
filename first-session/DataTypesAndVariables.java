public class DataTypesAndVariables {
    public static void main(String[] args) {
        System.out.println("Veri Tipleri ve Değişkenler");

        // İlkel Veri Tipleri
        // int, short, byte, long,double, float, chat,boolean

        int yas = 25; // Tam sayı veri tipi
        double maas = 50000.0; // Ondalık sayı veri tipi
        char cinsiyet = 'M'; // Karakter veri tipi
        boolean ogrenciMi = false; // Mantıksal (boolean) veri tipi

        System.out.println("Yaş: " + yas);
        System.out.println("Maaş: " + maas);
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Öğrenci Mi: " + ogrenciMi);

        // Değişken Bildirimi ve Başlatılması
        String isim; // Değişken bildirimi
        isim = "John"; // Değişkene değer atanması

        System.out.println("İsim: " + isim);

        // Değişken Kapsamı ve Yaşam Süresi
        int x = 10;
        {
            int y = 20;
            System.out.println("x: " + x); // Erişim mümkün
            System.out.println("y: " + y); // Erişim mümkün
        }
        // System.out.println("y: " + y); // Hata! y değişkeni kapsam dışında

        // Örnek: Yaş Hesaplama
        int dogumYili = 2000;
        int simdikiYil = 2023;
        int hesaplananYas = simdikiYil - dogumYili;

        System.out.println("Hesaplanan Yaş: " + hesaplananYas);

    }
}
