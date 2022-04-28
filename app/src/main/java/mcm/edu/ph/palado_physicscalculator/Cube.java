package mcm.edu.ph.palado_physicscalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cube extends AppCompatActivity implements View.OnClickListener{

    EditText txt_side;
    double var1,ans;
    TextView txt_answer;
    Button btn_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cube);
        btn_calc = findViewById(R.id.calc);
        txt_side = findViewById(R.id.var1);
        txt_answer = findViewById(R.id.answer);
        btn_calc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txt_side.getText().toString());
        ans = var1 * var1 * var1;
        txt_answer.setText("Answer: " + ans);
    }

}
