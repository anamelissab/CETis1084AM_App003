package mx.edu.cetis108.melissa.cetis1084am_app003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {
        EditText eNum1=(EditText) findViewById(R.id.eNum1);
        EditText eNum2=(EditText) findViewById(R.id.eNum2);
        TextView txtMayor=(TextView) findViewById(R.id.vMayor);
        TextView txtRestaSuma=(TextView) findViewById(R.id.vRestaSuma);
        double num1=Double.parseDouble(eNum1.getText().toString());
        double num2=Double.parseDouble(eNum2.getText().toString());
        double res;
        if (num1>num2) {
            res=num1-num2;
            txtMayor.setText("El mayor es: "+num1);
            txtRestaSuma.setText("Diferencia: "+Double.toString(res));
        }
        if (num2>num1) {
            res=num2+num1;
            txtMayor.setText("El mayor es "+num2);
            txtRestaSuma.setText("Total: "+Double.toString(res));
        }
    }
}
