public class Main {
    public static void main (String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int a = 40000;
        byte b = 22;
        short c = 25000;
        long d = 80000000L;
        float e = 3.75F;
        double f = 2.1584;
        System.out.println("Значение переменной 'a' с типом int равно " + a);
        System.out.println("Значение переменной 'b' с типом byte равно " + b);
        System.out.println("Значение переменной 'c' с типом short равно " + c);
        System.out.println("Значение переменной 'd' с типом long равно " + d);
        System.out.println("Значение переменной 'e' с типом float равно " + e);
        System.out.println("Значение переменной 'f' с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float variableFloat = 27.12F;
        System.out.println("Переменная float " + variableFloat);
        long variableLong = 987678965549L;
        System.out.println("Переменная long " + variableLong);
        double variableDouble = 2.786;
        System.out.println("Переменная Double " + variableDouble);
        int variableInt = 569;
        System.out.println("Переменная int " + variableInt);
        short variableShort1 = -159;
        System.out.println("Переменная short " + variableShort1);
        short variableShort2 = 27897;
        System.out.println("Переменная short " + variableShort2);
        byte variableByte = 67;
        System.out.println("Переменная byte " + variableByte);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        int studentAll = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperOne = paper / studentAll;
        System.out.println("На каждого ученика расчитано " + paperOne + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");

        byte bottle = 16;
        byte time = 2;
        int bottleTime = bottle / time;
        int minute20 = bottleTime * 20;
        System.out.println("За 20 минут машина произвела " + minute20 + " штук бутылок");
        int day = bottleTime * 24 * 60;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int day3 = day * 3;
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        int month = day * 30;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

    }

    public static void task5() {
        System.out.println("Задача 5");

        byte paintAll = 120;
        byte classOneWhite = 2;
        byte classOneBrown = 4;
        int classAll = paintAll / (classOneWhite + classOneBrown);
        int paintAllWhite = classAll * classOneWhite;
        int paintAllBrown = classAll * classOneBrown;
        System.out.println("в школе, где " + classAll + " классов, нужно " + paintAllWhite +
                " банок белой краски и " + paintAllBrown + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        int bananasWeight = bananas * 80;
        short milk = 200;
        int milkWeight = (milk * 105 / 100);
        byte plombir = 2;
        int plombirWeight = plombir * 100;
        byte egg = 4;
        int eggWeight = egg * 70;
        int breakfastGram = bananasWeight + milkWeight + plombirWeight + eggWeight;
        float breakfastKg = breakfastGram / 1000f;
        System.out.println("Завтрак спортсмена весит " + breakfastGram + " грамм и " +breakfastKg +
                " килограмм");
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte weightAllKg = 7;
        short weightMinGram = 250;
        short weightMaxGram = 500;
        int weightAllGram = weightAllKg * 1000;
        System.out.println("Спортсмену нужно сбросить " + weightAllKg + "кг (" + weightAllGram +
                ")грамм. Он может терять вес от " + weightMinGram + " грамм до " + weightMaxGram +
                " грамм в день");
        int lossWeightMinDay = weightAllGram / weightMinGram;
        System.out.println("Если спортсмен будет терять по " + weightMinGram + "грамм, у него уйдет "
                +lossWeightMinDay + "дней");
        int lossWeightMaxDay = weightAllGram / weightMaxGram;
        System.out.println("Если спортсмен будет терять по " + weightMaxGram + "грамм, у него уйдет "
                +lossWeightMaxDay + "дней");
        int lossWeightAverage = (lossWeightMinDay + lossWeightMaxDay) / 2;
        System.out.println("В среднем, что бы добиться результата для похудения потребуется "
                + lossWeightAverage + "день");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaNew = masha * 110 / 100;
        int denisNew = denis * 110 / 100;
        int kristinaNew = kristina * 110 / 100;
        int mashaOldYear = masha * 12;
        int denisOldYear = denis * 12;
        int kristinaOldYear = kristina * 12;
        int mashaNewYear = mashaNew * 12;
        int denisNewYear = denisNew * 12;
        int kristinaNewYear = kristinaNew * 12;
        int mashaDifference = mashaNewYear - mashaOldYear;
        int denisDifference = denisNewYear - denisOldYear;
        int kristinaDifference = kristinaNewYear - kristinaOldYear;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на "
                + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на "
                + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNew + "рублей. Годовой доход вырос на "
                + kristinaDifference + " рублей");

    }
}