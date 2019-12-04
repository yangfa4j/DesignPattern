package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description 大学 -> 管理学院
 */
public class University extends Organization{

    List<Organization> college = new ArrayList<>(); // 管理学院


    public University(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(Organization organization) {
        college.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        college.remove(organization);
    }

    @Override
    public void print() {
        System.out.println(getName());
        college.stream().forEach(Organization::print);
    }
}
