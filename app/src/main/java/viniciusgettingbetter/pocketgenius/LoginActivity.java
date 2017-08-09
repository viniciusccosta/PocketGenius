package viniciusgettingbetter.pocketgenius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView txtview_login_esqueci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtview_login_esqueci = (TextView) findViewById(R.id.txtview_login_esqueci);
        txtview_login_esqueci.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}
