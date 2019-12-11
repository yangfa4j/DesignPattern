package iterator;

import java.util.Iterator;

/**
 * @Date 2019/12/10
 * @Author yangfa
 * @Description 计算机学院
 */
public class Computer implements College {

    private Department[] departments; // 数组
    private int numOfDepartment = 0; // 保存当前这个数组对象的个数

    public Computer() {
        this.departments = new Department[5];
        addDepartment(" 计算机科学与技术 "," 计算机科学与技术 ");
        addDepartment(" 软件工程 "," 软件工程 ");
        addDepartment(" 物联网 "," 物联网 ");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String description) {
        Department department = new Department(name, description);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
