public class Operators {
    public static void main(String[] args) {
        System.out.println("Operatörler");

        // Aritmetik Operatörler
        int num1 = 10;
        int num2 = 5;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Toplam: " + sum);
        System.out.println("Fark: " + difference);
        System.out.println("Çarpım: " + product);
        System.out.println("Bölüm: " + quotient);
        System.out.println("Kalan: " + remainder);

        // Karşılaştırma Operatörleri
        boolean isEqual = num1 == num2;
        boolean isGreater = num1 > num2;
        boolean isLessOrEqual = num1 <= num2;

        System.out.println("Eşit mi? " + isEqual);
        System.out.println("Büyük mü? " + isGreater);
        System.out.println("Küçük veya eşit mi? " + isLessOrEqual);

        // Mantıksal Operatörler
        boolean isTrue = true;
        boolean isFalse = false;

        boolean andResult = isTrue && isFalse; // Mantıksal "ve" operatörü
        boolean orResult = isTrue || isFalse; // Mantıksal "veya" operatörü
        boolean notResult = !isTrue; // Mantıksal "değil" operatörü

        System.out.println("Mantıksal 've' Sonucu: " + andResult);
        System.out.println("Mantıksal 'veya' Sonucu: " + orResult);
        System.out.println("Mantıksal 'değil' Sonucu: " + notResult);
    }
}
