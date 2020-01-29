package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.proyectolibreria.Adaptador.AdaptadorLibreria;
import com.example.proyectolibreria.R;

public class Principal extends AppCompatActivity {

    public static Libros[]libros=new Libros[]{
            new Libros(R.drawable.harrypotter_piedrafilosofal,"Harry Potter y la piedra filosofal",
                    "J.K.Rowling","1997","Literatura fantástica, aventuras, literatura juvenil"),


            new Libros(R.drawable.cazadoressombras,"Cazadores de Sombras" ,"Cassandra Clare","2007",
                    "Fantasía"),


    };


//
//    public static Libros[]libros=new Libros[]{
//            new Libros(R.drawable.harrypotter_piedrafilosofal,"Harry Potter y la piedra filosofal",
//                    "J.K.Rowling","1997","Harry Potter crece en la casa de sus tíos, " +
//                    "los Dursley, quienes le ocultan su verdadera historia familiar; al cumplir Harry once años de edad," +
//                    " empiezan a llegarle cartas de remitente desconocido, que van aumentando en número a medida que sus tíos no dejan que las abra. " +
//                    "Las mismas traen la noticia de que el niño ha sido admitido en el Colegio Hogwarts de Magia y Hechicería, " +
//                    "ya que, al igual que sus padres, tiene poderes mágicos.","Literatura fantástica, aventuras, literatura juvenil"),
//
//
//            new Libros(R.drawable.cazadoressombras,"Cazadores de Sombras" ,"Cassandra Clare","2007",
//                    "En el Pandemonium, la discoteca de moda de Nueva York, Clary sigue a un atractivo chico de pelo azul hasta que presencia " +
//                            "su muerte a manos de tres jóvenes cubiertos de extraños tatuajes. Desde esa noche, su destino se une al de esos tres cazadores de sombras," +
//                            " guerreros dedicados a liberar a la tierra de demonios y, sobre todo, al de Jace, un chico con aspecto de ángel y tendencia a actuar como un idiota...",
//                    "Fantasía"),
//
//
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        AdaptadorLibreria adaptadorLibreria=new AdaptadorLibreria(this);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adaptadorLibreria);





    }






}
