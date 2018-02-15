package br.senac.sp.l13.collapsingtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bancoId, ideaisId, adicionarId, linksId, wifiId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bancoId = (CardView) findViewById(R.id.bancoId);
        ideaisId = (CardView) findViewById(R.id.ideiasId);
        adicionarId = (CardView) findViewById(R.id.adicionarId);
        linksId = (CardView) findViewById(R.id.linksId);
        wifiId = (CardView) findViewById(R.id.wifiId);

        //adicionando clique nos objetos

        bancoId.setOnClickListener(this);
        ideaisId.setOnClickListener(this);
        adicionarId.setOnClickListener(this);
        linksId.setOnClickListener(this);
        wifiId.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.bancoId:
                i = new Intent(this, Banco_Activity.class);
                startActivity(i);
                break;
            case R.id.ideiasId:
                i = new Intent(this, Ideias_Activity.class);
                startActivity(i);
                break;
            case R.id.adicionarId:
                i = new Intent(this, Adicionar_Activity.class);
                startActivity(i);
                break;
            case R.id.linksId:
                i = new Intent(this, Links_Activity.class);
                startActivity(i);
                break;
            case R.id.wifiId:
                i = new Intent(this, Wifi_Activity.class);
                startActivity(i);
                break;
            default: break ;

        }
    }
}










