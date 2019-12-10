package visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Date 2019/12/10
 * @Author yangfa
 * @Description 维护了一个集合
 */
public class ObjectStructure  {

    private List<Person> personList = new LinkedList<>();

    public void attach(Person person){
        personList.add(person);
    }

    public void detach(Person person){
        personList.remove(person);
    }

    public void display(Action action){
        personList.forEach( person ->
            person.accept(action)
        );
    }

}
