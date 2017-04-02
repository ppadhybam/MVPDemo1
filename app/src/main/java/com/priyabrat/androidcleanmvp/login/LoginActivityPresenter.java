package com.priyabrat.androidcleanmvp.login;

/**
 * Created by Priyabrat on 02-04-2017.
 */

public class LoginActivityPresenter implements LoginActivityMVP.Presenter {

    private LoginActivityMVP.View loginView;
    private LoginActivityMVP.Model loginModel;

    public LoginActivityPresenter(LoginActivityMVP.Model loginModel){
        this.loginModel = loginModel;
    }

    @Override
    public void setView(LoginActivityMVP.View loginView) {
        this.loginView = loginView;
    }

    @Override
    public void loginButtonClicked() {
        if(loginView!=null){
            if(loginView.getUserName().equalsIgnoreCase("") || loginView.getUserPass().equalsIgnoreCase("")){
                loginView.showInputError();
            }else {
                loginModel.createUser(loginView.getUserName(),loginView.getUserPass());
                loginView.showUserSavedMessage();
            }
        }
    }

    @Override
    public void getCurrentUser() {
        User user = loginModel.getUser();
        if(user!=null) {
            if(loginView!=null){
                loginView.setUserName(user.getFirstName());
                loginView.setUserPass(user.getLastName());
            }
        }else {
            if(loginView!=null){
                loginView.showUserNotAvailable();
            }
        }
    }
}
