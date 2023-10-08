public class BaseSuperHero implements SuperHero{
    private boolean superPower; // есть суперсила
    private boolean superAgility; // есть суперловкость
    private boolean superIntelligence; // есть суперинтеллект

    public boolean hasSuperPower() {
        return superPower;
    }

    public void setSuperPower(boolean superPower) {
        this.superPower = superPower;
    }

    public boolean hasSuperAgility() {
        return superAgility;
    }

    public void setSuperAgility(boolean superAgility) {
        this.superAgility = superAgility;
    }

    public boolean hasSuperIntelligence() {
        return superIntelligence;
    }

    public void setSuperIntelligence(boolean superIntelligence) {
        this.superIntelligence = superIntelligence;
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("");
        if (hasSuperPower())
            description.append(" с суперсилой");
        if (hasSuperAgility())
            description.append(" с суперловкостью");
        if (hasSuperIntelligence())
            description.append(" с суперинтеллектом");
        return description.toString();
    }

    @Override
    public int getChanceOfSurvival() {
        int chanceOfSurvival = 0;
        if (hasSuperPower())
            chanceOfSurvival += 4;
        if (hasSuperAgility())
            chanceOfSurvival += 3;
        if (hasSuperIntelligence())
            chanceOfSurvival += 7;
        return chanceOfSurvival;
    }
}
