package com.academiajedi.androiddveloper.projeto_aula03.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.academiajedi.androiddveloper.projeto_aula03.R;

/**
 * Created by alexsoaresdesiqueira on 04/02/17.
 */

public class SnackBarActivity extends AppCompatActivity {

    private Button btnSnackbar;
    private Snackbar snackbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);

        btnSnackbar = (Button) findViewById(R.id.btnSnackbar);
        btnSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                snackbar = Snackbar.make(v, "Meu Snack", Snackbar.LENGTH_SHORT);
                snackbar.show();

                snackbar.setAction("CLIQUE AQUI", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SnackBarActivity.this, "Clicou", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
    }
}
