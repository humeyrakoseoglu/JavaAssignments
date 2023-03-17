package Question7;

public class Sozluk {
    private String[] kelimeler ;

    public String[] getKelimeler() {
        return kelimeler;
    }

    public void setKelimeler(String[] kelimeler) {
        this.kelimeler = kelimeler;
    }

    public Sozluk(String[] kelimeler) {
        this.kelimeler = kelimeler;
    }

    public void kelimeleriListele(){
        class innerKelimeler{
            public void kelimeleriListele(){
                for ( String i : kelimeler){
                    System.out.println(i);
                }
            }
        }
        innerKelimeler innerKelimeler = new innerKelimeler();
        innerKelimeler.kelimeleriListele();
    }

}
