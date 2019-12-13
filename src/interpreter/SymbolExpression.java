package interpreter;

import java.util.HashMap;

/**
 * @Date 2019/12/13
 * @Author yangfa
 * @Description 抽象的 符号解释器，每个符号只知道左右两个变量
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;   // 左表达式
    protected Expression right; // 右表达式

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // 让其具体计算字类来实现这个方法，本身不实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
