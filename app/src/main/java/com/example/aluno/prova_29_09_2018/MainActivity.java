package com.example.aluno.prova_29_09_2018;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText visor;
    double somando = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visor = (EditText) findViewById(R.id.visor);
    }

    public void valorDaConta(View botao){
        switch (botao.getId()){
            case R.id.bt1:
                somando += 25.00;
                visor.setText("Total do pedido: R$" + somando); break;
            case R.id.bt2:
                somando += 27.25;
                visor.setText("Total do pedido: R$" + somando); break;
            case R.id.bt3:
                somando += 35.00;
                visor.setText("Total do pedido: R$" + somando); break;
            case R.id.bt4:
                somando += 21.50;
                visor.setText("Total do pedido: R$" + somando); break;
            case R.id.bt5:
                somando += 23.00;
                visor.setText("Total do pedido: R$" + somando); break;
        }
    }
}
