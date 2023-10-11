package com.fp.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editBil1, editBil2;
    private TextView textHasil;
    private Button btTambah, btKurang, btBagi, btKali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editBil1 = (EditText) findViewById(R.id.editTextBil1);
        editBil2 = (EditText) findViewById(R.id.editTextBil2);
        textHasil = (TextView) findViewById(R.id.textViewHasil);

        btTambah = (Button) findViewById(R.id.btnTambah);
        btTambah.setOnClickListener(this);
        btKurang = (Button) findViewById(R.id.btnKurang);
        btKurang.setOnClickListener(this);
        btKali = (Button) findViewById(R.id.btnKali);
        btKali.setOnClickListener(this);
        btBagi = (Button) findViewById(R.id.btnBagi);
        btBagi.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        float bil1, bil2, hasil = 0;
        Button bt;

        bil1 = Float.parseFloat(editBil1.getText().toString());
        bil2 = Float.parseFloat(editBil2.getText().toString());

        if (v.getId() == R.id.btnTambah) {
            hasil = bil1 + bil2;
        } else if (v.getId() == R.id.btnKurang) {
            hasil = bil1 - bil2;
        } else if (v.getId() == R.id.btnKali) {
            hasil = bil1 * bil2;
        } else if (v.getId() == R.id.btnBagi) {
            hasil = bil1 / bil2;
        }

        bt = (Button) findViewById(v.getId());

        textHasil.setText(bil1 + " " + bt.getText() + " " + bil2 + " = " + hasil);
    }


}
