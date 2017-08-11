package viniciusgettingbetter.pocketgenius;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView txtview_login_esqueci;
    Button btn_login_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtview_login_esqueci = (TextView) findViewById(R.id.txtview_login_esqueci);
        btn_login_entrar = (Button) findViewById(R.id.btn_login_entrar);

        txtview_login_esqueci.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_login_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // TODO: Verificar se usuário e senha estão corretos, caso estejam, além de ir para PrincipalActivity, temos que matar a MainActivity.
                Intent intent = new Intent(LoginActivity.this, PrincipalActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
