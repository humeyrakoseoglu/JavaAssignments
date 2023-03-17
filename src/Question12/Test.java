package Question12;

public class Test {
    public static void main(String[] args) {
        FutbolMaci testMac = new FutbolMaci("10.03.2023", "21:30", "Kocaelispor", "Sakaryaspor");
        testMac.setHakem("Fırat Aydınus");
        System.out.println("Maçın Tarihi: " + testMac.getMusabakaGunu()
                        +"\nMaçın Saati: " + testMac.getMusabakaSaati()
                        +"\nEv Sahibi: " + testMac.getEvSahibiTakim()
                        +"\nDeplasman: " + testMac.getDeplasmanTakimi()
                        +"\nHakem: " + testMac.getHakem());
    }
}
