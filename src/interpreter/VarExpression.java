package interpreter;

import java.util.HashMap;

/**
 * @Date 2019/12/13
 * @Author yangfa
 * @Description 变量解析器
 */
public class VarExpression extends Expression {

    private String key; // a,b,c

    public VarExpression(String key) {
        this.key = key;
    }

    // 获取变量所对应的值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
