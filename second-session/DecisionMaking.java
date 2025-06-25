public class DecisionMaking {
    public static void main(String[] args) {
         /**
          * "if-else" yapısı, belirli bir koşulun doğru olup olmadığını kontrol eder
          * ve koşul doğruysa belirtilen işlemleri gerçekleştirir;
          * koşul yanlışsa farklı bir dizi işlemleri yürütür.
          * Bu yapı, programın farklı durumlara göre farklı eylemler yapmasını sağlar.
         */
        System.out.println("Karar Verme Süreci");

        int age = 20;
        // if-else Karar Yapısı
        if (age >= 18) {
            System.out.println("Yetişkin.");
        } else {
            System.out.println("Çocuk.");
        }

        // switch-case Karar Yapısı
        String isik = "kirmizi";
        switch (isik) {
            case "kirmizi":
                System.out.println("Gidebilirsin.");
                break;
            case "sari":
                System.out.println("Yavaşla.");
                break;
            default:
                System.out.println("Dur");
        }

        //Trafik ışıkları örneği
        char cinsiyet = 'M';

        if (cinsiyet == 'M') {
            System.out.println("Erkek.");
        } else if (cinsiyet == 'F') {
            System.out.println("Kadin.");
        } else {
            System.out.println("Yanlis tuslama.");
        }

        // e-ticaret sitesinde indirim örneği
        double siparisTutari = 150.0;
        double indirimEsik = 100.0;
        double indirimYuzde = 0.1; // %10

        if (siparisTutari >= indirimEsik) {
            double indirimMiktar = siparisTutari * indirimYuzde;
            double indirimliToplam = siparisTutari - indirimMiktar;
            System.out.println("İndirimli Toplam: " + indirimliToplam);
        } else {
            System.out.println("Normal Toplam: " + siparisTutari);
        }

        // notlandirma sistemi
        int sinavPuani = 78;

        if (sinavPuani >= 90) {
            System.out.println("Not: A");
        } else if (sinavPuani >= 80) {
            System.out.println("Not: B");
        } else if (sinavPuani >= 70) {
            System.out.println("Not: C");
        } else if (sinavPuani >= 60) {
            System.out.println("Not: D");
        } else {
            System.out.println("Not: F");
        }


    }
}
