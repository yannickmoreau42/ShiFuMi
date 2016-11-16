package com.example.yannick.projetclasse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int var_a = 0;
    public int var_b = 0;
    private Button ciseaux;
    private Button papier;
    private Button pierre;
    private Button stat;
    private TextView res;
    private TextView ordi;
    private TextView resultat;
    private String random;
    private String rep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ciseaux = (Button) findViewById(R.id.btn_ciseaux);
        papier = (Button) findViewById(R.id.btn_papier);
        pierre = (Button) findViewById(R.id.btn_pierre);
        stat = (Button) findViewById(R.id.btn_résultats);

        res = (TextView) findViewById(R.id.tv_joueur_1);
        ordi = (TextView) findViewById(R.id.tv_joueur_2);
        resultat = (TextView) findViewById(R.id.tv_résultat);
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
                        var_a=var_a+1;

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

        stat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("var_a", var_a);
                startActivity(intent);
                //startActivity(new Intent(MainActivity.this, SecondActivity.class));

            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
