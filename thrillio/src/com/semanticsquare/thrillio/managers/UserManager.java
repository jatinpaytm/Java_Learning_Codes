// Manager classes manages the code , it can also be named as Service Classes
// we are implementing singleton class
// In OOPs, a singleton class is a class that can have only one object (an instance of the class) at a time.
package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.dao.UserDao;
import com.semanticsquare.thrillio.entities.User;

public class UserManager {
    //the below code is for singleton class
    //-------------------------------------------------------------------
    private static UserManager instance = new UserManager();
    private static UserDao dao = new UserDao(); // for database
    private UserManager(){}

    public static UserManager getInstance(){
        return instance;
    }

    //---------------------------------------------------------------------

    public User createUser(long id,String email,String password,String firstName,String lastName,int gender,String userType){
        User user=new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setUserType(userType);

        return user;
    }

    public User[] getUsers(){
        return dao.getUsers();
    }
}
