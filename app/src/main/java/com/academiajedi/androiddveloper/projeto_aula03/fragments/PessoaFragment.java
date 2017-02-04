package com.academiajedi.androiddveloper.projeto_aula03.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.academiajedi.androiddveloper.projeto_aula03.R;
import com.academiajedi.androiddveloper.projeto_aula03.interfaces.RecycleViewOnClickHack;
import com.academiajedi.androiddveloper.projeto_aula03.adapters.PessoaAdapter;
import com.academiajedi.androiddveloper.projeto_aula03.models.Pessoa;
import com.academiajedi.androiddveloper.projeto_aula03.views.RecycleViewActivity;

import java.util.List;

/**
 * Created by alexsoaresdesiqueira on 04/02/17.
 */

public class PessoaFragment extends Fragment implements RecycleViewOnClickHack {
    private RecyclerView recyclerView;
    private List<Pessoa> pessoaList;
    private PessoaAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pessoa, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_list_pessoas);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        pessoaList = ((RecycleViewActivity) getActivity()).getListPessoa();
        adapter = new PessoaAdapter(pessoaList, getActivity());
        adapter.setRecycleViewOnClickListenerHack(this);
        recyclerView.setAdapter(adapter);


        return view;
    }

    @Override
    public void onClickListener(int position) {
        Toast.makeText(getActivity(), "Position: "+position, Toast.LENGTH_SHORT).show();
        adapter.removerPessoa(position);
    }
}
