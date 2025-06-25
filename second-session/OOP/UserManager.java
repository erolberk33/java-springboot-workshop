package OOP;

import OOP.SmsSenderService.BaseCommunication;

public class UserManager {

    // dependency injection
    private final BaseCommunication baseCommunication;

    public UserManager(BaseCommunication baseCommunication) {
        this.baseCommunication = baseCommunication;
    }

    public String addUser(User user){
        return "user added: "+user.getFullName();
    }

    //overload - uzerine yazma
    public String addUser(long id,String name,String lastName,String userName,String password){
        //yanlis kullanim SOLID....
        return "user updated: "+name+lastName;
    }

    public String updateUser(User user){
        return "user updated: "+user.getFullName();
    }
    public String getUserWithName(String name){
        return "getting user with name: "+name;
    }
    public String deleteUser(User user){
        return "user deleted: "+user.getFullName();
    }

    public void sendMessage(String message){
        baseCommunication.sendMessage(message);
    }
}
