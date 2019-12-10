package visitor;

/**
 * @Date 2019/12/9
 * @Author yangfa
 * @Description
 */
public class Success extends Action {
    @Override
    public void getMan(Man man) {
        System.out.println( " 男人评价成功" );
    }

    @Override
    public void getWoman(Woman woman) {
        System.out.println( "女人评价成功" );
    }
}
