package com.khilman.www.haripertamaiak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.winner_team)
    TextView winnerTeam;
    @BindView(R.id.team_a)
    TextView teamA;
    @BindView(R.id.team_b)
    TextView teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        String team_a = getIntent().getStringExtra("nm_a");
        String team_b = getIntent().getStringExtra("nm_b");

        String score_a = getIntent().getStringExtra("sc_a");
        String score_b = getIntent().getStringExtra("sc_b");

        // cek pemenang
        if (Integer.parseInt(score_a) > Integer.parseInt(score_b)){
            // Jika score A lebih besar dari score B
            winnerTeam.setText(team_a);
        } else if (Integer.parseInt(score_a) < Integer.parseInt(score_b)){
            // Jika score A lebih kecil dari score B
            winnerTeam.setText(team_b);
        } else {
            winnerTeam.setText("DRAW");
        }
        // set hasil score ke TextView
        teamA.setText(team_a + " : " + score_a);
        teamB.setText(team_b + " : " + score_b);

    }
}
