package JAVA_MINI.Pr1;

public class My_Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Задание:
        // выведите сумму, разность, произведение, частное и остаток

        System.out.println("Сумма: " + (a + b));
        System.out.println("Произведение: " + (a * b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Частное: " + (a / b));
        System.out.println("Остаток: " + (a % b));

        int c = 30;

        System.out.println("Среднее арифметическое: " + ((a + b + c) / 3));
    }
}
