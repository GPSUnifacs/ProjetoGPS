package com.gps.unifacs.projetogps;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtendo referencias dos botões
        Button botaoConfig =(Button)findViewById(R.id.botaoConfiguracao);
        Button botaoLocal =(Button)findViewById(R.id.botaoLocalizacao);
        Button botaoSobre =(Button)findViewById(R.id.botaoSobre);

        //Definindo Listeners
        botaoConfig.setOnClickListener(this);
        botaoLocal.setOnClickListener(this);
        botaoSobre.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
    //Verificando qual botão foi pressionado
        switch(v.getId()) {

            case R.id.botaoConfiguracao:
                Intent i = new Intent(this,ConfiguracaoActivity.class);
                startActivity(i);
                break;
                //Abrir tela de configuração

            case R.id.botaoLocalizacao:
                //Abrir tela de Localização

            case R.id.botaoSobre:
                //Abrir tela de Creditos

        }

    }
}
