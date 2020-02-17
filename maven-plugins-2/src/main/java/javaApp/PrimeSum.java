package javaApp;

public class PrimeSum {

    public static void main(String[] args) {
        System.out.println(primesum(20));
    }

    static long primesum(int maxNum) {
        int sum = 0, num = 0;
        if (maxNum <= 0) {
            return sum;
        } else {
            for (; maxNum > 0; maxNum--) {
                if (checkPrime(maxNum)) {
                    sum = sum + maxNum;
                }
            }
        }

        return sum;
    }

    static boolean checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            return flag == 0;
        }//end of else
    }

}


