package com.academiajedi.androiddveloper.projeto_aula03.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.academiajedi.androiddveloper.projeto_aula03.R;
import com.academiajedi.androiddveloper.projeto_aula03.interfaces.RecycleViewOnClickHack;
import com.academiajedi.androiddveloper.projeto_aula03.models.Pessoa;

import java.util.List;

/**
 * Created by alexsoaresdesiqueira on 04/02/17.
 */

public class PessoaAdapter extends RecyclerView.Adapter<PessoaAdapter.MyViewHolder> {

    private List<Pessoa> pessoaList;
    private LayoutInflater layoutInflater;
    private RecycleViewOnClickHack recycleViewOnClickHack;

    public PessoaAdapter(List<Pessoa> pessoaList, Context context) {
        this.pessoaList = pessoaList;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setRecycleViewOnClickListenerHack(RecycleViewOnClickHack recycleViewOnClickHack){
        this.recycleViewOnClickHack = recycleViewOnClickHack;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_pessoa, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvNome.setText(pessoaList.get(position).getNome());
        holder.tvIdade.setText(Integer.toString(pessoaList.get(position).getIdade()));
        holder.tvSexo.setText(pessoaList.get(position).getSexo());
    }

    @Override
    public int getItemCount() {
        return pessoaList.size();
    }

    public void removerPessoa(int position){
        this.pessoaList.remove(position);
        notifyItemRemoved(position);

    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvNome;
        TextView tvIdade;
        TextView tvSexo;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvNome = (TextView) itemView.findViewById(R.id.tvUsuario);
            tvIdade = (TextView) itemView.findViewById(R.id.tvIdade);
            tvSexo = (TextView) itemView.findViewById(R.id.tvSexo);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if(recycleViewOnClickHack != null){
                recycleViewOnClickHack.onClickListener(getAdapterPosition());
            }
        }
    }
}
