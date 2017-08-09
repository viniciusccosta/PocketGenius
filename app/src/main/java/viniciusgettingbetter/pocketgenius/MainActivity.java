package viniciusgettingbetter.pocketgenius;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_cadastrar;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login       = (Button) findViewById(R.id.btn_login);
        btn_cadastrar   = (Button) findViewById(R.id.btn_cadastrar);

    }

    public void goLogin(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void goCadastrar(View view){
        Intent intent = new Intent(this, CadastrarActivity.class);
        startActivity(intent);
    }

}
