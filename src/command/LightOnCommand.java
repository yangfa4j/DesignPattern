package command;

/**
 * @Date 2019/12/9
 * @Author yangfa
 * @Description 电灯开命令
 */
public class LightOnCommand implements Command {

    private LightExecute lightExecute; // 聚合电灯操作者

    public LightOnCommand(LightExecute lightExecute) {
        this.lightExecute = lightExecute;
    }


    @Override
    public void execute() {
        lightExecute.on();
    }

    @Override
    public void undo() {
        lightExecute.off();
    }
}
