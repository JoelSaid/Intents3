package com.example.intents3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EnviarMensaje (View view){
        Intent enviar = new Intent(this, Message.class );
        final EditText etSaludo = findViewById(R.id.etSaludo);
        String mensaje = etSaludo.getText().toString();
        enviar.putExtra(EXTRA_MESSAGE, mensaje);
        startActivity(enviar);
    }

    public void Llamar(View view) {
        Intent llamar = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:2311311164"));
        startActivity(llamar);
    }
    public void IniciarWhatsApp(View view) {
        Intent sendIntent = new Intent("com.whatsapp");
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Saludos");
        sendIntent.setType("test/pain");
        startActivity(sendIntent);
    }
}