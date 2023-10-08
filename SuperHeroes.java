public class SuperHeroes {
    public static void main(String[] params) {
        // создадим первого героя
        SuperHero firstHero = new SuperAgility(new SuperIntellegence(new GreenSuperHero()));
        // и второго
        SuperHero secondHero = new SuperPower(new SuperAgility(new RedSuperHero()));
        SuperHero thirdHero = new SuperPower(new SuperIntellegence( new BlueSuperHero()));
        // представим их публике
        printInfo(firstHero);
        printInfo(secondHero);
        printInfo(thirdHero);
        // и устроим битву
        fight(firstHero, secondHero, thirdHero);
    }

    private static void fight(SuperHero first, SuperHero second, SuperHero third) {
        if (first.getChanceOfSurvival() > second.getChanceOfSurvival() && first.getChanceOfSurvival() > third.getChanceOfSurvival()) {
            printAlive(first);
        } else if (second.getChanceOfSurvival() > first.getChanceOfSurvival() && second.getChanceOfSurvival() > third.getChanceOfSurvival()) {
            printAlive(second);
        } else if (third.getChanceOfSurvival() > first.getChanceOfSurvival() && third.getChanceOfSurvival() > second.getChanceOfSurvival()){
            printAlive(third);
        }
        else
        {
            System.out.println("Шансы на выживание равны");
        }
    }

    private static void printInfo(SuperHero superHero) {
        System.out.println();
        System.out.printf("У супергероя `%1$s` шанс на выживание равен %2$d. ", superHero.getDescription(), superHero.getChanceOfSurvival());
    }

    private static void printAlive(SuperHero superHero) {
        System.out.println();
        System.out.printf("Выживет супергерой `%1$s`. ", superHero.getDescription());
    }
}
