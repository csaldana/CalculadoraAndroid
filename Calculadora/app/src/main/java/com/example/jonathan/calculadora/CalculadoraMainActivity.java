package com.example.jonathan.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CalculadoraMainActivity extends ActionBarActivity {

    private Button btnuno;
    private Button btndos;
    private Button btntres;
    private Button btncuatro;
    private Button btncinco;
    private Button btnseis;
    private Button btnsiete;
    private Button btnocho;
    private Button btnnueve;
    private Button btncero;
    private Button btnpunto;
    private Button btnigual;

    private Button btnsuma;
    private Button btnresta;
    private Button btnmulti;
    private Button btndivision;
    private Button btnBorra;
    private Button btnc;
    private Button btnmensaje;

    private EditText txtpantalla;

    String numero1 = "";
    String numero2 = "";
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_main);

        this.btnuno = (Button) findViewById(R.id.btnuno);
        this.btndos = (Button) findViewById(R.id.btndos);
        this.btntres = (Button) findViewById(R.id.btntres);
        this.btncuatro = (Button) findViewById(R.id.btncuatro);
        this.btncinco = (Button) findViewById(R.id.btncinco);
        this.btnseis = (Button) findViewById(R.id.btnseis);
        this.btnsiete = (Button) findViewById(R.id.btnsiete);
        this.btnocho = (Button) findViewById(R.id.btnocho);
        this.btnnueve = (Button) findViewById(R.id.btnnueve);
        this.btncero = (Button) findViewById(R.id.btncero);
        this.btnpunto = (Button) findViewById(R.id.btnpunto);
        this.btnigual = (Button) findViewById(R.id.btnigual);

        this.btnsuma = (Button) findViewById(R.id.btnsuma);
        this.btnresta = (Button) findViewById(R.id.btnresta);
        this.btnmulti = (Button) findViewById(R.id.btnmulti);
        this.btndivision = (Button) findViewById(R.id.btndivision);
        this.btnBorra = (Button) findViewById(R.id.btnBorra);
        this.btnc = (Button) findViewById(R.id.btnc);

        this.txtpantalla = (EditText) findViewById(R.id.txtpantalla);
    }

public void OnClickbtnuno(View v){
    numero1 += "1";
    txtpantalla.setText(numero1);
}
    public void OnClickbtndos(View v){
        numero1 += "2";
        txtpantalla.setText(numero1);
    }
    public void OnClickbtntres(View v){
        numero1 += "3";
        txtpantalla.setText(numero1);
    }
    public void OnClickbtncuatro(View v){
        numero1 += "4";
        txtpantalla.setText(numero1);
    }
    public void OnClickbtncinco(View v){
        numero1 += "5";
        txtpantalla.setText(numero1);
    }
    public void OnClickbtnseis(View v){
        numero1 += "6";
        txtpantalla.setText(numero1);
    }
    public void OnClickbtnsiete(View v){
        numero1 += "7";
        txtpantalla.setText(numero1);
    }
    public void OnClickbtnocho(View v){
        numero1 += "8";
        txtpantalla.setText(numero1);
    }
    public void OnClickbtnnueve(View v){
        numero1 += "9";
        txtpantalla.setText(numero1);
    }
    public void OnClickbtncero(View v){
        numero1 += "0";
        txtpantalla.setText(numero1);
    }
    public void OnClickbtnpunto(View v){
        numero1 += ".";
        txtpantalla.setText(numero1);
    }
    public void OnClickbtnc(View v){
        numero1 = "";
        numero2 = "";
        txtpantalla.setText("");
        contador = 0;
    }
    public void OnClickbtnsuma(View v){
        //Avisa si tiene algo escrito
       if(!txtpantalla.getText().equals("") || contador != 0){
           operaciones();
           txtpantalla.setText("+");

       }
    }
    public void OnClickbtnresta(View v){

        if(!txtpantalla.getText().equals("") || contador != 0){
            operaciones();
            txtpantalla.setText("-");
        }
    }
    public void OnClickbtnmulti(View v){

        if(!txtpantalla.getText().equals("") || contador != 0){
            operaciones();
            txtpantalla.setText("x");
        }
    }
    public void OnClickbtndivision(View v){

        if(!txtpantalla.getText().equals("") || contador != 0){
            operaciones();
            txtpantalla.setText("/");
        }
    }
    public void OnClickbtnigual(View v){

        if(!txtpantalla.getText().equals("") || contador != 0){
            operaciones();
            txtpantalla.setText("");
        }
    }
    public void OnClickbtnBorra(View v ){

    if (!txtpantalla.getText().equals("")) {
       String pantalla  = numero1.substring(0, numero1.length() - 1);
        txtpantalla.setText(pantalla);

    }

    }
    public void operaciones(){
       double n1,n2;
        //Revisa que esta escrito en pantalla
        if(!txtpantalla.getText().equals("")){
            if(contador == 0){
                numero2 = numero1;
                txtpantalla.setText(numero2);
            }
            if(numero2.equals("")){
                numero2 = "0";
            }
            n1 = Double.valueOf(numero2);
            n2 = Double.valueOf(numero1);

            if(txtpantalla.getText().equals("-")){
               numero2 = String.valueOf(n1-n2);
            }
            if(txtpantalla.getText().equals("+")){
                numero2 = String.valueOf(n1 + n2);
            }
            if(txtpantalla.getText().equals("x")){
                numero2 = String.valueOf(n1 * n2);
            }
            if(txtpantalla.getText().equals("/")){
                numero2 = String.valueOf(n1 / n2);
            }
            txtpantalla.setText("");
            numero1 = "";
            contador ++;
            txtpantalla.setText(numero2);

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
