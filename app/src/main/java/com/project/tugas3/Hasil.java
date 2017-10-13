package com.project.tugas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {
    Intent nama, npm, tgl, pw, agama, jk;
    TextView txnama, txnpm, txtgl, txjk, txagama, txpw;
    String stnm,stnpm,sttgl,stpw,stag,stjk;
    Button btnkmbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        nama=getIntent();
        npm=getIntent();
        tgl=getIntent();
        pw=getIntent();
        agama=getIntent();
        jk=getIntent();

        txnama = (TextView) findViewById(R.id.nama);
        txnpm = (TextView) findViewById(R.id.npm);
        txtgl = (TextView) findViewById(R.id.tgl);
        txjk = (TextView) findViewById(R.id.jk);
        txagama = (TextView) findViewById(R.id.agama);
        txpw = (TextView) findViewById(R.id.pwd);

        stnm=nama.getStringExtra("Nama");
        stag=agama.getStringExtra("agama");
        stnpm=npm.getStringExtra("Npm");
        sttgl=tgl.getStringExtra("Tgl");
        stpw=pw.getStringExtra("Password");
        stjk=jk.getStringExtra("jk");

        txnama.setText(stnm);
        txnpm.setText(stnpm);
        txtgl.setText(sttgl);
        txjk.setText(stjk);
        txagama.setText(stag);
        txpw.setText(stpw);

        btnkmbl= (Button) findViewById(R.id.btn);

        btnkmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(Hasil.this,MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });


    }
}
