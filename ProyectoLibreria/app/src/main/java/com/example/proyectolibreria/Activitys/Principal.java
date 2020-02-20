package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyectolibreria.Adaptador.AdaptadorLibreria;
import com.example.proyectolibreria.R;

import org.w3c.dom.Text;

public class Principal extends AppCompatActivity {

    public static Libros[] libros = new Libros[]{
            new Libros(R.drawable.harrypotter_piedrafilosofal, "Harry Potter y la piedra filosofal",
                    "J.K.Rowling", "1997", "Harry Potter crece en la casa de sus tíos, los Dursley, quienes le ocultan su verdadera historia familiar; " +
                    "al cumplir Harry once años de edad, empiezan a llegarle cartas de remitente desconocido, que van aumentando en número a medida que sus tíos no dejan que" +
                    " las abra. Las mismas traen la noticia de que el niño ha sido admitido en el Colegio Hogwarts de Magia y Hechicería, ya que, al igual que sus padres," +
                    " tiene poderes mágicos.", "Literatura fantástica, aventuras, literatura juvenil", "20"),


            new Libros(R.drawable.cazadoressombras, "Cazadores de Sombras", "Cassandra Clare", "2007",
                    "En el Pandemonium, la discoteca de moda de Nueva York, Clary sigue a un atractivo chico de pelo azul hasta que presencia su muerte a manos de tres jóvenes" +
                            " cubiertos de extraños tatuajes. Desde esa noche, su destino se une al de esos tres cazadores de sombras," +
                            " guerreros dedicados a liberar a la tierra de demonios y, sobre todo, al de Jace, un chico con aspecto de ángel y tendencia a actuar como un idiota...",
                    "Fantasía", "20"),


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        final AdaptadorLibreria adaptadorLibreria = new AdaptadorLibreria(this);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptadorLibreria);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Principal.this, LIbroCompleto.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("clave", libros[position]);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });


    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu2, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.Fav) {
            Intent intent=new Intent(Principal.this,favoritos.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(menuItem);
    }

}




