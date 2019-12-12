package mediator;


import java.util.Date;
 
public class ChatRoom {
   // 显示哪个用户发送的消息
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString()
         + " [" + user.getName() +"] : " + message);
   }
}