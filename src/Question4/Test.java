package Question4;
/*
Upcasting alt sınıftan oluşturulmuş bir nesneyi üst sınıftan oluşturulmuş bir nesneye çevirmek.
    Parent p = new Child();

Downcasting ise üst sınıftan oluşturulmuş bir nesneyi alt sınıftan oluşturulmuş bir nesneye çevirme işine verilen addır.
    Parent p = new Child();
    Child c = (Child)p;
 */
public class Test {
    public static void main(String[] args) {
        //FindikliCikolata sınıfından Cikolata sınıfına upcast işlemi
        Cikolata findikliUpcast = new FindikliCikolata(0.5, 0.4,0.5);
        findikliUpcast.setSutOrani(0.6);
        System.out.println("Findikli cikolata downcast oranları sut: " + findikliUpcast.getSutOrani() +
                ", kakao: " + findikliUpcast.getKakaoOrani());

        //BitterCikolata sınıfından Cikolata sınıfına upcast işlemi
        Cikolata bitterUpcast = new BitterCikolata(0.8);
        bitterUpcast.setKakaoOrani(0.9);
        System.out.println("Bitter çikolata downcast oranları sut: " + bitterUpcast.getSutOrani() +
                ", kakao: " + bitterUpcast.getKakaoOrani());

        //Cikolata sınıfından BitterCikolata sınıfına downcast işlemi
        BitterCikolata bitterDowncast = (BitterCikolata) bitterUpcast;
        bitterDowncast.setKakaoOrani(0.7);
        System.out.println("Bitter cikolata upcast oranları sut : " + bitterDowncast.getSutOrani() +
                ", kakao: " + bitterDowncast.getKakaoOrani());

        // FindikliCikolata sınıfından Cikolata sınıfına upcasting işlemi
        FindikliCikolata findikliDowncast = (FindikliCikolata) findikliUpcast;
        findikliDowncast.setFindikOrani(0.4);
        System.out.println("Findikli cikolata upcast oranları sut: " + findikliDowncast.getSutOrani() +
                ", kakao: " + findikliDowncast.getKakaoOrani() +
                ", findik: " + findikliDowncast.getFindikOrani());
    }

}
