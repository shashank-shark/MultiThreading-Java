package calculator;

public class Calculator implements Runnable {

    public void run() {
        long current = 1L;
        long max = 2000L;
        long numberOfPrimes = 0L;
        System.out.printf("Thread started: '%s': START\n", Thread.currentThread().getName());
    }

    private boolean isPrime(long number) {

        if (number <= 2) {
            return true;
        }

        for (long i = 2; i < number; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }

        return true;
    }
}
