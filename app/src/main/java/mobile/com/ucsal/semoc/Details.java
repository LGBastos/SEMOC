package mobile.com.ucsal.semoc;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import mobile.com.ucsal.semoc.model.ItemCronograma;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_cronograma_detalhado);

        ItemCronograma e = (ItemCronograma) getIntent().getSerializableExtra("itemCronograma");
        TextView titulo = (TextView) findViewById(R.id.cronograma_detail_titulo);
        titulo.setText(e.getContent());
        TextView descricao = (TextView) findViewById(R.id.cronograma_detail_texto);
        descricao.setText(e.getDetail());
        TextView horario = (TextView) findViewById(R.id.cronograma_detail_horario);
        horario.setText(e.getHorario());
        TextView dia = (TextView) findViewById(R.id.cronograma_detail_dia);
        dia.setText(e.getDia());
        TextView local = (TextView) findViewById(R.id.cronograma_detail_local);
        local.setText(e.getLocal());



    }

}
