package Question14;

public class Question14 {
    public static void main(String[] args) {
        kareOlustur(3);
    }

    public static void kareOlustur(int n) {
        //ilk satir
        for(int i = 0; i < n; i++) {
            System.out.print("*--");
        }
        System.out.println("*");
        //diger satirlar
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("|  ");
            }
            System.out.println("|");
            for(int j = 0; j < n; j++) {
                System.out.print("*--");
            }
            System.out.println("*");
        }
    }
}