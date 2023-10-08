public class GreenSuperHero extends BaseSuperHero{
    public String getDescription() {
        return "Зелёный супергерой" + super.getDescription();
    }

    @Override
    public int getChanceOfSurvival() {
        return 50;
    }
}
