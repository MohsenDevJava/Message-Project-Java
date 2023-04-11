package MessageProject;

public class SmsSender implements IMessage{
    @Override
    public void sendMessage(String msg) {
        System.out.println(msg);
    }
}
