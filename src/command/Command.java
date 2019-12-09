package command;

/**
 * @Date 2019/12/9
 * @Author yangfa
 * @Description 命令接口
 */
public interface Command {

    public void execute();

    public void undo();

}
