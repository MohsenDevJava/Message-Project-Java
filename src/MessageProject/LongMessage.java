package MessageProject;

public class LongMessage extends AbstractMessage{

    IMessage sender;

    public LongMessage(IMessage sender) {
        this.sender = sender;
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(msg);
    }
}
