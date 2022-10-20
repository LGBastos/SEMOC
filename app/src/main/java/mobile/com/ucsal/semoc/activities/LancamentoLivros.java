package mobile.com.ucsal.semoc.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import mobile.com.ucsal.semoc.DAO.LancamentoLivrosDAO;
import mobile.com.ucsal.semoc.R;
import mobile.com.ucsal.semoc.adapter.LivroAdapter;

public class LancamentoLivros extends ActivitiesMenu {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lancamento_livros);
        LancamentoLivrosDAO lvd = new LancamentoLivrosDAO();
        RecyclerView rc19 = findViewById(R.id.recycler_livros_19);
        rc19.setAdapter(new LivroAdapter(lvd.getLista19()));
        rc19.setLayoutManager(new LinearLayoutManager(this));


        RecyclerView rc20 = findViewById(R.id.recycler_livros_20);
        rc20.setAdapter(new LivroAdapter(lvd.getLista20()));
        rc20.setLayoutManager(new LinearLayoutManager(this));

    }
}
