package com.priyabrat.androidcleanmvp.commons;

import com.priyabrat.androidcleanmvp.login.LoginActivity;
import com.priyabrat.androidcleanmvp.login.LoginModule;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by Priyabrat on 02-04-2017.
 */
@Singleton
@Component(
        modules = {
                MyApplicationModule.class,
                LoginModule.class
        }
)
public interface MyApplicationComponents {

    void inject(LoginActivity loginActivity);
}
