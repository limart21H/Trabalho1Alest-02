
public class Algoritmo5 {

    static long f(int n) {
        long i, j, k, l, res = 0;
        long cont_op = 0;
        for (i = 0; i < n; i += 1) {
            for (j = 0; j < n; j += 1) {
                for (k = 0; k < n; k += 1) {
                    for (l = 0; l < n; l += 1) {
                        res = res + n + 1;
                        cont_op++;
                    }
                }
            }
        }
        return cont_op;
    }

    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("n,cont_op");
        for (int n : valores) {
            long contagem = f(n);
            System.out.println(n + "," + contagem);
        }
    }
}
