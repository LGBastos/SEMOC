package mobile.com.ucsal.semoc.activities;

import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import mobile.com.ucsal.semoc.R;

public class ActivitiesMenu extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opcoes, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_contato:
                Uri webpage = Uri.parse("https://ucsal.br/institucional/25a-semoc/#1657135579120-a52ad91f-e22f");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(webpage);
                startActivity(intent);
                break;
            case R.id.menu_inscricao:
                Uri webpage2 = Uri.parse("https://www.sympla.com.br/evento/25-semoc-educacao-inclusiva-2022/1729833");
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(webpage2);
                startActivity(intent2);
                break;
            case R.id.menu_sobre:
                Uri webpage3 = Uri.parse("https://ucsal.br/institucional/25a-semoc/#apresentacao");
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(webpage3);
                startActivity(intent3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}

