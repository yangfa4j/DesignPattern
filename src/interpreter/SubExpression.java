package interpreter;

import java.util.HashMap;

/**
 * @Date 2019/12/13
 * @Author yangfa
 * @Description
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 处理相减
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
