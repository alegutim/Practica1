package mx.com.alegutim.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtres;
    private Button btncambio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Creacion de los objetos a nivel logico
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
        //habilitaSignos(false);
        // borrar todo el resultado con un onlong clic
        findViewById(R.id.btnborrar).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txtres.setText("");
                return false;
            }
        });


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

    // agrega un caracter a la cadena
    private void agregaString(String cadena) {
        txtres.setText(txtres.getText()+cadena);
    }

    // elimina el ultimo caracter de la cadena
    private void  quitarString() {

        if (txtres.getText().length()>0) {
            txtres.setText(txtres.getText().toString().substring(0, txtres.getText().length() - 1));
        }
    }

    // habilita y dehabilita signos
    private void habilitaSignos(Boolean valor){
            findViewById(R.id.btnmodulo).setEnabled(valor);
            findViewById(R.id.btndivision).setEnabled(valor);
            findViewById(R.id.btnmultiplicacion).setEnabled(valor);
            findViewById(R.id.btnresta).setEnabled(valor);
            findViewById(R.id.btnsuma).setEnabled(valor);


    }
    // habilita o habilita los botones dependiendo del tipo
    private void makeBinaria(){
        if (btncambio.getText().equals("Binaria") ){
        findViewById(R.id.btnmodulo).setEnabled(true);
        findViewById(R.id.btndivision).setEnabled(true);
        findViewById(R.id.btnmultiplicacion).setEnabled(true);
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

    // realizar las operaciones para mostrar el resultado
    protected void showResultado(){
        int txtlenght = txtres.getText().length();
        if (txtlenght>0) {
            try {
                if (btncambio.getText().equals("Binaria")) {
                    String[] alnumeros;
                    ArrayList alsignos = new ArrayList();
                    String[] signos;

                    String operacionTotal = txtres.getText().toString();
                    String solonumeros = operacionTotal.replace("+", "_").replace("/", "_").replace("-", "_").replace("%", "_").replace("*", "_");
                    alnumeros = solonumeros.split("_");
                    String solosignos = operacionTotal.replace("0", "_").replace("1", "_").replace("2", "_").replace("3", "_").replace("4", "_")
                            .replace("5", "_").replace("6", "_").replace("7", "_").replace("8", "_").replace("9", "_").replace(".", "_");
                    signos = solosignos.split("_");
                    for (int a = 0; a < signos.length; a++) {
                        if (!signos[a].isEmpty()) {
                            alsignos.add(signos[a]);
                        }
                    }
                    //int la = alnumeros.length;
                    //int as = alsignos.size();
                    //Log.d("CALCULADORA", String.valueOf(la));
                    //Log.d("CALCULADORA",String.valueOf(as));
                    if (alsignos.size() == 1) {
                        Double resultado = 0.0;
                        switch (alsignos.get(0).toString()) {
                            case "/":
                                resultado = Double.valueOf(alnumeros[0]) / Double.valueOf(alnumeros[0]);
                                break;
                            case "*":
                                resultado = Double.valueOf(alnumeros[0]) * Double.valueOf(alnumeros[0]);
                                break;
                            case "-":
                                resultado = Double.valueOf(alnumeros[0]) - Double.valueOf(alnumeros[0]);
                                break;
                            case "+":
                                resultado = Double.valueOf(alnumeros[0]) + Double.valueOf(alnumeros[0]);
                                break;
                            case "%":
                                resultado = Double.valueOf(alnumeros[0]) % Double.valueOf(alnumeros[0]);
                                break;

                        }
                        txtres.setText(resultado.toString());
                    } else {
                        Toast.makeText(getApplicationContext(), "Unicamente se permite una operación", Toast.LENGTH_LONG).show();
                        txtres.setText("");
                    }
                } else{
                    // Todo binaria
                    String[] alnumeros;
                    ArrayList alsignos = new ArrayList();
                    String[] signos;

                    String operacionTotal = txtres.getText().toString();
                    String solonumeros = operacionTotal.replace("+", "_").replace("/", "_").replace("-", "_").replace("%", "_").replace("*", "_");
                    alnumeros = solonumeros.split("_");
                    String solosignos = operacionTotal.replace("0", "_").replace("1", "_").replace("2", "_").replace("3", "_").replace("4", "_")
                            .replace("5", "_").replace("6", "_").replace("7", "_").replace("8", "_").replace("9", "_").replace(".", "_");
                    signos = solosignos.split("_");
                    for (int a = 0; a < signos.length; a++) {
                        if (!signos[a].isEmpty()) {
                            alsignos.add(signos[a]);
                        }
                    }
                    if (alsignos.size() == 1) {
                        int resultado = 0;
                        int numero1binario = Integer.parseInt(alnumeros[0],2);
                        int numero2binario = Integer.parseInt(alnumeros[1],2);
                        switch (alsignos.get(0).toString()) {
                            case "/":
                                resultado = numero1binario / numero2binario;
                                break;
                            case "*":
                                resultado = numero1binario* numero2binario;
                                break;
                            case "-":
                                resultado = numero1binario - numero2binario;
                                break;
                            case "+":
                                resultado = numero1binario + numero2binario;
                                break;
                            case "%":
                                resultado = numero1binario % numero2binario;
                                break;

                        }
                        txtres.setText(Integer.toString(resultado,2));
                    } else {
                        Toast.makeText(getApplicationContext(), "Unicamente se permite una operación", Toast.LENGTH_LONG).show();
                        txtres.setText("");
                    }
                }
            } catch ( Exception ex  ){
                Toast.makeText(getApplicationContext(), "Operación invalida", Toast.LENGTH_LONG).show();
                txtres.setText("");
            }

        }
    }

    // valida si un string en numerico
    public boolean isNumeric(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }
}
