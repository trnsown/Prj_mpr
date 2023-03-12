package edu.hanu.a1_1901040179;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mePlay;
    private  ScrollView current;
    private  TextView currentText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Media play

        findViewById(R.id.hira_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.a);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.a);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_i).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.i);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_i).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.i);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_u).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.u);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_u).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.u);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_e).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.e);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_e).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.e);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_o).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.o);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_o).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.o);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ka).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ka);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ka).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ka);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });


        findViewById(R.id.hira_ki).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ki);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ki).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ki);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ku).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ku);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ku).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ku);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });


        findViewById(R.id.hira_ke).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ke);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ke).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ke);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ko).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ko);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ko).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ko);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_sa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.sa);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_sa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.sa);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_shi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.shi);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_shi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.shi);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_su).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.su);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_su).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.su);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_se).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.se);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_se).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.se);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_so).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.so);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_so).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.so);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ta);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ta);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_chi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.chi);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_chi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.chi);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_tsu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_tsu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_te).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.te);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_te).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.te);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_to).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.to);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_to).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.to);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_na).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.na);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_na).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.na);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ni).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ni);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ni).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ni);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_nu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.nu);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_nu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.nu);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ne);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ne);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_no).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.no);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_no).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.no);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ha);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ha);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_hi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.hi);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_hi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.hi);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_fu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.fu);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_fu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.fu);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_he).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.he);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_he).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.he);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ho).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ho);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ho).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ho);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ma).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ma);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ma).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ma);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_mi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.mi);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_mi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.mi);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_mu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.mu);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_mu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.mu);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_me).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.me);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_me).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.me);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_mo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.mo);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_mo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.mo);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ya).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ya);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ya).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ya);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_yu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.yu);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_yu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.yu);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_yo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.yo);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_yo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.yo);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ra).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ra);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ra).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ra);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ri).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ri);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ri).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ri);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ru).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ru);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ru).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ru);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_re).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.re);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_re).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.re);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_ro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ro);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_ro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.ro);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_wa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.wa);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_wa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.wa);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.hira_wo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.wo);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });

        findViewById(R.id.kata_wo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mePlay = MediaPlayer.create(MainActivity.this, R.raw.wo);
                mePlay.seekTo(0);
                mePlay.start();
            }
        });



        // Change view
        ScrollView hiraTab = findViewById(R.id.hiraTab);
        ScrollView kataTab = findViewById(R.id.kataTab);
        TextView HiraText = findViewById(R.id.HiraText);
        TextView KataText = findViewById(R.id.KataText);


        current = kataTab;
        currentText = KataText;

        Button hiraBtn = findViewById(R.id.hiraBtn);
        Button kataBtn = findViewById(R.id.kataBtn);

        hiraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hiraTab.animate().alpha(1f).setDuration(2000);
                kataTab.animate().alpha(0f).setDuration(2000);
                hiraTab.setVisibility(View.VISIBLE);
                kataTab.setVisibility(View.INVISIBLE);

                HiraText.animate().alpha(1f).setDuration(2000);
                KataText.animate().alpha(0f).setDuration(2000);

                hiraBtn.setBackgroundColor(hiraBtn.getContext().getResources().getColor(R.color.lightblue));
                kataBtn.setBackgroundColor(kataBtn.getContext().getResources().getColor(R.color.white));

                current = hiraTab;
                currentText = HiraText;
            }
        });

        kataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hiraTab.animate().alpha(0f).setDuration(2000);
                kataTab.animate().alpha(1f).setDuration(2000);
                hiraTab.setVisibility(View.INVISIBLE);
                kataTab.setVisibility(View.VISIBLE);

                kataBtn.setBackgroundColor(kataBtn.getContext().getResources().getColor(R.color.lightblue));
                hiraBtn.setBackgroundColor(hiraBtn.getContext().getResources().getColor(R.color.white));

                HiraText.animate().alpha(0f).setDuration(2000);
                KataText.animate().alpha(1f).setDuration(2000);

                current = kataTab;
                currentText = KataText;
            }
        });
    }
}