public class Main {
    public static void main(String[] args)
    {
        // task 1
        System.out.println("*** task 1");
        int var01 = -987654;
        byte var02 = 123;
        short var03 = -31458;
        long var04 = 987654322334567L;
        float var05 = 768.35f;
        double var06 = 9753.234567890;
        System.out.println("Значение переменной 1 с типом int равно " + var01);
        System.out.println("Значение переменной 2 с типом byte равно " + var02);
        System.out.println("Значение переменной 3 с типом short равно " + var03);
        System.out.println("Значение переменной 4 с типом long равно " + var04);
        System.out.println("Значение переменной 5 с типом float равно " + var05);
        System.out.println("Значение переменной 6 с типом double равно " + var06);

        // task 2
        System.out.println("*** task 2");
        int var11 = 27897;
        byte var12 = 2;
        short var13 = -159;
        long var14 = 987678965549L;
        float var15 = 67.f;
        double var16 = 27.12;
        char var17 = 569;
        boolean var18 = false;
        System.out.println("Значение переменной 7 с типом char равно " + var17);
        System.out.println("Значение переменной 8 с типом bool равно " + var18);

        // task 3
        System.out.println("*** task 3");
        short numStudents1 = 23;
        short numStudents2 = 27;
        short numStudents3 = 30;
        int numStudents = numStudents1 + numStudents2 + numStudents3;
        int numPaper = 480;
        numPaper = numPaper / numStudents;
        System.out.println("На каждого ученика рассчитано " + numPaper + " листов бумаги");

        // task 4
        System.out.println("*** task 4");
        short perform2min = 16;
        int perform20min = perform2min * 10;
        System.out.println("За 20 минут машинa произвела "+ perform20min + " бутылок " );
        int perform1h = perform20min *3;
        System.out.println("За 1 час машинa произвела "+ perform1h + " бутылок " );
        int prodOut1d = perform1h * 24;
        System.out.println("За 1 сутки машинa произвела "+ prodOut1d + " бутылок " );
        int prodOut3d = prodOut1d * 3;
        System.out.println("За 3 суток машинa произвела "+ prodOut3d + " бутылок " );
        prodOut3d = prodOut1d * 30;
        System.out.println("За 1 месяц машинa произвела "+ prodOut3d + " бутылок " );

        // task 5
        System.out.println("*** task 5");
        short numBar = 120;
        int paintBrn = 4;
        int paintWht = 2;
        int numClass = numBar / (paintWht + paintBrn);
        int numBarWht = numClass * paintWht;
        int numBarBrn = numClass * paintBrn;
        System.out.println("В школе, где " + numClass + " классов, нужно "+ numBarWht +" банок белой краски и "+ numBarBrn +" банок коричневой краски" );

        // task 6
        System.out.println("*** task 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int sundae = 2 * 100;
        int eggs = 4 * 70;
        int kgToG = 1000;
        int cocktailWeight = bananas + milk + sundae + eggs;
        float weightKg = (float) cocktailWeight / 1000;
        System.out.println("Коктейль спортсмена весит " + cocktailWeight + " грамм или "+ weightKg +" кг" );

        // task 7
        System.out.println("*** task 7");
        int excessWeight = 7 * kgToG;
        int days250 = excessWeight / 250;
        int days500 = excessWeight / 500;
        System.out.println("Чтобы похудеть на 7 кг спортсмену понадобится от " + days500 + " до "+ days250 +" дней" );
        System.out.println("Среднее значение " + (days500 + days250)/2 +" день");

        // task 8
        System.out.println("*** task 8");
        int salaryM = 67760;
        float salaryM10 = (float) salaryM / 10;
        int salaryD = 83690;
        float salaryD10 =  (float) salaryD / 10;
        int salaryK = 76230;
        float salaryK10 = (float) salaryK / 10;
        System.out.println("После повышения зарплаты на 10%");
        System.out.println("Маша будет получать " + (salaryM + salaryM10)  + " рублей в месяц");
        System.out.println("Денис будет получать " + (salaryD + salaryD10) + " рублей в месяц");
        System.out.println("Кристина будет получать " + (salaryK + salaryK10) + " рублей в месяц");

        System.out.println("Годовая зарплата увеличится");
        System.out.println("у Маши на " + salaryM10 * 12 + " рублей");
        System.out.println("у Дениса на " + salaryD10 * 12 + " рублей");
        System.out.println("у Кристины на " + salaryK10 * 12 + " рублей");

        System.out.println("********");
    }
}
