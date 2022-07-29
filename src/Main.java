public class Main {
    public static void main(String[] args) {
        // задание1
        int dog = 5;
        short mouse = 4;
        long elephant = 123L;
        byte igor = 2;
        float sugarWeight = 2.3f;
        double saltWeight = 3.2;
        char c = 33;
        char d = '!';
        System.out.println(c + " = " + d);

        // Задание2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxer = boxer1 + boxer2;
        System.out.println( "общий вес боксеров" + weightOfAllBoxer);
        double weightDifference = boxer2 - boxer1;
        System.out.println( "разница боксеров" + weightDifference);

        // Задача 3
        int Bananas = 5;
        int OneBanana = 80;
        int milk = 2;
        int milk100 =105;
        int IceCreamSundae = 2;
        int IceCreamSundae1Briket =100;
        int RawEggs =4;
        int oneEgg =70;
        int BananasGr=(Bananas * OneBanana);
        double milk200 = (milk * milk100);
        int IceCreamSundaeGr = ( IceCreamSundae + IceCreamSundae1Briket);
        int RawEggsGr =(RawEggs * oneEgg);
        double totalWeight = (BananasGr + milk200 + IceCreamSundaeGr + RawEggsGr);
        System.out.println( "вес коктеля грамм" + totalWeight);




        //4 задание
        int weight =7;
        int KgPerGr =( 7 * 1000);
        int losses250 = ( KgPerGr / 250);
        System.out.println( "надо дней по 250гр" + losses250);
        int losses500 = (KgPerGr / 500);
        System.out.println("надо дней по 500гр" + losses500);

        // 5 задание
        double masha = (67760);
        System.out.println( " Зп машав " + masha);
        double annualIncomeMasha= ( masha * 12);
        System.out.println( " Зп машав год" + annualIncomeMasha);
        double mashaIncreaseOf =( masha * 10 / 100);
        System.out.println( "прибавка маши в месяц" + mashaIncreaseOf);
        double mashaIncrease =(masha + mashaIncreaseOf);
        System.out.println( "новая зп маши в месяц" + mashaIncrease);
        double salaryIncreasePerYearMasha=( mashaIncrease * 12);
        System.out.println( "новая зп маши в год" + salaryIncreasePerYearMasha);
        double profitMasha = ( salaryIncreasePerYearMasha -annualIncomeMasha );
        System.out.println( "прибыль маши в год" + profitMasha);

        double denis = (83690);
        System.out.println(" Зп дениса" + denis);
        double annualIncomeDenis= (denis * 12);
        System.out.println(" Зп дениса год" + annualIncomeDenis);
        double denisIncreaseOf =( denis * 10 / 100);
        System.out.println( "прибавка дениса в месяц" + denisIncreaseOf);
        double denisIncrease= (denis + denisIncreaseOf);
        System.out.println( "новая зп дениса в месяц" +denisIncrease);
        double salaryIncreasePerYearDenis = (denisIncrease * 12);
        System.out.println( "новая зп дениса в год" + salaryIncreasePerYearDenis);
        double profitDenis = ( salaryIncreasePerYearDenis - annualIncomeDenis );
        System.out.println( "прибыль дениса в год" + profitDenis);

        double kristi = (76230);
        System.out.println( " Зп кристина " + kristi);
        double annualIncomeKristi= (kristi *12);
        System.out.println( " Зп кристина год" + annualIncomeKristi);
        double kristiIncreaseOf = ( kristi * 10 / 100);
        System.out.println( "прибавка кристина в месяц"+ kristiIncreaseOf);
        double kristiIncrease = ( kristi + kristiIncreaseOf);
        System.out.println("новая зп кристина в месяц" + kristiIncrease);
        double salaryIncreasePerYearKristi = (kristiIncrease * 12);
        System.out.println( "новая зп кристина в год" + salaryIncreasePerYearKristi);
        double profitKristi = ( salaryIncreasePerYearMasha -salaryIncreasePerYearKristi );
        System.out.println( "прибыль кристина в год" + profitKristi);
























    }
}