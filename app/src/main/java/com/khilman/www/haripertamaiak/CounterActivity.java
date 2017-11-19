package com.khilman.www.haripertamaiak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {
    // Deklarasi
    Button btn_add_score_a, btn_add_score_b;
    TextView score_a, score_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        // Inisialisasi
        btn_add_score_a = (Button) findViewById(R.id.btn_add_score_a);
        btn_add_score_b = (Button) findViewById(R.id.btn_add_score_b);

        score_a = (TextView) findViewById(R.id.score_a);
        score_b = (TextView) findViewById(R.id.score_b);

        // Beri event onClick pada Button A
        btn_add_score_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aksi
                // Dapatkan nilai score lalu tampung dalam variable
                String nilai_score_a = score_a.getText().toString();

                // Jumlahkan nilai yg telah didapat
                Integer nilai_score_baru = Integer.parseInt(nilai_score_a) + 1;

                // Set nilai baru ke text view
                score_a.setText(nilai_score_baru.toString());


            }
        });
        // Beri event onClick pada Button B
        btn_add_score_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aksi#
                // Dapatkan nilai score lalu tampung dalam variable
                String nilai_score_b = score_b.getText().toString();

                // Jumlahkan nilai yg telah didapat
                Integer nilai_score_baru = Integer.parseInt(nilai_score_b) + 1;

                // Set nilai baru ke text view
                score_b.setText(nilai_score_baru.toString());

            }
        });
    }
}
