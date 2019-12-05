package proxy.staticproxy;

/**
 * @Date 2019/12/5
 * @Author yangfa
 * @Description
 */
public class TeachProxy implements ITeach {

    private ITeach teacher; // 代理对象，这里通过接口来聚合

    public TeachProxy(Teacher teacher) {
        this.teacher = teacher;
    }



    @Override
    public void teach() {
        teacher.teach();
        System.out.println("静态代理，实现(继承) 同一个接口(父类)，聚合这个接口(父类)");
    }
}
