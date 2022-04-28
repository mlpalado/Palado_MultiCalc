package mcm.edu.ph.palado_physicscalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Volume extends AppCompatActivity implements View.OnClickListener {

    Button btn_c1,btn_s2,btn_c3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume);
        btn_c1 = findViewById(R.id.btn_c1);
        btn_s2 = findViewById(R.id.btn_s2);
        btn_c3 = findViewById(R.id.btn_c3);
        btn_c1.setOnClickListener(this);
        btn_s2.setOnClickListener(this);
        btn_c3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_c1:
                startActivity(new Intent(this, RP.class));
                break;
            case R.id.btn_s2:
                startActivity(new Intent(this, Cube.class));
                break;
            case R.id.btn_c3:
                startActivity(new Intent(this, Cone.class));
                break;
        }
    }
}
