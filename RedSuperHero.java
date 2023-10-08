public class RedSuperHero extends BaseSuperHero{
    @Override
    public String getDescription() {
        return "Красный супергерой" + super.getDescription();
    }

    @Override
    public int getChanceOfSurvival() {
        return 52;
    }
}
