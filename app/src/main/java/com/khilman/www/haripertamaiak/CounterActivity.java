package com.khilman.www.haripertamaiak;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CounterActivity extends AppCompatActivity {
    // Deklarasi
    Button btn_add_score_a, btn_add_score_b;
    TextView score_a, score_b;
    TextView team_a, team_b;
    @BindView(R.id.btn_finish)
    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        ButterKnife.bind(this);
        // Inisialisasi
        btn_add_score_a = (Button) findViewById(R.id.btn_add_score_a);
        btn_add_score_b = (Button) findViewById(R.id.btn_add_score_b);

        score_a = (TextView) findViewById(R.id.score_a);
        score_b = (TextView) findViewById(R.id.score_b);

        team_a = (TextView) findViewById(R.id.team_a);
        team_b = (TextView) findViewById(R.id.team_b);

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
                //http://bit.ly/2hBEHnx
                // idnmantab
            }
        });
    }

    public void setTeamAName(final View view) {
        // Siapkan layout inflater
        LayoutInflater inflater = getLayoutInflater();
        final View viewAlert = inflater.inflate(R.layout.edit_nama_tim_layout, null);

        // Buat aler dialog
        AlertDialog.Builder alert = new AlertDialog.Builder(CounterActivity.this);

        // Set tampilan Alert dialog
        alert.setView(viewAlert);
        // inisalisais & deklarasi
        final EditText etNama = (EditText) viewAlert.findViewById(R.id.etTeamName);
        // Set value ke Edit Text
        etNama.setText(team_a.getText().toString());

        // Atur judul alert nya
        alert.setTitle("PhoenUbah nama Tim");
        // Atur pesan yang akan di tampulkana
        //alert.setMessage("Disini nanti ada edi text");
        // tambahkan tombol positive
        alert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Tampilkan toast
                Toast.makeText(CounterActivity.this,
                        "Potitive button di pilih",
                        Toast.LENGTH_SHORT).show();

                // dapatkan nama Team
                String namaTeamBaru = etNama.getText().toString();
                // set nama baru ke nama tim A
                team_a.setText(namaTeamBaru);

            }
        });
        // Tambahkan tombol negative
        alert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Tampilkan toast
                Toast.makeText(CounterActivity.this,
                        "Negative button di pilih",
                        Toast.LENGTH_SHORT).show();
            }
        });
        // tmabahkan netural button
//        alert.setNeutralButton("Batal", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        });
        // Tampilkan Alert
        alert.show();

    }

    public void setTeamBName(View view) {
        // Siapkan layout inflater
        LayoutInflater inflater = getLayoutInflater();
        final View viewAlert = inflater.inflate(R.layout.edit_nama_tim_layout, null);

        // Buat aler dialog
        AlertDialog.Builder alert = new AlertDialog.Builder(CounterActivity.this);

        // Set tampilan Alert dialog
        alert.setView(viewAlert);
        // inisalisais & deklarasi
        final EditText etNama = (EditText) viewAlert.findViewById(R.id.etTeamName);
        // Set value ke Edit Text
        etNama.setText(team_b.getText().toString());

        // Atur judul alert nya
        alert.setTitle("PhoenUbah nama Tim");
        // Atur pesan yang akan di tampulkana
        //alert.setMessage("Disini nanti ada edi text");
        // tambahkan tombol positive
        alert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Tampilkan toast
                Toast.makeText(CounterActivity.this,
                        "Potitive button di pilih",
                        Toast.LENGTH_SHORT).show();

                // dapatkan nama Team
                String namaTeamBaru = etNama.getText().toString();
                // set nama baru ke nama tim A
                team_b.setText(namaTeamBaru);

            }
        });
        // Tambahkan tombol negative
        alert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Tampilkan toast
                Toast.makeText(CounterActivity.this,
                        "Negative button di pilih",
                        Toast.LENGTH_SHORT).show();
            }
        });
        // tmabahkan netural button
//        alert.setNeutralButton("Batal", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        });
        // Tampilkan Alert
        alert.show();
    }

    @OnClick(R.id.btn_finish)
    public void onViewClicked() {

        Intent intent = new Intent(this, ResultActivity.class);
        //sispkan data ke class Intent
        intent.putExtra("nm_a", team_a.getText().toString());
        intent.putExtra("nm_b", team_b.getText().toString());

        intent.putExtra("sc_a", score_a.getText().toString());
        intent.putExtra("sc_b", score_b.getText().toString());

        // mulai activity
        // dngan membawa data oleh intent
        startActivity(intent);
    }
}
