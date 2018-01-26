package com.anthony.androidexpensemanager;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class loginActivity extends AppCompatActivity {

    @BindView(R.id.txtEmail) EditText txtEmail;
    @BindView(R.id.txtPassword) EditText txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin)
    void btnLoginAction(){
        if(txtEmail.getText().toString().trim().equals("admin@gmail.com") && txtPassword.getText().toString().trim().equals("admin")){
            Intent movetoMenuActivity=new Intent(loginActivity.this,MenuActivity.class);
            startActivity(movetoMenuActivity);
            System.out.println("masuk if");
        }
        else{
            AlertDialog alertDialog=new AlertDialog.Builder(loginActivity.this).create();
            alertDialog.setTitle("Warning !!!");
            alertDialog.setMessage("Wrong email or password");
            alertDialog.show();
            System.out.println("masuk else");
        }
    }

    @OnClick(R.id.btnRegister)
    void btnRegisterAction(){
        Intent moveToRegisterActivity=new Intent(loginActivity.this,RegisterActivity.class);
        startActivity(moveToRegisterActivity);
    }
    @OnClick(R.id.txtForgotPassword)
    void txtForgotPasswordAction(){
        System.out.println("txtForgotPasswordAction");
    }
}
