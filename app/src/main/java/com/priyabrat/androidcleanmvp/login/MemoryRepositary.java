package com.priyabrat.androidcleanmvp.login;

/**
 * Created by Priyabrat on 02-04-2017.
 */

public class MemoryRepositary implements LoginRepositary {

    private User user = null;

    @Override
    public User getUser() {
        if(user == null){
            return new User(0,"demo","demo");
        }
        else {
            return user;
        }
    }

    @Override
    public void saveUser(User user) {
        if(user == null){
            user = getUser();
        }
        this.user = user;
    }
}
