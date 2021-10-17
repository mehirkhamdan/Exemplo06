package com.example.exercicio06;

import static android.app.ProgressDialog.show;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.activity_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.act_adicionar){

            Toast.makeText(this, R.string.adicionar, Toast.LENGTH_SHORT).show();
            return  true;
        }
        else if (item.getItemId() == R.id.act_editar){
            Toast.makeText(this, R.string.editar, Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == R.id.act_remover){
            Toast.makeText(this, R.string.remover, Toast.LENGTH_SHORT).show();
            return  true;
        }
        else if (item.getItemId() == R.id.act_ajuda){
            Toast.makeText(this, R.string.ajuda, Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}