package iterator;

import java.util.Iterator;

/**
 * @Date 2019/12/10
 * @Author yangfa
 * @Description
 */
public interface College {

    public String getName();
    public void addDepartment(String name,String Description);
    public Iterator createIterator();

}
