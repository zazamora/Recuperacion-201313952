package com.tarea.edd.recuperacion;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tarea.edd.matriz.Data;
import com.tarea.edd.matriz.Matriz;


public class MainActivity extends ActionBarActivity {
    private Button btnAgrega;
    private Button btnCorreos;
    private TextView txtDom;
    private TextView txtMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAgrega = (Button)findViewById(R.id.btnNuevo);
        btnCorreos = (Button)findViewById(R.id.btnVer);
        txtDom = (TextView)findViewById(R.id.txtDominio);
        txtMail = (TextView)findViewById(R.id.txtCorreo);
        btnAgrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data datos = new Data();
                String a = txtMail.getText().toString();
                datos.setFila(a.substring(0,1));
                datos.setColumna(txtDom.getText().toString());
                datos.setCorreo(txtMail.getText().toString());
                Matriz.getInstancia().insertaNodo(datos);
                txtDom.setText("");
                txtMail.setText("");
            }
        });
        btnCorreos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten3 = new Intent(MainActivity.this,VistaCorreo.class);
                startActivity(inten3);
            }
        });
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
}
