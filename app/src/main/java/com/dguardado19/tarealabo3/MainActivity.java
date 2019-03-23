package com.dguardado19.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.dguardado19.tarealabo3.utils.AppConstat;

public class MainActivity extends AppCompatActivity {
    private Button mboton;
    private String username, passw, correo, genero;
    private EditText user, password, email, gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mboton = findViewById(R.id.BotonPasar);
        user =findViewById(R.id.Usertext);
        password = findViewById(R.id.PasswordText);
        email = findViewById(R.id.EmailText);
        gender = findViewById(R.id.GenderText);


        mboton.setOnClickListener(v->{
            username= user.getText().toString();
            passw = password.getText().toString();
            correo = email.getText().toString();
            genero = gender.getText().toString();

            Bundle todo = new Bundle();
            todo.putString(AppConstat.USER_KEY,username);
            todo.putString(AppConstat.PASS_KEY, passw);
            todo.putString(AppConstat.EMAIL_KEY, correo);
            todo.putString(AppConstat.GENDER_KEY, genero);

            Intent mIntent = new Intent(MainActivity.this,Share.class);
            mIntent.putExtras(todo);
            startActivity(mIntent);
        });
    }
}
