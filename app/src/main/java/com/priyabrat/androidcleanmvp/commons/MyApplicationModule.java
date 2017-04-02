package com.priyabrat.androidcleanmvp.commons;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Priyabrat on 02-04-2017.
 */

@Module
public class MyApplicationModule {

    private MyApplications myApplications;

    public MyApplicationModule(MyApplications myApplications){
        this.myApplications = myApplications;
    }

    @Provides
    @Singleton
    public MyApplications provideMyApplication(){
        return myApplications;
    }

    @Provides
    @Singleton
    public Application provideApplication(){
        return myApplications;
    }
}
