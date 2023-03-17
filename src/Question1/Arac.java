package Question1;

public class Arac implements UlasimAraci, KaraAraci { //Bir sınıf birden fazla interface implements edebilir
    int hiz; //doğrudan dışarıdan değiştirilmesini önlemek için

    @Override
    public void Dur() {
        hiz = 0;
    } //Aracın hızını sıfırlar

    @Override
    public void Hizlan() {
        hiz += 10;
    }//Aracın hızını 10 km/h artırır

    @Override
    public void Yavasla(int x) {
        hiz -= x;
    } //Aracın hızını x kadar azaltır

    @Override
    public boolean Calisiyormu() {
        return (hiz == 0) ?  false : true;

    }//Aracın hızına bakarak true yada false döner

    @Override
    public int HiziGetir() {
        return hiz;
    } //Aracın hızını döner

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }
}
