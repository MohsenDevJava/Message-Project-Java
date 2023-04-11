package MessageProject;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Message: ");
        String message=reader.nextLine();
        System.out.print("Type message Email 1 | Sms 2 :");
        int type=reader.nextInt();

        if (type==1){
            EmailSender email = new EmailSender();
            LongMessage longMessage = new LongMessage(email);
            longMessage.sendMessage(message);
        } else if (type==2) {
            SmsSender sms= new SmsSender();
            ShortMessage shortMessage = new ShortMessage(sms);
            shortMessage.sendMessage(message);
        }
    }
}
