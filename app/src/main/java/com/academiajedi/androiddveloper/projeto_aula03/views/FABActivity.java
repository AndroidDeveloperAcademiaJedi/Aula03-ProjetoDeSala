package com.academiajedi.androiddveloper.projeto_aula03.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.academiajedi.androiddveloper.projeto_aula03.R;

/**
 * Created by alexsoaresdesiqueira on 04/02/17.
 */

public class FABActivity extends AppCompatActivity {

    private FloatingActionButton floataction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actviity_float_action_button);

        floataction = (FloatingActionButton) findViewById(R.id.floataction);
        floataction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Clicou no FloatActionButton", Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
