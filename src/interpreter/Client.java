package interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @Date 2019/12/13
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expression = getExpression(); // a+b-c
        HashMap<String, Integer> value = getValue(expression); // 获得表达式的值
        Calculator calculator = new Calculator(expression);
        int run = calculator.run(value);
        System.out.println("run = " + run);
    }

    // 获取表达式
    public static String getExpression() throws IOException {
        System.out.println(" 请输入表达式： ");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    // 获取表达式对应的值
    public static HashMap<String, Integer> getValue(String expression) throws IOException {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (char c : expression.toCharArray()) {
            if (c != '+' && c != '-') {
                if (!hashMap.containsKey(String.valueOf(c))) {
                    System.out.println(" 请输入" + String.valueOf(c) + "的值");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    hashMap.put(String.valueOf(c),Integer.valueOf(in));
                }
            }
        }
        return hashMap;
    }
}
