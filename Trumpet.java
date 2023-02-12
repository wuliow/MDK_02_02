public class Trumpet implements TheTool{
    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром" + getDiameter());
    }
}