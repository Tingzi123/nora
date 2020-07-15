package com.example.ausu.myapplication.loginWeb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ausu.myapplication.MainActivity;
import com.example.ausu.myapplication.Presenter.UserPresenter;
import com.example.ausu.myapplication.R;
import com.example.ausu.myapplication.model.User;
import com.xdw.mvp.pv.PresentView;

public class registerActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btu_register;
    private  Button btu_tourist;

    private EditText reg_username;
    private EditText reg_password;
    private EditText repeate_pwd;

   /* private UserPresenter userPresenter = new UserPresenter(this);
    private PresentView<User> presentView = new PresentView<User>() {
        @Override
        public void onSuccess(User user) {
            startActivity(new Intent(registerActivity.this,loginActivity.class));
        }
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();

       /* userPresenter.onCreate();
        userPresenter.BindPresentView(presentView);*/
    }

    public void initView(){
        btu_register = findViewById(R.id.button_reg);
        btu_tourist = findViewById(R.id.tourist);

        reg_username = findViewById(R.id.text_register_username);
        reg_password = findViewById(R.id.text_registerpassword);
        repeate_pwd = findViewById(R.id.text_registerpassword2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_reg:
                Intent intent = new Intent(registerActivity.this,loginActivity.class);
                startActivity(intent);
              //  startActivity(new Intent(registerActivity.this, MainActivity.class));
               /* if (reg_username.getText().toString().isEmpty() || reg_password.getText().toString().isEmpty()||repeate_pwd.getText().toString().isEmpty()){
                    Toast.makeText(registerActivity.this,"名称或和密码不能为空",Toast.LENGTH_LONG).show();


                }else {
                    if( reg_password.getText().toString().equals(repeate_pwd.getText().toString())) {

                    }
                    Toast.makeText(registerActivity.this,"密码不一致",Toast.LENGTH_LONG).show();
                }*/
             /*   if(reg_password.getText().toString().equals(repeate_pwd.getText().toString())){
                    userPresenter.register(reg_password.getText().toString(),repeate_pwd.getText().toString());

                }*/
               /* userPresenter.register(reg_password.getText().toString(),repeate_pwd.getText().toString());*/

                break;
            case R.id.tourist:
                Toast.makeText(registerActivity.this,"请先注册",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
