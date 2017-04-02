package com.priyabrat.androidcleanmvp.commons;

import android.app.Application;
import android.content.Context;

import com.priyabrat.androidcleanmvp.login.LoginModule;

/**
 * Created by Priyabrat on 02-04-2017.
 */

public class MyApplications extends Application {

    MyApplicationComponents myApplicationComponents;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplicationComponents = DaggerMyApplicationComponents.builder()
                .myApplicationModule(new MyApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public static MyApplicationComponents getComponent(Context context){
        return ((MyApplications)context.getApplicationContext()).myApplicationComponents;
    }
}
