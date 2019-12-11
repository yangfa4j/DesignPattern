package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Date 2019/12/10
 * @Author yangfa
 * @Description
 */
public class InfoCollegeIterator implements Iterator {

    private List<Department> departmentList; // 集合
    int index = -1; // 索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if ( index >= departmentList.size() -1){
            return false;
        }else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
