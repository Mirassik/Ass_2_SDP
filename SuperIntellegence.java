public class SuperIntellegence extends SuperHeroDecorator{
    public SuperIntellegence(SuperHero superHero) {
        super(superHero);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " с суперинтеллектом";
    }

    @Override
    public int getChanceOfSurvival() {
        return super.getChanceOfSurvival() + 7;
    }
}
