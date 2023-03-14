package Question4;

public class FindikliCikolata extends Cikolata {
    private double findikOrani;

    public FindikliCikolata(double sutOrani, double kakaoOrani, double findikOrani) {
        super(sutOrani, kakaoOrani);
        this.findikOrani = findikOrani;
    }

    public double getFindikOrani() {
        return findikOrani;
    }

    public void setFindikOrani(double findikOrani) {
        this.findikOrani = findikOrani;
    }
}
