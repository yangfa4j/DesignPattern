package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Date 2019/12/10
 * @Author yangfa
 * @Description
 */
public class OutPut {

    private List<College> collegeList;

    public OutPut(List<College> collegeList) {
        this.collegeList = collegeList;
    }


    // 学院输出系
    public void  printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department next = (Department)iterator.next();
            System.out.println(next.getName());
        }
    }

    // 遍历所有的学院，在调用学院输出系的方法
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College next = iterator.next();
            System.out.println(" ==="+ next.getName()+"== ");
            Iterator iterator1 = next.createIterator();
            printDepartment(iterator1);
        }
    }
}
