package OOP.SmsSenderService;

public class WhatsAppSmsSender extends BaseCommunication {

    @Override
    public void sendMessage(String message){
        System.out.println("WhatsApp message: "+message);
    };
}
