package Question2;

public class Test {
    public static void main(String[] args) {
        Atis yukaridanAsagiya = new YukaridanAsagiyaDuseyAtis();
        Atis asagidanYukariya = new AsagidanYukariyaDuseyAtis();

        int V0 = 30; // cismin ilk hızı m/s
        int t = 3; // gecen sure

        System.out.println("Yukaridan asagiya dusen cismin hizi: " + yukaridanAsagiya.hiziHesapla(V0, t) + " m/s'dir.");
        System.out.println("Asagidan yukariya dusen cismin hizi: " + asagidanYukariya.hiziHesapla(V0, t) + " m/s'dir.");

    }
}
