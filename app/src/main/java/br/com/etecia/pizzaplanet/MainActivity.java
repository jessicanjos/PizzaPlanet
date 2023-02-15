package br.com.etecia.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String tituloModelo[] = {"Mussarela", "Portuguesa", "Calabresa"};
    String subtituloModelo[] = {"Queijos", "X-tudo", "la ele"};
    int imgModelo[] = {R.drawable.mussarela, R.drawable.port, R.drawable.calabresa};
    String media[] = {"5.0", "4.0", "2.0"};
    ListView idlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            idlistView = findViewById(R.id.idlistView);
            MyAdapter Adapter = new MyAdapter();
            idlistView.setAdapter(Adapter);

    }
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imgModelo.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imagemModelo;
            TextView Titulo, Subtitulo, Media;
            RatingBar rtbar;

            View v = getLayoutInflater().inflate(R.layout.modelo_cardapio, null);
            imagemModelo = v.findViewById(R.id.ImgModelo);
            Titulo = v.findViewById(R.id.TituloModelo);
            Subtitulo = v.findViewById(R.id.subtituloModelo);
            Media = v.findViewById(R.id.mediaRatingBarModelo);

            imagemModelo.setImageResource(imgModelo[position]);
            Titulo.setText(tituloModelo[position]);
            Subtitulo.setText(subtituloModelo[position]);
            Media.setText(media[position]);



            return v;
        }
    }
}