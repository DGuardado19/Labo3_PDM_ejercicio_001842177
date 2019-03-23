package com.dguardado19.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.dguardado19.tarealabo3.utils.AppConstat;

public class Share extends AppCompatActivity {
    private TextView usuario, contra, correo, genero;
    private String enviando;
    private Button compartir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        usuario = findViewById(R.id.Userview);
        contra = findViewById(R.id.Passview);
        correo = findViewById(R.id.Emailview);
        genero = findViewById(R.id.Genderview);
        compartir =findViewById(R.id.BotonShare);


        Intent mIntent = getIntent();

        if (mIntent!=null) {
            usuario.setText(mIntent.getStringExtra(AppConstat.USER_KEY));
            contra.setText(mIntent.getStringExtra(AppConstat.PASS_KEY));
            correo.setText(mIntent.getStringExtra(AppConstat.EMAIL_KEY));
            genero.setText(mIntent.getStringExtra(AppConstat.GENDER_KEY));
        }
        compartir.setOnClickListener(v->{

            Intent xIntent = new Intent();
            xIntent.setAction(Intent.ACTION_SEND);
            xIntent.setType("text/plain");
            xIntent.putExtra(Intent.EXTRA_TEXT, usuario.getText().toString()+ "\n"+ contra.getText().toString()+ "\n"+ correo.getText().toString()+ "\n"+ genero.getText().toString());
            startActivity(xIntent);
        });
    }
}
