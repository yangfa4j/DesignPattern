package command;

/**
 * @Date 2019/12/9
 * @Author yangfa
 * @Description 空命令，不执行任何操作，用于初始化遥控器中的按钮
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
