package Question15;

public class Question15 {
    public static void main(String[] args) {
        ucgenOlustur(10);
    }

    public static void ucgenOlustur(int n) {
        //ilk satir
        for (int k = 0; k <= n; k++) {
            System.out.print(" ");
        }
        System.out.println("+");
        // orta satirlar
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        //son satir
        System.out.print("+");
        for (int j = 0; j < n; j++) {
            System.out.print("-");
        }
        System.out.print("+");
    }

}
