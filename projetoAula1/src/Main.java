// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(fatorial(numero));
        mostraPares(numero);

    }

    public static int fatorial(int n){
        if (n == 0)
            return 1;
        else
            return n * fatorial(n - 1);
    }

    public static void mostraPares(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}