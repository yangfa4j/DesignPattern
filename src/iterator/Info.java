package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Date 2019/12/10
 * @Author yangfa
 * @Description 信息工程学院
 */
public class Info implements College {

    private List<Department> departmentList;

    public Info() {
        departmentList = new ArrayList<>();
        addDepartment(" 信息安全 "," 信息安全 ");
        addDepartment(" 通信 "," 通信 ");
        addDepartment(" 5G "," 5G ");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String description) {
        Department department = new Department(name, description);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
