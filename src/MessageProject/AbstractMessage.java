package MessageProject;

public abstract class AbstractMessage implements IMessage {

    public IMessage sender;

    @Override
    public abstract void sendMessage(String msg);
}
