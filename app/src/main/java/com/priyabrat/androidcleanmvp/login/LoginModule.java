package com.priyabrat.androidcleanmvp.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Priyabrat on 02-04-2017.
 */

@Module
public class LoginModule {

    @Provides
    public LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model loginActivityModel) {
        return new LoginActivityPresenter(loginActivityModel);
    }

    @Provides
    public LoginActivityMVP.Model provideLoginActivityModel(LoginRepositary loginRepositary){
        return new LoginModel(loginRepositary);
    }


    @Provides
    public LoginRepositary provideLoginrepositary(){
        return new MemoryRepositary();
    }
}
