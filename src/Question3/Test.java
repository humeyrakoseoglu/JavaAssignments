package Question3;

/*
Javada bir sınıf birden fazla arayüzü implementedebilirken,
sadece bir sınıfı extend edebiliyor olmasının sebebi çelişkili durumların ortaya çıkabilmesinden kaynaklıdır.
Örneğin Parent1 ve Parent2 isminde iki sınıfımız olsun ve bu sınıflarımızın içinde aynı isimde run() fonksiyonu olsun.
Daha sonra bir Test sınıfı oluşturuyoruz ve bu Test sınıfını hem Parent1 hem de Parent2'den extends etmeye çalışıyoruz.
Test sınıfından bir nesne ürettiğimizde ve run() fonksiyonunu çağırdığımızda bir derleme hatası alırız.
Çünkü kod hangi run() metodunun çağrılacağını bilemez.
Parent1'in run() metodu mu yoksa Parent2'nin run() metodu mu çağrılmalı? Burada bir karmaşıklık oluşur.
Bu nedenle bu karmaşıklığa sebep olunmaması için Java birden fazla sınıf extends etmez.
Birden fazla arayüz ise implement edilebilir çünkü arayüzler yalnızda metot ismi ve signature belirtir, içinde kod blokları olmaz.
Bu nedenle her sınıf implemet ettiği arayüzün metotlarını uygulaması gerekir. Çakışma durumu olmaz.
 */

// Class 1 - First Parent class
class Parent1 {
    void run() {
        System.out.println("Parent1");
    }
}

// Class 2 - Second Parent Class
class Parent2 {
    void run() {
        System.out.println("Parent2");
    }
}

/*
// ikisinden de kalıtım yapamyı deniyoruz
class Test extends Parent1, Parent2 {

    // Main driver method
    public static void main(String args[]) {

        Test t = new Test();

        t.run();
    }
}
*/