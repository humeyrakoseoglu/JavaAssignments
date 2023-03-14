package Question7;

public class Sozluk {
    private String[] kelimeler ;

    public Sozluk(String[] kelimeler) {
        this.kelimeler = kelimeler;
    }

    public void kelimeleriListele(){
        class innerKelimeler{
            public void kelimeListele(){
                for ( String i : kelimeler){
                    System.out.println(i);
                }
            }
        }
        innerKelimeler innerKelimeler = new innerKelimeler();
        innerKelimeler.kelimeListele();
    }

}
