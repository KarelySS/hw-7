public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1
        System.out.println("Задача 1");
        int salary = 15000;
        int all = 2459000;
        int i = 0;
        int money = 0;
        while (money < all) {
            i = i + 1;
            money = money + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + money + " рублей");
        }
        //Задача 2
        System.out.println("Задача 2");
        int x = 0;
        while (x < 10) {
            x++;
            System.out.print(" " + x);
        }
        System.out.println(" ");
        for (int y = 10; y >= 1; y--) {
            System.out.print(" " + y);
        }
        System.out.println(" ");
        //Задача 3
        System.out.println("Задача 3");
        double Y = 12000000;
        double birthrate = 17;
        double mortality = 8;
        for (int year = 2023; year <= 2032; year++) {
            Y += Y * (birthrate - mortality) / 1000;
            System.out.println("Год " + year + " численность населения состовляет " + (int) Y + " человек");

        }
        //Задача 4
        System.out.println("Задача 4");
        double cash = 15000;
        double diff = 1.07;
        int month = 0;
        while (cash < 12000000) {
            cash *= diff;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений = " + (int) cash);
        }
        //Задача 5
        System.out.println("Задача 5");
        double cash1 = 15000;
        double diff1 = 1.07;
        int month1 = 0;
        while (cash1 < 12000000) {
            cash1 *= diff1;
            month1 = month1 + 1;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " сумма накоплений = " + (int) cash1);
            }
        }
        //Задача 6
        System.out.println("Задача 6");
        double cash2 = 15000;
        double diff2 = 1.07;
        int month2 = 0;
        while (month2 < 12 * 9) {
            cash2 *= diff2;
            month2 = month2 + 1;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений = " + (int) cash2);
            }
        }
        //Задача 7
        System.out.println("Задача 7");
        int friday = 1;
        for (int k = friday; k <= 31; k = k + 7) {
            System.out.println("Сегодня пятница," + k + "-е число. Необходимо подготовить отчет");
        }
        //Задача 8
        System.out.println("Задача 8");
        for (int h = 2023-200; h <= 2123; h++) {
            if (h % 79 == 0){
                System.out.println(h);
            }

        }
    }
}
