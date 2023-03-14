    QUESTION - 1

    UlasimAraci arayuzu tanımlayın. Bu arayüze aşağıdaki metodları
    yazın.
    * Dur() //Aracın hızını sıfırlar
    * Hizlan() //Aracın hızını 10 km/h artırır
    * Yavasla(int x) //Aracın hızını x kadar azaltır

    KaraAraci arayuzu tanımlayın. Bu arayuze aşağıdaki metodları yazin.
    * Calisiyormu() //Aracın hızına bakarak true yada false döner
    * HiziGetir() //Aracın hızını döner
    *
    Hiz özelliği olan bir Arac sınıfı tanımlayın ve yukarıdaki iki arayüzü bu
    sınıfta implement edin. Test sınıfında arayüz değişkenleri üzerinden
    metodları test ediniz.

    ************

    QUESTION - 2

    Atis isimli bir arayuz tanımlayın. Bu arayüze aşağıdaki
    metodu ekleyin.
    * hiziHesapla(int V0, int t) // t saniye sonra cismin hızını hesaplayan metod

    YukaridanAsagiyaDuseyAtis ve AsagidanYukariyaDuseyAtis
    isimli iki sınıf tanımlayın, bu sınıflarda Atis arayüzünü
    implement edin. Test sınıfında arayüz değişkeni üzerinden
    metodlarınızı test ediniz.

    Atış formüllerini fizik dersinizin notlarından bakınız. Yerçekimi ivmesini 10 alınız.

    ************

    QUESTION - 3

    Javada bir sınıf birden fazla arayüzü implement
    edebilirken, sadece bir sınıfı extend edebilir.

    Java’nın, bir sınıfın birden fazla üst sınıftan extend
    etmesine izin vermemesinin sebebi nedir? Böyle bir
    duruma izin verseydi ne gibi bir sorun ortaya çıkardı?
    Bir sınıfın birden fazla arayüzü implement etmesi
    halinde neden benzer bir sorun ortaya çıkmıyor?

    ************

    QUESTION - 4

    Cikolata sınıfı tanımlayın. Bu sınıfın sutOrani, kakaoOrani
    özellikleri olsun. BitterCikolata ve FindikliCikolata sınıfları
    Cikolata sınıfından extend etsin. FindikliCikolata sınıfına
    findikOrani özelliği ekleyin.

    Test sınıfınızda, olabilecek tüm upcast, downcast
    örneklerini göstererek bu sınıflardan oluşturduğunuz
    nesnelerin özelliklerine değerler atayınız.

    ************

    QUESTION - 5

    Hastane sınıfı tanımlayın. Bu sınıfın içine Doktor iç sınıfı
    tanımlayın.

    Hastane sınıfının, doktor nesnelerini tutan bir doktorListesi
    ArrayList özelliği olsun.

    Doktor iç sınıfının, adi ve soyadi özellikleri olsun. Bu sınıfa, adi ve
    soyadi özelliklerini alan bir yapıcı metod yazın. Ayrıca, doktorun
    adini ve soyadini ekrana yazdıran doktoruYazdir metodu ekleyin.

    Test sınıfında Hastane sınıfından bir nesne ve Doktor sınıfından
    birkaç nesne oluşturun. Doktor nesnelerini hastane nesnesinin
    doktorListesi özelliğine ekleyin.

    Son olarak, hastane nesnesinin doktorListesi özelliğindeki
    doktorları, doktoruYazdir metodu ile sırayla ekrana yazdırın.

    ************

    QUESTION - 6

    Bir önceki sorunun devamı olarak;
    Hastane sınıfına static bir toplamDoktorSayisi özelliği ekleyiniz.

    Hastane sınıfına isim ve soyismi parametre olarak alan
    doktorUret metodu ekleyin. Bu metodun içinde yeni bir doktor
    nesnesi üretip, Doktor iç sınıfının toplamDoktorSayisi özelliğini
    bir artırın. Bu üretilen doktoru da doktorListesi ArrayList’ine
    ekleyin.

    Doktor iç sınıfının yapıcı metodunda da toplamDoktorSayisi
    özelliğini bir artırın.

    Test sınıfınızda bu metodu test edin ve toplamDoktorSayisi
    özelliğini yazdırın.

    ************

    QUESTION - 7

    Sozluk sınıfı tanımlayın. Bu sınıfın kelimeler adında String
    dizi özelliği olsun.

    Sozluk sınıfı içinde kelimeleriListele metodu ve bu
    metodun içinde bir yerel sınıf tanımlayın.

    Yerelsinif içinde Sozluk sınıfının kelimeler özelliğini listeyen
    bir metod yazın.

    kelimeleriListele metodunda yerelSiniftaki metodu kullanın.

    Test sınıfınızda kelimeleriListele metodunu test ediniz.

    ************

    QUESTION - 8

    Sekil isminde bir soyut sınıf tanımlayın. Bu sınıfa renk özelliği ile
    aşağıdaki metodları ekleyin.
     String getRenk()
     abstract double cevreHesapla()
     abstract double alanHesapla()

    Dikdortgen ve Ucgen siniflarını Sekil sinifindan extend edin.

    Dikdörtgen sınıfınının uzunKenar, kisaKenar özellikleri olsun ve
    bu özellikleri kullanarak metodlarını gerçekleyin.

    Ucgen sınıfının tabanAlani, yukseklik özellikleri olsun ve bu
    özellikleri kullanarak metodlarını gerçekleyin.

    Test sınıfında metodları test ediniz.

    ************

    QUESTION - 9

    UML diagram'a göre sınıflar oluştur.
    PersonelIslem sınıfı tanımlayın. Bu sınıfa, Employee ve
    Intern nesnelerinden oluşan bir Person dizisi alan
    personelListele metodunu ekleyin.

    Bu metod dizideki elemanların özelliklerini sırayla
    aşağıdaki gibi yazdırsın:

    Employeeler için; name, age, salary

    Internler için; name, age, school

    ************

    QUESTION - 10

    9. sorudaki sınıfları bu soruda da kullanılmaktadır
    PersonelIslem sınıfına Employee ve Intern nesnelerinden oluşan
    bir Person dizisi alan personelDagilim metodu ekleyin.
    Bu metod, dizideki elemanların age özelliğine bakarak, yaş
    aralıklarına göre personellerin yüzdesini ekrana yazdırsın:
        0 – 20 arası : %x // (personellerin yüzde kaçı 0-20 yaş aralığında)
        20 – 40 arası : %y
        40 ve üzeri : %z

    ************

    QUESTION - 11

    KolSaati sınıfı tanımlayın. Bu sınıfın saat, dakika, saniye özellikleri
    olsun.

    Bu sınıfa birer integer değer alan saatiAyarla, dakikayiAyarla,
    saniyeyiAyarla metodlarını yazın. Bu metodlarda parametreleri
    özelliklere atamadan önce gerekli kontrolleri yapın, eğer geçersiz
    bir değer girildiyse ekrana uyarı yazdırın.

    Başka bir pakette AkilliKolSaati ve Test sınıflarını tanımlayın. AkilliKolSaati sınıfı KolSaati sınıfından extend etsin. Bu sınıfa
    zamanıAyarla metotdu ekleyin. Bu metod 3 integer değer alsın ve
    değişkenlerin değerlerini sırayla saate, dakikaya ve saniyeye
    atasın. Burada da gerekli kontrolleri yapınız.

    Test sınıfında kullanıcının, sınıfların özelliklerine doğrudan
    erişmesini engelleyiniz. Test sınıfında metodları test ediniz.

    ************

    QUESTION - 12

    SporMusabakasi sınıfı tanımlayın. Bu sınıfın musabakaGunu ve
    musabakaSaati özellikleri olsun.

    Mac arayuzu tanımlayın. Bu arayüzde setHakem, getHakem
    metodu tanımlayın.

    FutbolMaci sınıfı SporMusabakasi sınıfını extend, Mac arayuzunu
    implement etsin. Bu sınıfın hakem, evSahibiTakim ve
    deplasmanTakimi özellikleri olsun.

    Test sınıfında testlerinizi yapınız.

    ************

    QUESTION - 13

    Belirsiz sayıda pozitif integer değeri parametre olarak alan,
    bu sayıların her biri için, toplamın yüzde kaçı olduğunu ve
    en altta da toplamlarını ekrana yazdıran metodu yazınız.

    ************

    QUESTION - 14

    Bir n tamsayı değerini parametre olarak alan ve nxn
    boyutunda aşağıdaki şekilde kare oluşturan metodu
    yazınız.
    örnek n=2 için :

    *--*--*
    |  |  |
    *--*--*
    |  |  |
    *--*--*

    ************

    QUESTION - 15

    Bir n tamsayı değerini parametre olarak alan, n
    uzunluğunda taban alanına sahip ve n yüksekliğinde
    aşağıdaki şekilde üçgen oluşturan metodu yazınız.
    örnek n=3 için :
        +
       /|
      / |
     /  |
    +---+