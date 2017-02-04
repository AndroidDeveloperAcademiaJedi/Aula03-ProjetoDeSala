package com.academiajedi.androiddveloper.projeto_aula03.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.academiajedi.androiddveloper.projeto_aula03.models.Pessoa;
import com.academiajedi.androiddveloper.projeto_aula03.fragments.PessoaFragment;
import com.academiajedi.androiddveloper.projeto_aula03.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexsoaresdesiqueira on 04/02/17.
 */

public class RecycleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pessoas);

        PessoaFragment fragment = (PessoaFragment) getSupportFragmentManager().findFragmentByTag("mainFrag");
        if (fragment == null) {
            fragment = new PessoaFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.rl_fragment_pessoa, fragment, "mainFrag");
            ft.commit();
        }
    }


    public List<Pessoa> getListPessoa(){
        List<Pessoa> list = new ArrayList<>();
        for (int i=0; i < 20; i++) {
            Pessoa pessoa = new Pessoa("Pessoa "+i, 20+i, "Masculino");
            list.add(pessoa);
        }

        return list;
    }
}
