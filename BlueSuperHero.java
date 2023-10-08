public class BlueSuperHero extends BaseSuperHero{
    @Override
    public String getDescription() {
        return "Синий супергерой" + super.getDescription();
    }

    @Override
    public int getChanceOfSurvival() {
        return 55;
    }
}
