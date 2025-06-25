package OOP;

import OOP.SmsSenderService.BaseCommunication;
import OOP.SmsSenderService.EmailSender;

public class Main {
    public static void main(String[] args) {
        User user = new User(); // yeni user nesnesi olusturmak icin new kullanilir
        user.setId(1);
        user.setFullName("Ahmet OzTurk");
        user.setAge(21);
        user.setUserName("ahmetozturk");
        user.setPassword("586pasword");

        //usermanager nesnesi olusturalim
        BaseCommunication baseCommunication = new EmailSender();
        UserManager userManager = new UserManager(baseCommunication); //polymorphism

        userManager.addUser(user);
        userManager.updateUser(user);
        userManager.sendMessage("We have new content in java check it out..."); // calling the method
    }
}
