package mx.com.alegutim.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        txtres = (EditText)  findViewById(R.id.txtres);
        //txtres.setText("");
        setContentView(R.layout.activity_main);
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
        //txtres.setText("hola");


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btncambio:

                break;
            case R.id.btnmodulo:
                agregaString("%");
                break;
            case R.id.btndivision:
                agregaString("/");
                break;
            case R.id.btnmultiplicacion:
                agregaString("*");
                break;
            case R.id.btnresta:
                agregaString("-");
                break;
            case R.id.btnsuma:
                agregaString("+");
                break;
            case R.id.btn9:
                agregaString("9");
                break;
            case R.id.btn8:
                agregaString("8");
                break;
            case R.id.btn7:
                agregaString("7");
                break;
            case R.id.btn6:
                agregaString("6");
                break;
            case R.id.btn5:
                agregaString("5");
                break;
            case R.id.btn4:
                agregaString("4");
                break;
            case R.id.btn3:
                agregaString("3");
                break;
            case R.id.btn2:
                agregaString("2");
                break;
            case R.id.btn1:
                agregaString("1");
                break;
            case R.id.btn0:
                agregaString("0");
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

}
