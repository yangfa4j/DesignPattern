package interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Date 2019/12/13
 * @Author yangfa
 * @Description 计算机
 */
public class Calculator {

    private Expression expression;

    public Calculator(String expression) { //  类似 a+b-c

        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆接为单个字符
        char[] chars = expression.toCharArray(); // [a,+,b,-,c]

        Expression left = null;
        Expression right = null;

        // 遍历表达式，放入栈中做处理
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop(); // a
                    right = new VarExpression(String.valueOf(chars[++i])); // b
                    stack.push(new AddExpression(left, right)); // 传入加法表达式
                    break;

                case '-':
                    left = stack.pop(); // a+b 的结果 sum
                    right = new VarExpression(String.valueOf(chars[++i])); // c
                    stack.push(new SubExpression(left, right)); // 传入减法表达式  sum - c
                    break;

                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        // 当处理完运算表达式后，栈中应该只剩一个表达式了，应该是各个Expression组合的
        this.expression = stack.pop();
    }


    // 算出最后的结果
    public int run(HashMap<String,Integer> var ){

        return this.expression.interpreter(var);
    }
}
