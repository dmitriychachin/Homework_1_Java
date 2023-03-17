import java.util.Scanner;


public class EXemple_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int x1 = scannerInt("Введите первое число:", iScanner);
        int x2 = scannerInt("Введите второе число", iScanner);
        String znac = scannerStr("Введите знак действия", iScanner);
       
        String res = calculator(x1, x2, znac);
        System.out.println(res);

        iScanner.close();
        
    }

    public static int scannerInt (String message, Scanner iScanner) {
        System.out.println(message);
        int x = iScanner.nextInt();

        return x;
    }

    public static String scannerStr (String message,Scanner iScanner) {
        System.out.println(message);
        String str = null;
        do{
        str = iScanner.nextLine();
        }while(str.isEmpty());


        return str;
    }

    public static String calculator(int x1, int x2, String znac) {
        int v = 0;
        StringBuilder res = new StringBuilder();

        switch(znac) {
            case "+":
            v = x1 + x2;
            res.append("Ваш ответ равен ").append(v);
            break;
            case "-":
            v = x1 + x2;
            res.append("Ваш ответ равен").append(v);
            break;
            case "*":
            v = x1 * x2;
            res.append("Ваш ответ равен").append(v);
            break;
            case "/":
            v = x1 / x2;
            res.append("Ваш ответ равен").append(v);
            break;
            default:
                res.append("Походу этот калькулятор не обрабатывает подобные знаки");
        }

        return res.toString();
    }
}