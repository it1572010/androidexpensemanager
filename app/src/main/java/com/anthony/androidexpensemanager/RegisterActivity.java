package com.anthony.androidexpensemanager;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.txtName) EditText txtName;
    @BindView(R.id.txtEmail) EditText txtEmail;
    @BindView(R.id.txtPassword) EditText txtPassword;
    @BindView(R.id.txtRePassword) EditText txtRePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnRegister)
    void btnRegisterAction(){
        if(txtName.getText().toString().trim().isEmpty() || txtEmail.getText().toString().trim().isEmpty() ||
                txtPassword.getText().toString().trim().isEmpty() || txtRePassword.getText().toString().trim().isEmpty()){
            AlertDialog alertDialog=new AlertDialog.Builder(RegisterActivity.this).create();
            alertDialog.setTitle("Warning !!!");
            alertDialog.setMessage("Any field need be filled");
            alertDialog.show();
        }
        else if(!txtPassword.getText().toString().trim().equals(txtRePassword.getText().toString().trim())){
            AlertDialog alertDialog=new AlertDialog.Builder(RegisterActivity.this).create();
            alertDialog.setTitle("Warning !!!");
            alertDialog.setMessage("Password and RePassword must same");
            alertDialog.show();
        }
        else{
            new AlertDialog.Builder(RegisterActivity.this).setTitle("Confirmation !!!")
                    .setMessage("Are you sure want to register?")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent moveToLoginActivity=new Intent(RegisterActivity.this,loginActivity.class);startActivity(moveToLoginActivity);
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).show();
        }
    }
}
