package com.academiajedi.androiddveloper.projeto_aula03.views;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.academiajedi.androiddveloper.projeto_aula03.R;

/**
 * Created by alexsoaresdesiqueira on 04/02/17.
 */

public class DialogsActivity extends AppCompatActivity {

    private Button btnOpenDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);

        btnOpenDialog = (Button) findViewById(R.id.btnOpenDialog);
        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder construtor = new AlertDialog.Builder(DialogsActivity.this);
                construtor.setTitle("Titulo");
                construtor.setMessage("Mensagem");
                construtor.setIcon(R.mipmap.ic_launcher);

                construtor.setPositiveButton("Positivo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogsActivity.this, "Positivo", Toast.LENGTH_SHORT).show();
                    }
                });

                construtor.setNegativeButton("Negativo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogsActivity.this, "Negativo", Toast.LENGTH_SHORT).show();
                    }
                });

                construtor.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogsActivity.this, "Neutral", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog alertDialog = construtor.create();
                alertDialog.show();

            }
        });
    }
}
