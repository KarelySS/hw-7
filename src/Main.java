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
            money = i * salary;
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
        int Y = 12000000;
        int birthrate = 17;
        int mortality=8;
        for (int year=2023; year<=2033; year++) {
            Y+=Y*(birthrate-mortality)/1000;
            System.out.println("Год " + year + " численность населения состовляет " + Y + " человек");

    }
    //Задача 4
            System.out.println("Задача 4");
        int cash=15000;
        int total=0;
        int month=1;
        while (total<=12000000){
            total=total+total*7/100;
            total=total+cash;
            month=month+1;
            System.out.println("Месяц "+month+" сумма накоплений = "+total);
        }
    //Задача 5
            System.out.println("Задача 5");
    //Задача 6
            System.out.println("Задача 6");
    //Задача 7
            System.out.println("Задача 7");
    //Задача 8
            System.out.println("Задача 8");

}
}