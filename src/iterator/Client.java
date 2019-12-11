package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2019/12/10
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) {

        List<College> colleges = new ArrayList<>();
        colleges.add(new Computer());
        colleges.add(new Info());

        OutPut outPut = new OutPut(colleges);

        outPut.printCollege();

    }
}
