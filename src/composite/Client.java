package composite;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) {

        Organization university = new University("清华大学","top1"); // 大学

        Organization college1 = new College("计算机学院","计算机学院"); // 学院
        Organization college2 = new College("文学院","文学院"); // 学院

        Department department1 = new Department("C++","C++");
        Department department2 = new Department("JAVA","JAVA");
        Department department3 = new Department("JS","JS");
        Department department4 = new Department("语言文学","语言文学");

        university.add(college1);
        university.add(college2);

        college1.add(department1);
        college1.add(department2);
        college1.add(department3);

        college2.add(department4);

        university.print();




    }
}
