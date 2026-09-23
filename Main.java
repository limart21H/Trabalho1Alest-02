
public class Main {

    public static void main(String[] args) {
        System.out.println("Algoritmo1,Algoritmo2,Algoritmo3,Algoritmo4,Algoritmo5");

        for (int n = 1; n <= 10; n += 1) {
            long r1 = Algoritmo1.f(n);
            long r2 = Algoritmo2.f(n);
            long r3 = Algoritmo3.f(n);
            long r4 = Algoritmo4.f(n);
            long r5 = Algoritmo5.f(n);

            System.out.println("\n" + n + "," + r1 + "," + r2 + "," + r3 + "," + r4 + "," + r5);
        }
    }
}
