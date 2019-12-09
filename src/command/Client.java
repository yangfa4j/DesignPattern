package command;

/**
 * @Date 2019/12/9
 * @Author yangfa
 * @Description 人去使用遥控器
 */
public class Client {
    public static void main(String[] args) {

        LightExecute lightExecute = new LightExecute(); // 初始化电灯执行者

        LightOnCommand lightOnCommand = new LightOnCommand(lightExecute); // 电灯开命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightExecute); // 电灯关命令

        RemoteController remoteController = new RemoteController(); // 初始化遥控器
        remoteController.setCommands(0,lightOnCommand,lightOffCommand); // 给遥控器按钮添加操作

        remoteController.onButtonWasPushed(0); // 开电灯
        remoteController.offButtonWasPushed(0); // 关电灯
        remoteController.undoButtonWasPushed();
    }
}
