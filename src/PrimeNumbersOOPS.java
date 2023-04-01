import java.util.ArrayList;
import java.util.List;
public class PrimeNumbersOOPS {
    private List<Integer> primeNumbers;
    private List<Integer> nonPrimeNumbers;

    public PrimeNumbersOOPS(int range) {
            primeNumbers = new ArrayList<>();
            nonPrimeNumbers = new ArrayList<>();
            calculatePrimes(range);
        }
        private void calculatePrimes(int range) {
            for (int i = 2; i <= range; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNumbers.add(i);
                } else {
                    nonPrimeNumbers.add(i);
                }
            }
        }

        public List<Integer> getPrimeNumbers() {
            return primeNumbers;
        }

        public List<Integer> getNonPrimeNumbers() {
            return nonPrimeNumbers;
        }

        public List<Integer> getLargestPrimes(int count) {
            int size = primeNumbers.size();
            if (count >= size) {
                return primeNumbers;
            } else {
                return primeNumbers.subList(size - count, size);
            }
        }

        public static void main(String[] args) {
            PrimeNumbersOOPS primeNumbers = new PrimeNumbersOOPS(50);
            List<Integer> largestPrimes = primeNumbers.getLargestPrimes(15);

            System.out.print("Prime numbers: ");
            for (Integer prime : largestPrimes) {
                System.out.print(prime + " ");
            }
            System.out.println();

            System.out.print("Non-prime numbers: ");
            for (Integer nonPrime : primeNumbers.getNonPrimeNumbers()) {
                System.out.print(nonPrime + " ");
            }
        }
}
