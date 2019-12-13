package interpreter;

import java.util.HashMap;

/**
 * @Date 2019/12/13
 * @Author yangfa
 * @Description 加法解释器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 处理相加
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
