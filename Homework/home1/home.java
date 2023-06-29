import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();

    }
    public static void Task1(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Task 1:");
        System.out.println("Введите N:");
        int n = in.nextInt();
        int sum = 0;
        
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        
        System.out.printf("Сумма от 1 до %d = %d%n", n, sum);

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.printf("%d! = %d", n, fact);

        in.close();
    }

    public static void Task2() {
        System.out.println("Простые числа от 1 до 1000:");

        for (int i = 1; i <= 1000; i++) {
            boolean isSimple = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isSimple = false;
                }
            }
            if (isSimple) System.out.println(i);
        }
    }

    public static void Task3() {
        System.out.println("Простой калькулятор:");

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        double n = in.nextDouble();
        boolean repeat = true;
        do {
            System.out.println("Введите операцию (+ - * /), 0 для выхода:");
            String operation = in.nextLine();
            switch (operation) {
                case "+":
                    System.out.println("Введите второе число:");
                    n += in.nextInt();
                    System.out.println(n);
                    break;
                case "-":
                    System.out.println("Введите второе число:");
                    n -= in.nextInt();
                    System.out.println(n);
                    break;
                case "*":
                    System.out.println("Введите второе число:");
                    n *= in.nextInt();
                    System.out.println(n);
                    break;
                case "/":
                    System.out.println("Введите второе число:");
                    n /= in.nextInt();
                    System.out.println(n);
                    break;
                case "0":
                    repeat = false;
                    System.out.println("Выход");
                    break;
                default:
                    break;
            }
        }while (repeat);

        in.close();
    }
}
