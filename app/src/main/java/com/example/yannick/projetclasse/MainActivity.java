package com.example.yannick.projetclasse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button ciseaux;
    private Button papier;
    private Button pierre;
    private TextView res;
    private TextView ordi;
    private String random;
    private TextView resultat;
    private String rep;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ciseaux = (Button) findViewById(R.id.button);
        papier = (Button) findViewById(R.id.button2);
        pierre = (Button) findViewById(R.id.button3);
        res = (TextView) findViewById(R.id.textview4);
        ordi = (TextView) findViewById(R.id.textView6);
        resultat = (TextView) findViewById(R.id.textView8);

    }

    @Override
    protected void onStart() {
        super.onStart();


        ciseaux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res.setText("Ciseaux");
                Random choix = new Random();
                int a = choix.nextInt(3);
                if (a == 1) {
                    rep = "Ciseaux";
                } else {
                    if (a == 2)
                        rep = "Pierre";
                    else
                        rep = "Papier";
                }
                ordi.setText(rep);
                if (rep == "Ciseaux") {
                    random = "Egalité";
                } else {
                    if (rep == "Pierre")
                        random = " L'ordinateur à gagné";
                    else
                        random = "Le joueur à gagné";

                }
                resultat.setText(random);

            }
        });
        pierre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("Pierre");
                Random choix = new Random();
                int a = choix.nextInt(3);
                if (a == 1) {
                    rep = "Ciseaux";
                } else {
                    if (a == 2)
                        rep = "Pierre";
                    else
                        rep = "Papier";
                }
                ordi.setText(rep);
                if (rep == "Pierre") {
                    random = "Egalité";
                } else {
                    if (rep == "Papier")
                        random = " L'ordinateur à gagné";
                    else
                        random = "Le joueur à gagné";

                }
                resultat.setText(random);


            }
        });
        papier.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          res.setText("Papier");
                                          Random choix = new Random();
                                          int a = choix.nextInt(3);
                                          if (a == 1) {
                                              rep = "Ciseaux";
                                          } else {
                                              if (a == 2)
                                                  rep = "Pierre";
                                              else
                                                  rep = "Papier";
                                          }
                                          ordi.setText(rep);
                                          if (rep == "Papier") {
                                              random = "Égalité";
                                          } else {
                                              if (rep == "Ciseaux")
                                                  random = " L'ordinateur à gagné";
                                              else
                                                  random = "Le joueur à gagné";
                                          }
                                          resultat.setText(random);
                                      }
                                  }

        );


    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
