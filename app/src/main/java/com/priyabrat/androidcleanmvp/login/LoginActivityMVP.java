package com.priyabrat.androidcleanmvp.login;

/**
 * Created by Priyabrat on 02-04-2017.
 */

public interface LoginActivityMVP {

   interface Model {
       void createUser(String userName,String userPass);
       User getUser();
    }

    interface View {
        String getUserName();
        String getUserPass();

        void setUserName(String userName);
        void setUserPass(String userPass);

        void showUserNotAvailable();
        void showInputError();
        void showUserSavedMessage();
    }

    interface Presenter {
        void setView(LoginActivityMVP.View loginView);
        void loginButtonClicked();
        void getCurrentUser();
    }
}
