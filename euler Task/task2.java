public class task2 {
    public static void main(String[] args) {
        long number = 600851475143L;
        long maxNumer = 0;
        for (long i = 2L; i < number; i++) {
            System.out.println(i);
            if ((number%i == 0)) {
                long tempNumber = i;
                if (isPrime(tempNumber)) {
                    if (tempNumber > maxNumer) {
                        maxNumer = tempNumber;
                    }
                }                
                
            }
        }
        System.out.println(maxNumer);
    }
    public static boolean isPrime(long tempNumber) {
        for (long j = 2L; j < tempNumber; j++) {
            if (tempNumber % j == 0) {
                return false;
            }
        }
        return true;
    }
}
