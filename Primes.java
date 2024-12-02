public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        printPrimes(N);
    }

    public static void printPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        int index = 2;

        while (index <= n) {
            primes[index] = isPrime(index);
            if (primes[index]) {
                for (int i = 2*index; i <= n; i+=index) {
                    primes[i] = false;
                }
            }
            index++;
        }

        int count = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between " + 2 + " and " + n + " (" + (100 * count / n) + "% are primes)" );
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}