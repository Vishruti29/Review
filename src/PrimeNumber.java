//program to find prime numbers from 1 to 50 and store greater 15 numbers in temp array
public class PrimeNumber {
    public static void main(String[] args) {
        int[] tempArray = new int[15];
        int[] testArray = new int[35];
        int primeCount = 0;
        int nonPrimeCount = 0;
        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
                if (isPrime) {
                    if (primeCount < 15) {
                        tempArray[primeCount] = i;
                    }
                    primeCount++;
                    } else {
                    if (nonPrimeCount < 35) {
                        testArray[nonPrimeCount] = i;
                }  nonPrimeCount++;
                }
    }
        System.out.println("Total prime numbers between 1 to 50 :");
        System.out.println("prime numbers are : ");
            for (int a = 0; a < primeCount; a++) {
                System.out.println(tempArray[a] + "");
            }
        System.out.println("Non Prime numbers are");

            for (int b = 0; b < nonPrimeCount; b++)
                System.out.println(testArray[b]+ "");
        }
    }
