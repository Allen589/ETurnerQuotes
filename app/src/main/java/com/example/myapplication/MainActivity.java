package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonTap(View v) {
        Quotes evanTurner = new Quotes();
        evanTurner.addQuote("They have like 12 new guys every time I see them.");
        evanTurner.addQuote("Any intramural teams at Harvard need a quarterback? I might stop by and join a team. I only throw spirals.");
        evanTurner.addQuote("I been on the toilet all night, my butt crack feels like it has sun burn #pause. I'm so annoyed.");
        evanTurner.addQuote("Well I’ll be damned. Dirk got himself a sister.");
        evanTurner.addQuote("I threw away my LeBron poster in high school, so I don’t care how much he played tonight.");
        evanTurner.addQuote("Its funny how people wanna bother me on vday instead of being with girls! Lol wowwww");
        evanTurner.addQuote("I’m married to guap. Taken.");
        evanTurner.addQuote("If your cat dies of hunger it will still have 8 lives ... So yeah cop the tee ASAP rocky");
        evanTurner.addQuote("You've gotta respect a 15-percent 3-point shooter. A guy like that is always lethal.");
        evanTurner.addQuote("People will say it's for Kobe, but deep down it's probably for me.");
        evanTurner.addQuote("50 Shades of Grey is coming out, so I might catch that.");
        evanTurner.addQuote("Lol Muck Fichigan");
        Toast myToast = Toast.makeText(getApplicationContext(), evanTurner.getQuote(), Toast.LENGTH_LONG);
        myToast.show();
    }


}
