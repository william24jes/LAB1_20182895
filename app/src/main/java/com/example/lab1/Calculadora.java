package com.example.lab1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculadora extends AppCompatActivity {

    private String variable="0";
    private String variable2="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_layout);

    }

    public void operaciones (View view) {

        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textView0 = findViewById(R.id.cero);
        TextView textView1 = findViewById(R.id.uno);
        TextView textView2 = findViewById(R.id.dos);
        TextView textView3 = findViewById(R.id.tres);
        TextView textView4 = findViewById(R.id.cuatro);
        TextView textView5 = findViewById(R.id.cinco);
        TextView textView6 = findViewById(R.id.seis);
        TextView textView7 = findViewById(R.id.siete);
        TextView textView8 = findViewById(R.id.ocho);
        TextView textView9 = findViewById(R.id.nueve);



        TextView textViewSuma = findViewById(R.id.suma);
        TextView textViewResta = findViewById(R.id.resta);
        TextView textViewProducto = findViewById(R.id.producto);
        TextView textViewDivision = findViewById(R.id.division);
        TextView textViewIgual = findViewById(R.id.igualdad);
        TextView textViewCLR = findViewById(R.id.CLR);



        String inputStr = textView1.getText().toString();
        float inputFloat = Float.parseFloat(inputStr);

        Log.d ("numero", "" +  String.valueOf(inputFloat));
        textView2.setText(String.valueOf(inputFloat));
    }

    public void numero0(View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewresultado = findViewById(R.id.resultado);
        TextView textView = findViewById(R.id.cero);

        String inputStr = textView.getText().toString();
        String input = getVariable() + inputStr;
        setVariable(input);

        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            String resultadoAbajo=getVariable2()+textView.getText().toString();
            setVariable2(resultadoAbajo);
            textViewresultado.setText(resultadoAbajo);

        } else {
            textViewinput.setText(input);
        }
    }

    public void numero1 (View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewresultado = findViewById(R.id.resultado);
        TextView textView = findViewById(R.id.uno);


        String inputStr = textView.getText().toString();
        String input=getVariable()+inputStr;
        setVariable(input);

        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            String resultadoAbajo=getVariable2()+textView.getText().toString();
            setVariable2(resultadoAbajo);
            textViewresultado.setText(resultadoAbajo);


        } else {
            textViewinput.setText(input);
        }
    }

    public void numero2 (View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewresultado = findViewById(R.id.resultado);
        TextView textView = findViewById(R.id.dos);


        String inputStr = textView.getText().toString();
        String input=getVariable()+inputStr;
        setVariable(input);
        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            String resultadoAbajo=getVariable2()+textView.getText().toString();
            setVariable2(resultadoAbajo);
            textViewresultado.setText(resultadoAbajo);


        } else {
            textViewinput.setText(input);
        }
    }

    public void numero3 (View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewresultado = findViewById(R.id.resultado);
        TextView textView = findViewById(R.id.tres);


        String inputStr = textView.getText().toString();
        String input=getVariable()+inputStr;
        setVariable(input);
        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            String resultadoAbajo=getVariable2()+textView.getText().toString();
            setVariable2(resultadoAbajo);
            textViewresultado.setText(resultadoAbajo);


        } else {
            textViewinput.setText(input);
        }
    }

    public void numero4 (View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewresultado = findViewById(R.id.resultado);
        TextView textView = findViewById(R.id.cuatro);


        String inputStr = textView.getText().toString();
        String input=getVariable()+inputStr;
        setVariable(input);
        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            String resultadoAbajo=getVariable2()+textView.getText().toString();
            setVariable2(resultadoAbajo);
            textViewresultado.setText(resultadoAbajo);


        } else {
            textViewinput.setText(input);
        }
    }

    public void numero5 (View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewresultado = findViewById(R.id.resultado);
        TextView textView = findViewById(R.id.cinco);


        String inputStr = textView.getText().toString();
        String input=getVariable()+inputStr;
        setVariable(input);
        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            String resultadoAbajo=getVariable2()+textView.getText().toString();
            setVariable2(resultadoAbajo);
            textViewresultado.setText(resultadoAbajo);


        } else {
            textViewinput.setText(input);
        }
    }

    public void numero6 (View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewresultado = findViewById(R.id.resultado);
        TextView textView = findViewById(R.id.seis);


        String inputStr = textView.getText().toString();
        String input=getVariable()+inputStr;
        setVariable(input);
        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            String resultadoAbajo=getVariable2()+textView.getText().toString();
            setVariable2(resultadoAbajo);
            textViewresultado.setText(resultadoAbajo);


        } else {
            textViewinput.setText(input);
        }
    }

    public void numero7 (View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewresultado = findViewById(R.id.resultado);
        TextView textView = findViewById(R.id.siete);


        String inputStr = textView.getText().toString();
        String input=getVariable()+inputStr;
        setVariable(input);
        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            String resultadoAbajo=getVariable2()+textView.getText().toString();
            setVariable2(resultadoAbajo);
            textViewresultado.setText(resultadoAbajo);


        } else {
            textViewinput.setText(input);
        }
    }

    public void numero8 (View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewresultado = findViewById(R.id.resultado);
        TextView textView = findViewById(R.id.ocho);


        String inputStr = textView.getText().toString();
        String input=getVariable()+inputStr;
        setVariable(input);
        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            String resultadoAbajo=getVariable2()+textView.getText().toString();
            setVariable2(resultadoAbajo);
            textViewresultado.setText(resultadoAbajo);


        } else {
            textViewinput.setText(input);
        }
    }

    public void numero9 (View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewresultado = findViewById(R.id.resultado);
        TextView textView = findViewById(R.id.nueve);


        String inputStr = textView.getText().toString();
        String input=getVariable()+inputStr;
        setVariable(input);
        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            String resultadoAbajo=getVariable2()+textView.getText().toString();
            setVariable2(resultadoAbajo);
            textViewresultado.setText(resultadoAbajo);


        } else {
            textViewinput.setText(input);
        }
    }

    public void signoSuma(View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textViewsuma = findViewById(R.id.suma);
        String variableActual = getVariable();

        if (variableActual.contains("++")) {
            String modifiedVariable = variableActual.replace("++", "+");
            setVariable(modifiedVariable);
        } else if (!variableActual.endsWith("+")) {
            String input = variableActual + "+";
            setVariable(input);
        }

        textViewinput.setText(getVariable());
    }

    public void signoResta(View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textVieresta = findViewById(R.id.suma);
        String variableActual = getVariable();

        if (variableActual.contains("--")) {
            String modifiedVariable = variableActual.replace("--", "-");
            setVariable(modifiedVariable);
        } else if (!variableActual.endsWith("-")) {
            String input = variableActual + "-";
            setVariable(input);
        }

        textViewinput.setText(getVariable());
    }

    public void signoProducto(View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textVieproducto = findViewById(R.id.suma);
        String variableActual = getVariable();

        if (variableActual.contains("**")) {
            String modifiedVariable = variableActual.replace("**", "-");
            setVariable(modifiedVariable);
        } else if (!variableActual.endsWith("*")) {
            String input = variableActual + "*";
            setVariable(input);
        }

        textViewinput.setText(getVariable());
    }

    public void signoDivision(View view) {
        TextView textViewinput = findViewById(R.id.inputNumero);
        TextView textVieproducto = findViewById(R.id.suma);
        String variableActual = getVariable();

        if (variableActual.contains("//")) {
            String modifiedVariable = variableActual.replace("//", "-");
            setVariable(modifiedVariable);
        } else if (!variableActual.endsWith("/")) {
            String input = variableActual + "/";
            setVariable(input);
        }

        textViewinput.setText(getVariable());
    }


    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }
}
