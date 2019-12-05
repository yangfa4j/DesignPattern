package proxy.staticproxy;

/**
 * @Date 2019/12/5
 * @Author yangfa
 * @Description
 */
public class TeachProxy implements ITeach {

    private Teacher teacher;

    public TeachProxy(Teacher teacher) {
        this.teacher = teacher;
    }



    @Override
    public void teach() {
        teacher.teach();
        System.out.println("静态代理，实现(继承) 同一个接口(父类)，聚合被代理对象");
    }
}
