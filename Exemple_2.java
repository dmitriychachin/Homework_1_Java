import java.util.Scanner;

public class Exemple_2 {
    public static void main(String[] args) {
        int num = scannerInt();
        String res = numberto(num);
        res.trim();
        System.out.printf("Все числа от 1 до %d:\n%s", num, res);
    }

    public static String numberto(int num) {
        StringBuilder res = new StringBuilder();
        int x = 1;
        for (int i = 0; i < num; i++) {
            res.append(x).append(" ");
            x = x + 1;
        }
        return res.toString();
    }

    public static int scannerInt () {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число до которого надо вывести другие числа: ");
        int x = iScanner.nextInt();
        iScanner.close();

        return x;
    }
}
