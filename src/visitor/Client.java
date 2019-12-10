package visitor;

import java.util.Objects;

/**
 * @Date 2019/12/10
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        // 数据结构
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success(); // 成功

        objectStructure.display(success);
    }
}
