package mobile.com.ucsal.semoc.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mobile.com.ucsal.semoc.Details;
import mobile.com.ucsal.semoc.model.ItemCronograma;
import mobile.com.ucsal.semoc.R;

public class CronogramaAdapter extends RecyclerView.Adapter<CronogramaAdapter.ViewHolder>{
    private List<ItemCronograma> listaDeDados;

    public CronogramaAdapter(List<ItemCronograma> listaDeDados){
        this.listaDeDados=listaDeDados;
    }

    @NonNull
    @Override
    public CronogramaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cronograma,parent,false);
        return new CronogramaAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemCronograma entidade = listaDeDados.get(position);
        holder.setHorario(entidade.getHorario());
        holder.setContent(entidade.getContent());
        holder.setDia(entidade.getLocal());
        Intent intent =  new Intent(holder.getView().getContext(), Details.class);
        intent.putExtra("itemCronograma", entidade);
        holder.getView().setOnClickListener(view -> {
            holder.getView().getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listaDeDados.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView horario;
        private final TextView content;
        private final TextView dia;
        private View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.horario =(TextView) itemView.findViewById(R.id.cronograma_horario);
            this.content = (TextView)itemView.findViewById(R.id.cronograma_titulo);
            this.dia = (TextView)itemView.findViewById(R.id.cronograma_dia);
            this.view = itemView;
        }
        public View getView(){return this.view;}
        public void setHorario(String horario){
            this.horario.setText(horario);
        }
        public void setContent(String content){
            this.content.setText(content);
        }
        public void setDia(String dia){
            this.dia.setText(dia);
        }
    }

}
