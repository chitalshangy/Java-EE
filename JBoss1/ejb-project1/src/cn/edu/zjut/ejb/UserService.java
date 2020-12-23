package cn.edu.zjut.ejb;

import javax.ejb.Stateless;
import java.io.Serializable;

@Stateless
public class UserService implements UserServiceRemote, Serializable {
    public UserService() { }
    public boolean login(String username, String password){
        if(username.equals("zjut")&&password.equals("zjut")){
            return true;
        }else
            return false;
    }
}
