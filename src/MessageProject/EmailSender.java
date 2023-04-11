package MessageProject;

public class EmailSender implements IMessage{
    @Override
    public void sendMessage(String msg) {
        System.out.println(msg);
    }
}
