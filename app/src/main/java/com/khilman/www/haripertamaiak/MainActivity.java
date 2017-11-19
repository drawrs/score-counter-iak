package com.khilman.www.haripertamaiak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Deklarasi
    TextView tvSignUp;
    Button btnLogin;
    EditText etEmail;
    EditText etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inisialisasi
        tvSignUp = (TextView) findViewById(R.id.tvSignUp);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        // Berikan event ketika button Login di klik
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aksi yang akan di jalankan
                // Tampung nilai dalam variable
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                // cek apakah email atau password kosong?
                if (email.isEmpty() || password.isEmpty()){
                    // tampilkan pesan toast
                    Toast.makeText(MainActivity.this, "Email & password tidak boleh kosong !", Toast.LENGTH_SHORT).show();
                } else {
                    // Mulai activity Baru
                    startActivity(new Intent(MainActivity.this, CounterActivity.class));

                }


            }
        });
        // Berikan event ketika TextView tvSignUp di klik
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aksi yang akan dilakukan
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });
    }

}
