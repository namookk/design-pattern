package decorator;

public class DecoratorPattern {
    public static void main(String[] args) {

        new XWingFighter().attack();

        new LaserDecorator(new XWingFighter()).attack();

        new PlasmaDecorator(
           new MissileDecorator(
              new LaserDecorator(
                 new XWingFighter()
              ))).attack();
    }
}
