package viniciusgettingbetter.pocketgenius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
//import java.util.Arrays;
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

        Map<String, String> mapa = new HashMap<>(2);
        mapa.put("title","Provas antigas");
        mapa.put("subtitle","Veja todas as provas já realizadas até a data atual");
        data.add(mapa);

        mapa = new HashMap<>(2);
        mapa.put("title","Simulados");
        mapa.put("subtitle","Treine para suas provas usando nossos simulados");
        data.add(mapa);

        mapa = new HashMap<>(2);
        mapa.put("title","Niveladas");
        mapa.put("subtitle","Veja todas as questões ordenadas por dificuldade");
        data.add(mapa);

        mapa = new HashMap<>(2);
        mapa.put("title","Cadernos");
        mapa.put("subtitle","As vezes é mais fácil decifrar o caderno do colega do que entender a aula");
        data.add(mapa);

        mapa = new HashMap<>(2);
        mapa.put("title","Livros");
        mapa.put("subtitle","Leia os melhores livros gratuítos de cada disciplina");
        data.add(mapa);

        mapa = new HashMap<>(2);
        mapa.put("title","Escolas");
        mapa.put("subtitle","Veja informações das nossas parceiras");
        data.add(mapa);

        SimpleAdapter adapter = new SimpleAdapter(this,
                data,
                android.R.layout.simple_list_item_2,
                new String[] {"title", "subtitle"},
                new int[] {android.R.id.text1, android.R.id.text2}
        );
        listView_principal.setAdapter(adapter);
    }
}
