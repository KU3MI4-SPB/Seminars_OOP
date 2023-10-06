package Lesson_3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    static Random random = new Random();

    static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };


        int salary = random.nextInt(50000, 110000);
        Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary);
        return worker;
    }

    /**
     * TODO: Переработать метод generateEmployees. Метод должен возвращать массив сотрудников
     *  разных типов (Worker, Freelancer), метод должен быть ОДИН!
     * @param count
     * @return
     */
    static Worker[] generateEmployees(int count){
        Worker[] employees = new Worker[count];
        for (int i = 0; i < employees.length; i++)
            employees[i] = generateWorker();
        return employees;
    }

    public static void main(String[] args) {

        Worker[] employees = generateEmployees(15);

        Arrays.sort(employees, new SalaryComparator(SortType.Ascending));

        for (Worker employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new SalaryComparator(SortType.Descending));

        for (Worker employee: employees) {
            System.out.println(employee);
        }

    }

}
