package br.com.etecia.trembaao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //1. Declarando uma variável global
    ListView idlistaValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Atribuindo valor à variável
        idlistaValor = findViewById(R.id.listaValor);

        //5. Instanciando a classe do adapter
        MyAdapter adapter = new MyAdapter();

        //3. Definindo o adaptador
        idlistaValor.setAdapter(adapter);
    }

    //4. Criando a classe do adaptador (depois que colocar o extends, apertar o alt enter para implementar os metodos)
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }

    }
}