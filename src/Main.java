public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задание 1");
        int perMonth = 15000;
        int bank = 0;
        int month = 1;
        int theTotalAmount = 2_459_000;
        while (bank <= theTotalAmount) {
            bank += perMonth;
            perMonth *= 1.01;
            System.out.println("Месяц " + month + " сумма накоплений равна " + bank + " рублей");
            ++month;
        }
        // task 2
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            ++i;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // task 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int theBirthRateIs = 17;
        int mortalityRate = 8;

        for (int g = 1; g <= 10; g++) {
            population += (population / 1000 * (theBirthRateIs - mortalityRate));
            System.out.println("Год " + g + ", численность населения составляет " + population);
        }
        // task 4
        System.out.println("Задание 4");
        int initially = 15000;
        int theAmountCollected = 12_000_000;
        month = 1;
        while (initially <= theAmountCollected) {
            initially *= 1.07;
            System.out.println("месяц" + month + ", сумма накопления = " + initially);
            ++month;
        }
        // task 5
        System.out.println("Задание 5");
        initially = 15000;
        theAmountCollected = 12_000_000;
        month = 1;
        while (initially <= theAmountCollected) {
            initially *= 1.07;
            if (month % 6 == 0)
                System.out.println("месяц" + month + ", сумма накопления = " + initially);
            ++month;
        }
        // task 6
        System.out.println("Задание 6");
        initially = 15000;
        for (int j = 1; j < 9 * 12; j++) {
            initially *= 1.07;
            if (j % 6 == 0) {
                System.out.println("месяц" + j + ", сумма накопления = " + initially);
            }

        }
        // task 7
        System.out.println("Задание 7");
        for (int h = 3; h <= 31; h += 7) {
            System.out.println("Сегодня пятница, " + h + "-е число. Необходимо подготовить отчет");
        }
        // task 8
        System.out.println("Задание 8");
        int current = 2024;
        int last = current - 200;
        int theNearest = current + 100;

        for (int year = last; year <= theNearest; ++year) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}