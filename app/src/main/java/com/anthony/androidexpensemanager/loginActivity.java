package com.anthony.androidexpensemanager;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.anthony.androidexpensemanager.Entity.UserData;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class loginActivity extends AppCompatActivity {

    @BindView(R.id.txtEmail) EditText txtEmail;
    @BindView(R.id.txtPassword) EditText txtPassword;
    public int idUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin)
    void btnLoginAction(){
        if(!TextUtils.isEmpty(txtEmail.getText().toString().trim()) && !TextUtils.isEmpty(txtPassword.getText().toString().trim())){
            UserLoginTask userLoginTask=new UserLoginTask(this);
            userLoginTask.execute(txtEmail.getText().toString().trim(),txtPassword.getText().toString().trim());
        }else{
            Toast.makeText(this,"Please fill email and password",Toast.LENGTH_SHORT).show();
        }
//        if(txtEmail.getText().toString().trim().equals("admin@gmail.com") && txtPassword.getText().toString().trim().equals("admin")){
//            Intent movetoMenuActivity=new Intent(loginActivity.this,MenuActivity.class);
//            startActivity(movetoMenuActivity);
//            System.out.println("masuk if");
//        }
//        else{
//            AlertDialog alertDialog=new AlertDialog.Builder(loginActivity.this).create();
//            alertDialog.setTitle("Warning !!!");
//            alertDialog.setMessage("Wrong email or password");
//            alertDialog.show();
//            System.out.println("masuk else");
//        }
    }

    public void openMenuActivity(UserData userData){
        if(null != userData && userData.getStatus()==1 && null != userData.getUser()){
            idUser=userData.getUser().getIdUser();
            Toast.makeText(this,userData.getMessage(),Toast.LENGTH_SHORT).show();
            Intent moveToMenuActivity=new Intent(loginActivity.this,MenuActivity.class);
            moveToMenuActivity.putExtra(Intent.EXTRA_TEXT,idUser);
            this.startActivity(moveToMenuActivity);
            this.finish();
        }
        else{
            Toast.makeText(this,this.getResources().getString(R.string.user_not_approved),Toast.LENGTH_SHORT).show();
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
