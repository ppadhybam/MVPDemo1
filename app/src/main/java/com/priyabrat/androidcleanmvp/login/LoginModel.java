package com.priyabrat.androidcleanmvp.login;

/**
 * Created by Priyabrat on 02-04-2017.
 */

public class LoginModel implements LoginActivityMVP.Model {

    LoginRepositary loginRepositary;

    public LoginModel(LoginRepositary loginRepositary){
        this.loginRepositary = loginRepositary;
    }

    @Override
    public void createUser(String userName, String userPass) {
        loginRepositary.saveUser(new User(userName,userPass));
    }

    @Override
    public User getUser() {
        return loginRepositary.getUser();
    }
}
