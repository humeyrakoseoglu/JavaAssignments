package Question12;

public class FutbolMaci extends SporMusabakasi implements Mac{

    private String hakem;
    private String evSahibiTakim;
    private String deplasmanTakimi;

    public FutbolMaci(String musabakaGunu, String musabakaSaati, String evSahibiTakim, String deplasmanTakimi) {
        super(musabakaGunu, musabakaSaati);
        this.evSahibiTakim = evSahibiTakim;
        this.deplasmanTakimi = deplasmanTakimi;
    }

    @Override
    public String getHakem() {
        return hakem;
    }

    @Override
    public void setHakem(String hakem) {
        this.hakem = hakem;
    }

    public String getEvSahibiTakim() {
        return evSahibiTakim;
    }

    public void setEvSahibiTakim(String evSahibiTakim) {
        this.evSahibiTakim = evSahibiTakim;
    }

    public String getDeplasmanTakimi() {
        return deplasmanTakimi;
    }

    public void setDeplasmanTakimi(String deplasmanTakimi) {
        this.deplasmanTakimi = deplasmanTakimi;
    }
}
