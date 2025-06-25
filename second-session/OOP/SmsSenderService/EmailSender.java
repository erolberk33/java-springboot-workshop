package OOP.SmsSenderService;

public class EmailSender extends BaseCommunication {

    @Override
    public void sendMessage(String message){
        System.out.println("Email message: "+message);
    };
}
