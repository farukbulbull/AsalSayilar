public class AsalSayilar {
    public static void main(String[] args) {
        int max = 100;
        System.out.println("1'den " + max + "'e kadar olan asal sayılar:");
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}