import java.util.Scanner;
public class HW01 {
    public static void main(String[] args) {
        // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n)
        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("Input number: ");
        // int n = iScanner.nextInt();
        // iScanner.close();
        // System.out.printf("Sum for numbers from 1 to %d = %d", n, GetSum(n));


        // 2. Вычислить n! (произведение чисел от 1 до n)
        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("Input number: ");
        // int n = iScanner.nextInt();
        // iScanner.close();
        // System.out.printf("Factorial for number %d = %d", n, Factorial(n));


        // 3. Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка.)
        // Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
        // System.out.println("Simple digits from 1 to 1000 is ");
        // for(int i = 2; i < 1000; i++) {
        //     int k = 0;
        //     for (int j = 2; j < i; j++) {
        //         if (i % j == 0) {
        //             k = k + 1;
        //         }
        //     }
        //     if (k <= 0) {
        //         System.out.printf("%d, ", i);
        //     }
        // }


        // 4. Реализовать простой калькулятор ("введите первое число"... 
        // "Введите второе число"... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Enter 1st number: ");
        // int a = iScanner.nextInt();
        // System.out.printf("Enter 2nd number: ");
        // int b = iScanner.nextInt();
        // Scanner iScanner2 = new Scanner(System.in);
        // System.out.printf("Enter operation symbol (+, -, *, /) for your numbers: ");
        // String symbol = iScanner2.nextLine();
        // iScanner.close();
        // iScanner2.close();
        // char s1 = symbol.charAt(0);
        // if (s1 == '+') {
        //     System.out.printf("%d + %d = %d\n", a, b, a + b);
        //     }
        // if (s1 == '-') {
        //             System.out.printf("%d - %d = %d\n", a, b, a - b);
        //     }
        // if (s1 == '*') {
        //             System.out.printf("%d * %d = %d\n", a, b, a * b);
        //     }
        // if (s1 == '/') {
        //             System.out.printf("%d / %d = %d\n", a, b, a / b);
        //     }
      
    }

    static public int GetSum(int a) {
        int res = 0;
        for (int i = 1; i <= a; i++) {
            res = res + i;
        }
        return res;
    }

    static public int Factorial(int a) {
        if (a == 1) {
            return 1;
        }
        else {
            return a * Factorial(a - 1);
        }
    }
}