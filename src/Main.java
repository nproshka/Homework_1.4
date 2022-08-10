public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    public static void exercise1() {
        int w = 0;
        while (w < 10) {
            w++;
            System.out.print(w + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
    public static void exercise2 () {
        int numberMontFriday = 5;
        while (numberMontFriday <=31) {
            System.out.println("Сегодня пятница, " + numberMontFriday + "-е число. Нам необходимо подготовить отчёт");
            numberMontFriday = numberMontFriday + 7;
        }
    }
    public static void exercise3 () {
        int yearToDay = 2022;
        int startYear = yearToDay - 200;
        int endYear = yearToDay + 100;

        for (int CometYear = startYear; CometYear <= endYear; CometYear++ ) {
            if (CometYear % 79 == 0) {
                System.out.println(CometYear);
            }

        }
    }
}