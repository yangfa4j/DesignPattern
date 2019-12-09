package command;

/**
 * @Date 2019/12/9
 * @Author yangfa
 * @Description 遥控器面板
 */
public class RemoteController {

    private Command[] onCommands; // 开按钮
    private Command[] offCommands; // 关按钮
    private Command undoCommand; // 撤销

    public RemoteController() {

        onCommands = new Command[5];
        offCommands = new Command[5];

        // 用空按钮初始化遥控器
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 给按钮设置具体的操作
    public void setCommands(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 按下开按钮
    public void onButtonWasPushed(int no){
        // 找到你按下的开按钮，并调用其执行者的对应方法
        onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    // 按下关按钮
    public void offButtonWasPushed(int no){
        // 找到你按下的开按钮，并调用其执行者的对应方法
        offCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    // 按下撤销按钮
    public void undoButtonWasPushed(){
        // 找到你按下的开按钮，并调用其执行者的对应方法
       undoCommand.undo();
    }
}
