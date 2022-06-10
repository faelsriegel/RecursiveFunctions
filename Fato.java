public class Fato {

    static long f(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return f(n - 1) * n;
        }
    }}