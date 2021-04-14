package com.example.android.product;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText un;
    private EditText pw;
    private Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        un = (EditText) findViewById(R.id.txtUN);
        pw = (EditText) findViewById(R.id.txtPW);
        log = (Button) findViewById(R.id.btnLog);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String UN = un.getText().toString().trim();
                String PW = pw.getText().toString().trim();
                if (UN.equals("tester") && PW.equals("1234")) {
                    Intent intent = new Intent(LoginActivity.this, CatalogActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, R.string.login_fail_message, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}