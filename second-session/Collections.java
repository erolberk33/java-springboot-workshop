import java.util.*;

public class Collections {
    public static void main(String[] args) {
        
        /*
        * Java Collection Framework, çeşitli veri yapılarını ve bu yapılar üzerinde işlemleri kolaylaştıran bir araç setini sağlar.
        * Bu sayede programcılar, liste, küme, harita gibi veri yapılarını kullanarak verileri düzenleyebilir ve işleyebilirler.
        */
        System.out.println("Java Collections Framework");

        // List Koleksiyonu
        List<String> isimler = new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Ayşe");
        isimler.add("Mehmet");

        System.out.println("İsimler Listesi:");
        for (String isim : isimler) {
            System.out.println(isim);
        }

        // Set Koleksiyonu
        Set<Integer> sayilar = new HashSet<>();
        sayilar.add(5);
        sayilar.add(10);
        sayilar.add(15);

        System.out.println("\nSayılar Kümesi:");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }

        // Map Koleksiyonu
        Map<String, String> ulkeler = new HashMap<>();
        ulkeler.put("TR", "Türkiye");
        ulkeler.put("US", "Amerika");
        ulkeler.put("DE", "Almanya");

        System.out.println("\nÜlkeler Haritası:");
        for (Map.Entry<String, String> entry : ulkeler.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // telefon rehber ornegi
        Map<String, String> rehber = new HashMap<>();
        rehber.put("Ahmet", "555-1234");
        rehber.put("Ayşe", "555-5678");
        rehber.put("Mehmet", "555-9876");

        String arananIsim = "Ayşe";
        if (rehber.containsKey(arananIsim)) {
            String telefonNumarasi = rehber.get(arananIsim);
            System.out.println(arananIsim + " adlı kişinin telefon numarası: " + telefonNumarasi);
        } else {
            System.out.println(arananIsim + " adlı kişi rehberde bulunamadı.");
        }

        //sepet ornegi
        List<String> sepet = new ArrayList<>();
        sepet.add("Elma");
        sepet.add("Süt");
        sepet.add("Ekmek");

        System.out.println("Sepetteki ürünler:");
        for (String urun : sepet) {
            System.out.println(urun);
        }

        //sinif ornegi
        Set<String> ogrenciler = new HashSet<>();
        ogrenciler.add("Ahmet");
        ogrenciler.add("Ayşe");
        ogrenciler.add("Mehmet");

        System.out.println("Sınıftaki öğrenciler:");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
