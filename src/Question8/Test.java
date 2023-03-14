package Question8;

public class Test {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen("mavi",10,5);
        System.out.println("Dikdörtgenin rengi: "+ dikdortgen.getRenk()+" çevresi: "+dikdortgen.cevreHesapla()+" alanı: "+dikdortgen.alanHesapla());
        Ucgen ucgen = new Ucgen("yeşil", 6,4);
        System.out.println("Üçgenin rengi: "+ ucgen.getRenk()+" çevresi: "+ucgen.cevreHesapla()+" alanı: "+ucgen.alanHesapla());

    }
}
