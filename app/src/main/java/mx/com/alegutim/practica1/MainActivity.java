package mx.com.alegutim.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtres;
    private Button btncambio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtres = (TextView)findViewById(R.id.txtres);
        btncambio = (Button) findViewById(R.id.btncambio);
        btncambio.setOnClickListener((View.OnClickListener) this);
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
        findViewById(R.id.btnborrar).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btnintro).setOnClickListener((View.OnClickListener) this);
        habilitaSignos(false);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btncambio:
                makeBinaria();
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
            case R.id.btnborrar:
                quitarString();
                break;
            case R.id.btnintro:
                showResultado();
                break;
        }
    }


    private void agregaString(String cadena) {
        txtres.setText(txtres.getText()+cadena);
    }

    private void  quitarString() {
        if (txtres.getText().length()>0) {
            txtres.setText(txtres.getText().toString().substring(0, txtres.getText().length() - 1));
        }
    }

    private void habilitaSignos(Boolean valor){
        if (btncambio.getText().equals("Binaria") ) {
            findViewById(R.id.btnmodulo).setEnabled(valor);
            findViewById(R.id.btndivision).setEnabled(valor);
            findViewById(R.id.btnmultiplicacion).setEnabled(valor);
            findViewById(R.id.btnresta).setEnabled(valor);
            findViewById(R.id.btnsuma).setEnabled(valor);
        } else {
            findViewById(R.id.btnresta).setEnabled(valor);
            findViewById(R.id.btnsuma).setEnabled(valor);
        }

    }

    private void makeBinaria(){
        if (btncambio.getText().equals("Binaria") ){
        findViewById(R.id.btnmodulo).setEnabled(false);
        findViewById(R.id.btndivision).setEnabled(false);
        findViewById(R.id.btnmultiplicacion).setEnabled(false);
        findViewById(R.id.btnresta).setEnabled(true);
        findViewById(R.id.btnsuma).setEnabled(true);
        findViewById(R.id.btn9).setEnabled(false);
        findViewById(R.id.btn8).setEnabled(false);
        findViewById(R.id.btn7).setEnabled(false);
        findViewById(R.id.btn6).setEnabled(false);
        findViewById(R.id.btn5).setEnabled(false);
        findViewById(R.id.btn4).setEnabled(false);
        findViewById(R.id.btn3).setEnabled(false);
        findViewById(R.id.btn2).setEnabled(false);
        findViewById(R.id.btn1).setEnabled(true);
        findViewById(R.id.btn0).setEnabled(true);
        findViewById(R.id.btnpunto).setEnabled(false);
        findViewById(R.id.btnsuma).setEnabled(true);
        btncambio.setText("Decimal");
        } else{
            findViewById(R.id.btnmodulo).setEnabled(true);
            findViewById(R.id.btndivision).setEnabled(true);
            findViewById(R.id.btnmultiplicacion).setEnabled(true);
            findViewById(R.id.btnresta).setEnabled(true);
            findViewById(R.id.btnsuma).setEnabled(true);
            findViewById(R.id.btn9).setEnabled(true);
            findViewById(R.id.btn8).setEnabled(true);
            findViewById(R.id.btn7).setEnabled(true);
            findViewById(R.id.btn6).setEnabled(true);
            findViewById(R.id.btn5).setEnabled(true);
            findViewById(R.id.btn4).setEnabled(true);
            findViewById(R.id.btn3).setEnabled(true);
            findViewById(R.id.btn2).setEnabled(true);
            findViewById(R.id.btn1).setEnabled(true);
            findViewById(R.id.btn0).setEnabled(true);
            findViewById(R.id.btnpunto).setEnabled(true);
            findViewById(R.id.btnsuma).setEnabled(true);
            btncambio.setText("Binaria");
        }
    }

    protected void showResultado(){
        int txtlenght = txtres.getText().length();
        if (txtlenght>0) {
            if (btncambio.getText().equals("Binaria")) {
                String[] alnumeros ;
                ArrayList alsignos = new ArrayList<>();
                String operacionTotal = txtres.getText().toString();
                String numero = "";
                String solonumeros = operacionTotal.replace("+","_").replace("/","_").replace("-","_").replace("%","_").replace("*","_");
                alnumeros = solonumeros.split("_");


            }
        }
    }

    public boolean isNumeric(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }
}
