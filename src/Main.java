public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int number1 = 3;
        byte number2 = 1;
        long number3 = 100L;
        float number4 = 15.24F;
        double number5 = 1.42561;

        System.out.println("Значение переменной " + "number1" + " с типом " + "int" + " равно " + number1);
        System.out.println("Значение переменной " + "number2" + " с типом " + "byte" + " равно " + number2);
        System.out.println("Значение переменной " + "number3" + " с типом " + "long" + " равно " + number3);
        System.out.println("Значение переменной " + "number4" + " с типом " + "float" + " равно " + number4);
        System.out.println("Значение переменной " + "number5" + " с типом " + "double" + " равно " + number5);

        System.out.println("Задача 2");

        byte n = 67;
        short a1 = -159, a2 = 67, a3 = 569, a4 = 27897;
        int b1 = -159, b2 = 67, b3 = 569, b4 = 27897;
        long c1 = -159L, c2 = 67L, c3 = 569L, c4 = 27897L, c5 = 987_678_965_549L;
        float d1 = 2.786F, d2 = 27.12F;
        double p1 = 2.786, p2 = 27.12;
        boolean m = false;

        System.out.println("Задача 3");

        int a11 = 23;
        int a12= 27;
        int a13= 30;
        int bq = 480;
        int aq = a11 + a12 + a13;
        System.out.println("На каждого ученика рассчитано " + bq / aq + " листов бумаги");

        System.out.println("Задача 4");

        int bottles = 16;
        int minutes = 2;
        int twentyMinutes = minutes * 10;
        int efficiency = bottles / minutes;
        int dayMinutes = 24 * 60;
        int day = 3;
        int minutesQuantityDays = day * dayMinutes;

        System.out.println("За " + twentyMinutes + " минут произведено бутылок " + efficiency * twentyMinutes + " штук");
        System.out.println("За " + dayMinutes + " минут произведено бутылок " + efficiency * dayMinutes + " штук");
        System.out.println("За " + minutesQuantityDays + " минут произведено бутылок " + efficiency * minutesQuantityDays + " штук");

        day = day * 10;
        System.out.println("За " + minutesQuantityDays + " минут произведено бутылок " + efficiency * minutesQuantityDays + " штук");

        System.out.println("Задача 5");

        int totalCansPaint = 120;
        int cansWhitePaint = 2;
        int cansBrownPaint = 4;
        int cansOneClass = cansWhitePaint + cansBrownPaint;

        System.out.println("В школе, где " + (totalCansPaint / cansOneClass) + " классов, нужно " + (cansWhitePaint * totalCansPaint / cansOneClass) + " банок белой краски и " + (cansBrownPaint * totalCansPaint / cansOneClass) + " банок коричневой краски");

        System.out.println("Задача 6");

        int Bananas = 5;
        int IceCreamBriquettes = 2;
        int Eggs = 4;
        int milkVolume = 200;

        int weight1Banana = 80;
        int weightIceCreamBriquette = 100;
        int weight1Egg = 70;
        int milkWeight = 105;
        int mixtureGrams = Bananas * weight1Banana + IceCreamBriquettes * weightIceCreamBriquette + Eggs * weight1Egg + (milkVolume / 100 * milkWeight);
        float kilogram = mixtureGrams / 1000F;
        System.out.println(kilogram);

        System.out.println("Задача 7");

        int loseWeight = 7000;
        int weightLoss = 250;
        int moreWeightLoss = weightLoss * 2;
        int weightLossDays = (loseWeight / weightLoss);
        int moreWeightLossDays = loseWeight / moreWeightLoss;
        int arithmMean = weightLossDays + moreWeightLossDays;

        System.out.println(weightLossDays + " уйдёт на похудение, если терять ежедневно по " + weightLoss + " граммов");
        System.out.println(moreWeightLossDays + " уйдёт на похудение, если терять ежедневно по " + moreWeightLoss + " граммов");
        System.out.println("Чтобы добиться результата похудения в среднем потребуется " + (arithmMean / 2) + " день");

        System.out.println("Задача 8");

        int mSalaryMonthUpto = 67760;
        int dSalaryMonthUpto = 83690;
        int kSalaryMonthUpto = 76230;

        int mSalaryUpto = mSalaryMonthUpto * 12;
        int dSalaryUpto = dSalaryMonthUpto * 12;
        int kSalaryUpto = kSalaryMonthUpto * 12;

        int mSalaryMonthAfter = mSalaryMonthUpto * 10/100 + mSalaryMonthUpto;
        int dSalaryMonthAfter = dSalaryMonthUpto * 10/100 + dSalaryMonthUpto;
        int kSalaryMonthAfter = kSalaryMonthUpto * 10/100 + kSalaryMonthUpto;

        int mSalaryAfter = mSalaryMonthAfter * 12;
        int dSalaryAfter = dSalaryMonthAfter * 12;
        int kSalaryAfter = kSalaryMonthAfter * 12;

        System.out.println("Маша теперь получает " + mSalaryMonthAfter + " рублей в месяц. Годовой доход вырос на " + (mSalaryAfter - mSalaryUpto) + " рублей");
        System.out.println("Денис теперь получает " + dSalaryMonthAfter + " рублей в месяц. Годовой доход вырос на " + (dSalaryAfter - dSalaryUpto) + " рублей");
        System.out.println("Кристина теперь получает " + kSalaryMonthAfter + " рублей в месяц. Годовой доход вырос на " + (kSalaryAfter - kSalaryUpto) + " рублей");


    }
}