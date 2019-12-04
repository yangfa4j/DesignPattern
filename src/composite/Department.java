package composite;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description 系 -> 叶子结点
 */
public class Department extends Organization {

    public Department(String name, String description) {
        super(name, description);
    }

    // 不再重写 add 与 remove 方法了，因为它是叶子结点

    @Override
    public void print() {
        System.out.println(getName());
    }
}
