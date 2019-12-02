package prototpye;

/**
 * @Date 2019/11/28
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("多莉",1,"白色");
        Sheep clone1 = sheep.clone();
        Sheep clone2 = sheep.clone();
        Sheep clone3 = sheep.clone();
        System.out.println("clone1 = " + clone1);
        System.out.println("clone2 = " + clone2);
        System.out.println("clone3 = " + clone3);
    }
}
