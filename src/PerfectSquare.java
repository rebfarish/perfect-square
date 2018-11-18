public class PerfectSquare{
public static void main(String[] args) {
    PerfectSquare perfectSquare = new PerfectSquare();

    System.out.println(PerfectSquare.isPerfectSquare(225));
    }

private static long isPerfectSquare(long x) {

    long a = (long) Math.sqrt(x);

    if (a * a == x) {
        a++;
        a = a * a;
    } else {
        throw new IllegalArgumentException("Not a perfect square");
    }
    return a;
    }
}
