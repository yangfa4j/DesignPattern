package template;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Objects;

/**
 * @Date 2019/12/6
 * @Author yangfa
 * @Description
 */
public abstract class Cooking {

    // 模板方法，用 final 修饰，防止字类重写
    public final void make(){
        buy();
        rice();
        if(isTure()){
            addCondition();
        }
        cooking();
    }

    // 买菜
    public void buy(){
        System.out.println("去菜市场买菜");
    }

    // 每个菜自己特有的
    public abstract void addCondition();

    // 做米饭
    public void rice(){
        System.out.println("做米饭");
    }

    // 炒菜
    public void cooking(){
        System.out.println("炒菜，准备吃饭了！");
    }

    // 钩子方法
    boolean isTure(){
        return true;
    }
}
