package interpreter;

import java.util.HashMap;

/**
 * @Date 2019/12/13
 * @Author yangfa
 * @Description
 */
public abstract class Expression {

    // HashMap 用来存每个表达式所对应的值
    public abstract int interpreter(HashMap<String, Integer> var);
}
