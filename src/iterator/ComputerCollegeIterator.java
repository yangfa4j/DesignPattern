package iterator;

import java.util.Iterator;

/**
 * @Date 2019/12/10
 * @Author yangfa
 * @Description 计算机学院
 */
public class ComputerCollegeIterator implements Iterator {

    private Department[] departments; // 数组
    private int position = 0; // 遍历开始的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(position > departments.length - 1 || departments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    @Override
    public void remove() {

    }
}
