package viniciusgettingbetter.pocketgenius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CadastrarActivity extends AppCompatActivity {
    ImageView imgview_novoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        imgview_novoCadastro = (ImageView) findViewById(R.id.img_cadastro_welcome);
        imgview_novoCadastro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

    }
}
