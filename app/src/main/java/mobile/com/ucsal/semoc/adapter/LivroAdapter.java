package mobile.com.ucsal.semoc.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

import mobile.com.ucsal.semoc.DetailLivro;
import mobile.com.ucsal.semoc.Details;
import mobile.com.ucsal.semoc.R;
import mobile.com.ucsal.semoc.model.ItemLivro;

public class LivroAdapter extends RecyclerView.Adapter<LivroAdapter.LivroHolder> {

    List<ItemLivro> listaDedados;
    public LivroAdapter(List<ItemLivro> listaDedados){
        this.listaDedados = listaDedados;
    }
    @NonNull
    @Override
    public LivroHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_livro,parent,false);
        return new LivroHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LivroHolder holder, int position) {
        ItemLivro il = listaDedados.get(position);
        holder.setAutor(il.getAutor());
        holder.setTitulo(il.getTitulo());
        Intent intent =  new Intent(holder.getView().getContext(), DetailLivro.class);
        intent.putExtra("itemLivro", il);
        holder.getView().setOnClickListener(view -> {
            holder.getView().getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return listaDedados.size();
    }

    class LivroHolder extends RecyclerView.ViewHolder{
        private TextView titulo;
        private TextView autor;
        private View view;

        public void setTitulo(String titulo) {
            this.titulo.setText(titulo);
        }

        public void setAutor(String autor) {
            this.autor.setText(autor);
        }



        public View getView() {
            return view;
        }

        public LivroHolder(@NonNull View itemView) {
            super(itemView);
            this.view = itemView;
            this.autor = (TextView) itemView.findViewById(R.id.item_livro_autor);
            this.titulo = (TextView) itemView.findViewById(R.id.item_livro_titulo);

        }
    }
}
