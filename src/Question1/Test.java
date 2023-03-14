package Question1;

public class Test {
    public static void main(String[] args) {
        Arac volvo= new Arac();
        volvo.hiz = 200;
        System.out.println("Hızı: " + volvo.HiziGetir());
        System.out.println("Araba duracak.");
        volvo.Dur();
        System.out.println("Hız: " + volvo.HiziGetir());
        System.out.println("Çalışıyor mu: " + volvo.Calisiyormu());
        System.out.println("Araba hızlanacak.");
        volvo.Hizlan();
        volvo.Hizlan();
        System.out.println("Hız: " + volvo.HiziGetir());
        System.out.println("Araba yavaşlayacak.");
        volvo.Yavasla(5);
        volvo.Yavasla(5);
        volvo.Yavasla(5);
        System.out.println("Hız: " + volvo.HiziGetir());
    }
}



