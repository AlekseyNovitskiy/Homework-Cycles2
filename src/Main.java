public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int deposit = 15000;
        int countMonth = 0;
        double allDepositSum = 0;
        double percentDepositOfMonth = 0.01;
        while (allDepositSum < 2_459_000) {
            allDepositSum = allDepositSum + deposit + allDepositSum * percentDepositOfMonth;
            countMonth = countMonth + 1;

            System.out.println("Месяц "+ countMonth +" сумма накоплений равна "+allDepositSum+ " рублей");
        }
        // Задание 2
        System.out.println("Задание 2");

        int i = 0;
        while (i < 10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int totalPopulation= 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 0;
        while (year < 10) {
            int totalDeathRate = (totalPopulation/1000) * deathRate;
            int totalBirthRate = (totalPopulation/1000) * birthRate;
            totalPopulation = totalPopulation + totalBirthRate - totalDeathRate;
            year++;
            System.out.println("Год "+ year + " численность населения составляет "+ totalPopulation);
        }
        // Задание 2.1
        System.out.println("Задание 2.1");
        double fullDepositSum = 15000;
        countMonth = 0;
        double percentDepositOfMonth1 = 0.07;
        while (fullDepositSum < 12_000_000) {
            fullDepositSum = fullDepositSum + fullDepositSum * percentDepositOfMonth1;
            countMonth = countMonth + 1;
            System.out.println("Месяц "+ countMonth +" сумма накоплений равна "+fullDepositSum + " рублей");
        }
        // Задание 2.2
        System.out.println("Задание 2.2");

        fullDepositSum = 15000;
        countMonth = 0;
        percentDepositOfMonth1 = 0.07;
        while (fullDepositSum < 12_000_000) {
            fullDepositSum = fullDepositSum + fullDepositSum * percentDepositOfMonth1;
            countMonth = countMonth + 1;
            if (countMonth % 6 == 0) {
                System.out.println("Месяц " + countMonth + " сумма накоплений равна " + fullDepositSum + " рублей");
            }
        }
        if (countMonth % 6 != 0) {  //Вывожу значение за последний месяц
            System.out.println("Месяц " + countMonth + " сумма накоплений равна " + fullDepositSum + " рублей");
        }

        // Задание 2.3
        System.out.println("Задание 2.3");

        fullDepositSum = 15000;
        countMonth = 0;
        double percentDepositOfMonth2 = 0.07;
        while (countMonth < 108) {
            fullDepositSum = fullDepositSum + fullDepositSum * percentDepositOfMonth2;
            countMonth = countMonth + 1;
            if (countMonth % 6 == 0)
                System.out.println("Месяц " + countMonth + " сумма накоплений равна " + fullDepositSum + " рублей");
        }
        // Задание 2.4
        System.out.println("Задание 2.4");
        int countDaysMonth = 31;
        int daysOfTheWeek = 7;
        int daysFriday = 5; //Вводится первый день пятницы
        while (daysFriday <= countDaysMonth) {
            System.out.println("Сегодня пятница, " + daysFriday + " -е число. Необходимо подготовить отчет.");
            daysFriday += daysOfTheWeek;
        }
        // Задание 3.1
        System.out.println("Задание 3.1");
        int currentYear = 2022;
        int minYear = currentYear - 200;
        int futureYear = currentYear + 100;
        for ( ; minYear <= futureYear; minYear++) {
            if (minYear % 79 == 0 ) {
                System.out.println(minYear);
            }
        }
        // Задание 3.2
        System.out.println("Задание 3.2");
        for (int y = 1; y <= 10; y++) {
            System.out.println("2 * " + y + " = " + y * 2);

        }


    }
}