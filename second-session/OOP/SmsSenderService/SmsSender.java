package OOP.SmsSenderService;

public class SmsSender extends BaseCommunication {

    @Override
    public void sendMessage(String message){
        System.out.println("Sms message: "+message);
    };
}
