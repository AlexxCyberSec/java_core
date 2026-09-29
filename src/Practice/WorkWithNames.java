package Practice;

public class WorkWithNames {
//    Программа должна
//
//    очистить каждое имя от лишних пробелов;
//    вывести каждое имя с заглавной буквы;
//    проверить, содержит ли имя цифры — если да, вывести предупреждение;
//    пропустить пустые имена;
//    посчитать количество валидных имён (не пустых и без цифр).
//
//    Ожидаемый вывод
//    Вывод
//
//    Alice - OK
//    Bob - OK
//    Charlie - OK
//    david123 - ОШИБКА: содержит цифры
//    Eva - OK
//    Frank - OK
//    (пустое имя пропущено)
//    Grace - OK
//    Валидных имён: 6
    public static void main(String[] args) {

        //Дано
        String[] names = {"alice", "BOB", "  Charlie  ", "david123", "Eva", "FRANK", "", "grace"};

        //счетчик валидных имен
        int validNames = 0;

        for (String name : names) {

            if (name.isEmpty()) {
                System.out.println("(пустое имя пропущено)"); //пропускаем пустые имена

            } else {

                name = name.trim(); //убираем лишние пробелы

                //выводим все имена с заглавной буквы
                String rightName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

                if (hasNoDigits(rightName)) { //проверяем на наличие цифр в имени
                    validNames += 1; //увеличиваем счетчик валидных имен, так как прошло все условия
                    System.out.println(rightName + " - OK");

                } else {
                    System.out.println(name + " - ОШИБКА: содержит цифры");
                }
            }
        }
        System.out.println("Валидных имён: " + validNames);

        //Задание со звездочкой - НАПИСАТЬ ПРОВЕРКУ, ЯВЛЯЕТСЯ ЛИ СЛОВО ПАЛИНДРОМОМ
        String[] words = {"level", "hello", "racecar", "world", "madam"};

        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word + " → палиндром");
            } else {
                System.out.println(word + " → не палиндром");
            }
        }
    }

    public static boolean hasNoDigits(String name) {

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    //Метод для задания со звездочкой
    public static boolean isPalindrome(String word) {

        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
