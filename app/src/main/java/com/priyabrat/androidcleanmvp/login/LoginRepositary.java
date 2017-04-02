package com.priyabrat.androidcleanmvp.login;

/**
 * Created by Priyabrat on 02-04-2017.
 */

public interface LoginRepositary {

    User getUser();

    void saveUser(User user);
}
