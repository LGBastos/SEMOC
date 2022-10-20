package mobile.com.ucsal.semoc;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

import mobile.com.ucsal.semoc.model.ItemLivro;

public class DetailLivro extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_livro);
         ItemLivro il = (ItemLivro)getIntent().getSerializableExtra("itemLivro");
        TextView autor = (TextView) findViewById(R.id.detalhe_livro_autor);
        autor.setText(il.getAutor());
        TextView resumo = (TextView) findViewById(R.id.detalhe_livro_resumo);
        resumo.setText(il.getResumo());
        TextView titulo = (TextView) findViewById(R.id.detalhe_livro_titulo);
        titulo.setText(il.getTitulo());
    }
}
