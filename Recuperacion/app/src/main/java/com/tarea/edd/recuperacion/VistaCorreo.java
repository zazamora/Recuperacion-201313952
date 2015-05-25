package com.tarea.edd.recuperacion;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.tarea.edd.matriz.Matriz;

import java.util.ArrayList;


public class VistaCorreo extends ActionBarActivity {
    public Spinner listCorreo, listDom;
    public static ArrayList<String> sends = new ArrayList<String>(), categ = new ArrayList<String>();
    private Button btnCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_correo);
        listCorreo = (Spinner)findViewById(R.id.spCorreo);
        listDom = (Spinner)findViewById(R.id.spCategoria);
        btnCat = (Button)findViewById(R.id.btnCategoria);
        categ = Matriz.getInstancia().getDominios();
        ArrayAdapter<String> spinner_adapter = new ArrayAdapter<String>(VistaCorreo.this, android.R.layout.simple_spinner_item, categ);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listDom.setAdapter(spinner_adapter);

        sends = Matriz.getInstancia().getCorreosDom(categ.get(0));
        ArrayAdapter<String> spinner_adapter2 = new ArrayAdapter<String>(VistaCorreo.this, android.R.layout.simple_spinner_item, sends);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listCorreo.setAdapter(spinner_adapter2);
        btnCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sends = Matriz.getInstancia().getCorreosDom(listDom.getSelectedItem().toString());
                ArrayAdapter<String> spinner_adapter = new ArrayAdapter<String>(VistaCorreo.this, android.R.layout.simple_spinner_item, sends);
                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                listCorreo.setAdapter(spinner_adapter);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vista_correo, menu);
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
