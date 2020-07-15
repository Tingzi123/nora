package com.example.ausu.myapplication.loginWeb;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ausu.myapplication.MainActivity;
import com.example.ausu.myapplication.Presenter.UserPresenter;
import com.example.ausu.myapplication.R;
import com.example.ausu.myapplication.common.UrlConstats;
import com.example.ausu.myapplication.model.User;
import com.xdw.mvp.pv.PresentView;

import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class loginActivity extends AppCompatActivity {
    private Button btu_login;
    private Button register;

    private EditText Etun;
    private EditText Etpw;

    private CheckBox checkBox;

 /*   private OkHttpClient client = new OkHttpClient();*/
   /* private UserPresenter userPresenter = new UserPresenter(this);
    private PresentView<User> presentView = new PresentView<User>() {
        @Override
        public void onSuccess(User user) {
            //数据传递给下activit


            Toast.makeText(loginActivity.this,"welcome",Toast.LENGTH_LONG).show();
        }
    };*/
//okhttp3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btu_login = findViewById(R.id.button_login);
        register = findViewById(R.id.button_register);
        Etun = findViewById(R.id.text_username);
        Etpw = findViewById(R.id.text_password);
        checkBox = findViewById(R.id.checkbox);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Etpw.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else {
                    Etpw.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        btu_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Etun.getText().toString().isEmpty() || Etpw.getText().toString().isEmpty()){
                    Toast.makeText(loginActivity.this,"名或和密码不能为空",Toast.LENGTH_LONG).show();
                }else {

                    Intent intent = new Intent(loginActivity.this,MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("username",Etun.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);
                }

            }

        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this,registerActivity.class));
            }
        });

    }
}
      /*  userPresenter.onCreate();
        userPresenter.BindPresentView(presentView);*/




 /*   String uname = Etun.getText().toString();
            String upass = Etpw.getText().toString();
            //从接口获取请求ip
                //请求回调主线程更新UI
            Request request = new Request.Builder().url(UrlConstats.URL_LOGIN).build();
            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {

                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {

                }
            });*/








            //
                //startActivity(new Intent(loginActivity.this,MainActivity.class));
               // userPresenter.login(Etun.getText().toString(),Etpw.getText().toString());
       /*     }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this,registerActivity.class));
            }
        });
    }
}*/
