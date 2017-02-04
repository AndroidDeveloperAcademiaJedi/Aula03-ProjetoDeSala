package com.academiajedi.androiddveloper.projeto_aula03.views;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.academiajedi.androiddveloper.projeto_aula03.R;

/**
 * Created by alexsoaresdesiqueira on 04/02/17.
 */

public class BottomNavigationActivity extends AppCompatActivity {

    private BottomNavigationView bottombar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_view);

        bottombar = (BottomNavigationView) findViewById(R.id.bottombar);
        bottombar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_calendario:
                        Toast.makeText(BottomNavigationActivity.this, "Action calendario", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_mensagem:
                        Toast.makeText(BottomNavigationActivity.this, "Action mensagem", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_configuracao:
                        Toast.makeText(BottomNavigationActivity.this, "Action configuracao", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

    }
}
