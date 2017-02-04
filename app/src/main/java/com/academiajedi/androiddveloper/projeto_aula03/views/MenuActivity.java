package com.academiajedi.androiddveloper.projeto_aula03.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.academiajedi.androiddveloper.projeto_aula03.R;

/**
 * Created by alexsoaresdesiqueira on 04/02/17.
 */

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.menu_configuracao:
                Toast.makeText(MenuActivity.this, "Clicou no menu configurações", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_contatos:
                Toast.makeText(MenuActivity.this, "Clicou no menu contatos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_mensagem:
                Toast.makeText(MenuActivity.this, "Clicou no menu mensagens", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
