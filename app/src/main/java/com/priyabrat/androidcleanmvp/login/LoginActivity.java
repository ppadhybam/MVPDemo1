package com.priyabrat.androidcleanmvp.login;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.priyabrat.androidcleanmvp.R;
import com.priyabrat.androidcleanmvp.commons.MyApplications;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View{

    @Inject
    LoginActivityMVP.Presenter presenter;
    EditText editTextUserName,editTextUserPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        MyApplications.getComponent(this).inject(LoginActivity.this);
        editTextUserName = (EditText) findViewById(R.id.editTextUserName);
        editTextUserPass = (EditText) findViewById(R.id.editTextUserPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginButtonClicked();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getUserName() {
        return editTextUserName.getText().toString().trim();
    }

    @Override
    public String getUserPass() {
        return editTextUserPass.getText().toString().trim();
    }

    @Override
    public void setUserName(String userName) {
        editTextUserName.setText(userName);
    }

    @Override
    public void setUserPass(String userPass) {
        editTextUserPass.setText(userPass);
    }


    @Override
    public void showUserNotAvailable() {
        Toast.makeText(this, "showUserNotAvailable", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "showInputError", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserSavedMessage() {
        Toast.makeText(this, "showUserSavedMessage", Toast.LENGTH_SHORT).show();
    }
}
