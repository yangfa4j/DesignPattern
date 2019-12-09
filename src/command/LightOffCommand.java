package command;

/**
 * @Date 2019/12/9
 * @Author yangfa
 * @Description 电灯关命令
 */
public class LightOffCommand implements Command {

    private LightExecute lightExecute; // 聚合电灯操作者

    public LightOffCommand(LightExecute lightExecute) {
        this.lightExecute = lightExecute;
    }

    @Override
    public void execute() {
        lightExecute.off();
    }

    @Override
    public void undo() {
        lightExecute.on();
    }
}
