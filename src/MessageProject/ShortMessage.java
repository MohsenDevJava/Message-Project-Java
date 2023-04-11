package MessageProject;

public class ShortMessage extends AbstractMessage{

    IMessage sender;

    public ShortMessage(IMessage sender) {
        this.sender = sender;
    }

    @Override
    public void sendMessage(String msg) {
        if (msg.length()<20){
            System.out.println(msg);
        } else{
            System.out.println("this message long for sms");
        }
    }
}
