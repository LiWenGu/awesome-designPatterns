package pk.create.builder2;

public class BMWBuilder extends CarBuilder {

    @Override
    public String buildEngine() {
        return super.getBlueprint().getEngine();
    }

    @Override
    public String buildWheel() {
        return super.getBlueprint().getWheel();
    }
}
