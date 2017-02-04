package com.academiajedi.androiddveloper.projeto_aula03.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.academiajedi.androiddveloper.projeto_aula03.R;

/**
 * Created by alexsoaresdesiqueira on 04/02/17.
 */

public class ToolBarActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbars);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Jedi");
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.menu_contatos:
                Toast.makeText(ToolBarActivity.this, "contatos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_mensagem:
                Toast.makeText(ToolBarActivity.this, "mensagem", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_configuracao:
                Toast.makeText(ToolBarActivity.this, "configurações", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_search:
                Toast.makeText(ToolBarActivity.this, "search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_adicionar:
                Toast.makeText(ToolBarActivity.this, "adicionar", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);

    }

}
