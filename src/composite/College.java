package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description 学院 -> 管理系
 */
public class College extends Organization {
    List<Organization> department = new ArrayList<>(); // 管理系

    public College(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(Organization organization) {
        department.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        department.remove(organization);
    }

    @Override
    public void print() {
        System.out.println(getName());
        department.stream().forEach(Organization::print);
    }
}
