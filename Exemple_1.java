import java.util.Scanner;

/**
 * Exemple_1
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
 */
public class Exemple_1 {
    public static void main(String[] args) {
        int n = scannerInt();
        int sum = sumn(n);
        int fact = factorialn(n);
        //String res = String.format("Сумма чисел от 1 до %d равна %d\nФакториал числа %d равен %d", n, sum, n, fact);
        System.out.printf("Сумма чисел от 1 до %d равна %d\nФакториал числа %d равен %d", n, sum, n, fact);
        }
    
    public static int sumn(int n) {
        int sum = 0;
        while (n >= 1) {
            sum = sum + n;
            n = n - 1;
        }
        return sum;
    }

    public static int factorialn(int n) {
        int fact = 1;
        while (n >= 1) {
            fact = fact * n;
            n = n - 1;
        }
        return fact;
    }

    public static int scannerInt () {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число для вычеслений: ");
        int x = iScanner.nextInt();
        iScanner.close();

        return x;
    }
}