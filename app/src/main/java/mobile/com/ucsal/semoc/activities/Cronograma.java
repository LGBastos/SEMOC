package mobile.com.ucsal.semoc.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mobile.com.ucsal.semoc.R;
import mobile.com.ucsal.semoc.adapter.CronogramaAdapter;
import mobile.com.ucsal.semoc.model.ItemCronograma;

public class Cronograma extends ActivitiesMenu {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cronograma);
        getIntent().getSerializableExtra("lista");
        RecyclerView rc = findViewById(R.id.cronograma_lista);
        List<ItemCronograma> lista = (List<ItemCronograma>)getIntent().getSerializableExtra("lista");

        CronogramaAdapter ca = new CronogramaAdapter(lista);
        rc.setAdapter(ca);
        rc.setLayoutManager(new LinearLayoutManager(this));

    }
}
