package viniciusgettingbetter.pocketgenius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrincipalActivity extends AppCompatActivity {
    ListView listView_principal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        listView_principal = (ListView) findViewById(R.id.listView_principal);

        // Populando ListView:
        //ArrayList<String> itens = new ArrayList<>();
        //itens.addAll(Arrays.asList("Provas antigas", "Simulados", "Niveladas", "Cadernos", "Livros", "Escolas"));
        //listView_principal.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, itens));

        // Título e descrição
        List<Map<String, String>> data = new ArrayList<>();
        String titulos[] = new String[]{"Provas antigas",
                "Simulados",
                "Niveladas",
                "Cadernos",
                "Livros",
                "Escolas"};
        String subtitulos[] = new String[]{"Veja todas as provas já realizadas até a data atual",
                "Treine para suas provas usando nossos simulados",
                "Veja todas as questões ordenadas por dificuldade",
                "As vezes é mais fácil decifrar o caderno do colega do que entender a aula",
                "Leia os melhores livros gratuítos de cada disciplina",
                "Veja informações das nossas parceiras"};

        for (int i = 0; i < 6; i++){
            Map<String, String> mapa = new HashMap<>(2);
            mapa.put("title",titulos[i]);
            mapa.put("subtitle",subtitulos[i]);
            data.add(mapa);
        }

        SimpleAdapter adapter = new SimpleAdapter(this,
                data,
                android.R.layout.simple_list_item_2,
                new String[] {"title", "subtitle"},
                new int[] {android.R.id.text1, android.R.id.text2}
        );
        listView_principal.setAdapter(adapter);
    }
}
