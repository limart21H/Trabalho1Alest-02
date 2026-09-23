
public class Algoritmo1 {

    static long f(int n) {
        long i, j, res = 0;
        long cont_op = 0;
        for (i = 1; i <= n; i += 1) {//O
            for (j = 0; j < i; j += 1) { 
                res = res + n + 1;
                cont_op++;
            }
        }
        return cont_op;
    }

    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 50, 200, 500, 1000, 5000, 10000};

        System.out.println("n,cont_op");
        for (int n : valores) {
            long contagem = f(n);
            System.out.println(n + "," + contagem);
        }
    }
}
