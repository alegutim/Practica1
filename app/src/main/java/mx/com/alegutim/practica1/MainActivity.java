package mx.com.alegutim.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtres = (TextView)findViewById(R.id.txtres);
        findViewById(R.id.btncambio).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btnmodulo).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btndivision).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btnmultiplicacion).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btnresta).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btnsuma).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn9).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn8).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn7).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn6).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn5).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn4).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn3).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn2).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn1).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn0).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btnpunto).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btnintro).setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btncambio:

                break;
            case R.id.btnmodulo:
                agregaString("%");
                habilitaSignos(false);
                break;
            case R.id.btndivision:
                agregaString("/");
                habilitaSignos(false);
                break;
            case R.id.btnmultiplicacion:
                agregaString("*");
                habilitaSignos(false);
                break;
            case R.id.btnresta:
                agregaString("-");
                habilitaSignos(false);
                break;
            case R.id.btnsuma:
                agregaString("+");
                habilitaSignos(false);
                break;
            case R.id.btn9:
                agregaString("9");
                habilitaSignos(true);
                break;
            case R.id.btn8:
                agregaString("8");
                habilitaSignos(true);
                break;
            case R.id.btn7:
                agregaString("7");
                habilitaSignos(true);
                break;
            case R.id.btn6:
                agregaString("6");
                habilitaSignos(true);
                break;
            case R.id.btn5:
                agregaString("5");
                habilitaSignos(true);
                break;
            case R.id.btn4:
                agregaString("4");
                habilitaSignos(true);
                break;
            case R.id.btn3:
                agregaString("3");
                habilitaSignos(true);
                break;
            case R.id.btn2:
                agregaString("2");
                habilitaSignos(true);
                break;
            case R.id.btn1:
                agregaString("1");
                habilitaSignos(true);
                break;
            case R.id.btn0:
                agregaString("0");
                habilitaSignos(true);
                break;
            case R.id.btnpunto:
                agregaString(".");
                break;
            case R.id.btnintro:

                break;
        }
    }


    private void agregaString(String cadena) {
        txtres.setText(txtres.getText()+cadena);
    }

    private void habilitaSignos(Boolean valor){
        findViewById(R.id.btnmodulo).setEnabled(valor);
        findViewById(R.id.btndivision).setEnabled(valor);
        findViewById(R.id.btnmultiplicacion).setEnabled(valor);
        findViewById(R.id.btnresta).setEnabled(valor);
        findViewById(R.id.btnsuma).setEnabled(valor);
    }

}
