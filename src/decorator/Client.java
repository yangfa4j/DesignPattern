package decorator;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) {

        ACoffee aCoffee = new ACoffee();

        BDecorator bDecorator = new BDecorator(aCoffee);
        String description = bDecorator.getDescription();
        System.out.println("description = " + description);

        float cost = bDecorator.cost();
        System.out.println("cost = " + cost);

        System.out.println("---------------------------------");

        ADecorator aDecorator = new ADecorator(bDecorator);
        String description1 = aDecorator.getDescription();
        System.out.println("description1 = " + description1);
        float cost1 = aDecorator.cost();
        System.out.println("cost1 = " + cost1);
    }
}
