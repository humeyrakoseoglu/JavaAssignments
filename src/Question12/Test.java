package Question12;

public class Test {
    public static void main(String[] args) {
        FutbolMaci testMac = new FutbolMaci("2023-03-13", "21:30", "Kocaelispor", "Sakaryaspor");
        testMac.setHakem("Fırat Aydınus");
        System.out.println("Maçın Tarihi: " + testMac.getMusabakaGunu()
                        +"\nMaçın Saati: " + testMac.getMusabakaSaati()
                        +"\nEv Sahibi: " + testMac.getEvSahibiTakim()
                        +"\nDeplasman: " + testMac.getDeplasmanTakimi()
                        +"\nHakem: " + testMac.getHakem());
    }
}
