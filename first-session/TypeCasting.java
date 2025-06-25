public class TypeCasting {
    public static void main(String[] args) {
        // Tip Dönüşümü ve Dönüştürme
        int num1 = 10;
        double num2 = 3.5;
        double result = num1 + num2; // Implicit type conversion

        System.out.println("Result: " + result);

        // Tip Dönüşümü ve Dönüştürme
        int num3 = 15;
        int num4 = 7;

        double quotient = (double) num3 / num4; // Explicit type conversion for accurate division
        System.out.println("Quotient: " + quotient);

        //int -> String
        int number = 42;
        String strNumber = Integer.toString(number);

        System.out.println("Integer: " + number);
        System.out.println("String: " + strNumber);

        //String -> int
        String str = "123";
        int numberStr = Integer.parseInt(strNumber);

        System.out.println("String: " + str);
        System.out.println("Integer: " + numberStr);


        /*Tür dönüşümü, farklı veri tipleri arasında geçiş yapmayı sağlar.
         Ancak neden tür dönüşümüne ihtiyaç duyarız?
         İşte tür dönüşümünün neden gerekliliğini açıklayan bazı noktalar:

        Veri Uyumlaştırma: Farklı veri tipleri farklı boyutlara ve bellek temsillerine sahiptir.
        Bazı durumlarda, verileri bir türden diğerine dönüştürmek,
        işlem yaparken veriyi uyumlaştırmak için gereklidir. Örneğin,
        ondalık kesirleri içeren bir hesaplama yaparken tamsayıya veya tersine dönüştürme gerekebilir.

        Hesaplama ve İşlem Uygunluğu: Farklı veri tipleri farklı türde hesaplamalara daha iyi uyabilir.
        Örneğin, ondalık sayılarla yapılan hesaplamaları tamsayı türünde yapmak,
        doğru sonuçlar elde etmenizi engelleyebilir.
        Bu nedenle, verileri uygun türde işlemek ve hesaplamak için tür dönüşümü gerekebilir.

        Kullanıcı Girdileri: Kullanıcı girdileri genellikle metin (String) türünde gelir. Ancak,
        bu girdileri matematiksel işlemlerde veya diğer hesaplamalarda kullanmak istiyorsanız,
        bu metin verilerini sayısal veri tiplerine dönüştürmek gerekebilir.

        Veri Görselleştirmesi: Bazı durumlarda,
        veriyi farklı biçimlerde görüntülemek veya sunmak isteyebilirsiniz.
        Bu, metin olarak temsil edilen bir veriyi grafiksel bir temsil veya tersine dönüştürme ihtiyacı anlamına gelebilir.

        Tür dönüşümü, programlamada veri yönetimi, işlemler ve etkili hesaplamalar için temel bir bileşendir.
        Ancak dikkat etmek önemlidir; bazı durumlarda veri kaybına veya yanıltıcı sonuçlara yol açabilir.
        Bu nedenle, dikkatlice ve bilinçli bir şekilde tür dönüşümü yapmak önemlidir.*/
    }
}
