package pk.create.builder2;

public class BenzBuilder extends CarBuilder {

    @Override
    public String buildEngine() {
        return super.getBlueprint().getEngine();
    }

    @Override
    public String buildWheel() {
        return super.getBlueprint().getWheel();
    }
}
