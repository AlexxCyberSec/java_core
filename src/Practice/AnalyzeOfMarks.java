package Practice;

public class AnalyzeOfMarks {
    public static void main(String[] args) {

        //Задание
        //Напиши программу, которая анализирует массив оценок студентов и выводит статистику.
        //Здесь пригодится всё из этого модуля: массивы, цикл for, условия if и тип boolean.

        //Программа должна:
        //    найти максимальную и минимальную оценку;
        //    посчитать среднее арифметическое;
        //    посчитать количество сдавших (оценка 60 и выше);
        //    вывести, сдал ли весь класс (boolean allPassed).

        //Ожидаемый вывод:

        //Максимальная оценка: 91
        //Минимальная оценка: 34
        //Средняя оценка: 67
        //Сдали экзамен: 7 из 10
        //Весь класс сдал: false

        //Дано
        int[] grades = {85, 42, 91, 67, 55, 78, 34, 90, 61, 73};

        int maxVal = grades[0];

        int minVal = grades[0];

        int srAr = 0;
        int sumVal = 0;
        int lengthGrades = grades.length;

        int passedCount = 0;

        boolean classIsPassed = true;

        char[] letterGrades = {'A', 'B', 'C', 'F'};

        for (int i : grades) {

            //1
            if (i > maxVal) {
                maxVal = i;
            }

            //2
            if (i < minVal) {
                minVal = i;
            }

            //3
            sumVal += i;


            //4
            if (i >= 60) {
                passedCount += 1;
            }

            //5
            if (i < 60) {
                classIsPassed = false;
            }
        }

        srAr = sumVal / lengthGrades;

        System.out.println("Максимальная оценка: " + maxVal);
        System.out.println("Минимальная оценка: " + minVal);
        System.out.println("Средняя оценка: " + srAr);
        System.out.println("Сдали экзамен: " + passedCount + " из " + lengthGrades);
        System.out.println("Весь класс сдал: " + classIsPassed);

        //СО ЗВЕЗДОЧКОЙ

        for (int i : grades) {
            if (i >= 90 && i <= 100) {
                System.out.println(i + " -> " + letterGrades[0]);
            }
            else if (i >= 75 && i <= 89) {
                System.out.println(i + " -> " + letterGrades[1]);
            }
            else if (i >= 60 && i <= 74) {
                System.out.println(i + " -> " + letterGrades[2]);
            } else {
                System.out.println(i + " -> " + letterGrades[3]);
            }
        }
    }
}
