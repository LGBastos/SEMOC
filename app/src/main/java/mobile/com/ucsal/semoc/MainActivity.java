package mobile.com.ucsal.semoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.io.Serializable;
import java.util.List;

import mobile.com.ucsal.semoc.DAO.BatePapoDAO;
import mobile.com.ucsal.semoc.DAO.JornadaPesquisaDAO;
import mobile.com.ucsal.semoc.DAO.LancamentoLivrosDAO;
import mobile.com.ucsal.semoc.DAO.MesaRedondaDAO;
import mobile.com.ucsal.semoc.DAO.SemocJovemDAO;
import mobile.com.ucsal.semoc.DAO.SessoesCientificasDAO;
import mobile.com.ucsal.semoc.model.ItemCronograma;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MinhaApp", "mainCreate");
        Intent intent = new Intent(this, Cronograma.class);
       findViewById(R.id.main_mesa_redonda).setOnClickListener(view ->{

           List<ItemCronograma> lista = new MesaRedondaDAO().getList();
           intent.putExtra("lista", (Serializable) lista);
           startActivity(intent);
       });
        findViewById(R.id.main_jornada_pesquisa).setOnClickListener(view ->{
            List<ItemCronograma> lista = new JornadaPesquisaDAO().getList();
            intent.putExtra("lista", (Serializable) lista);
            startActivity(intent);
        });
        findViewById(R.id.main_bate_papo).setOnClickListener(view ->{
            List<ItemCronograma> lista = new BatePapoDAO().getList();
            intent.putExtra("lista", (Serializable) lista);
            startActivity(intent);
        });
        findViewById(R.id.main_sessoes_cientificas).setOnClickListener(view ->{
            List<ItemCronograma> lista = new SessoesCientificasDAO().getList();
            intent.putExtra("lista", (Serializable) lista);
            startActivity(intent);
        });
        findViewById(R.id.main_semoc_jovem).setOnClickListener(view ->{
            List<ItemCronograma> lista = new SemocJovemDAO().getList();
            intent.putExtra("lista", (Serializable) lista);
            startActivity(intent);
        });
        findViewById(R.id.main_lancamento_livros).setOnClickListener(view ->{
            Intent i = new Intent(this, LancamentoLivros.class);

            startActivity(i);
        });



    }
}