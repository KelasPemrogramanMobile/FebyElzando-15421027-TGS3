package com.project.tugas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup ;
    private RadioButton radioButton ;
    private EditText nama, npm, tgllahir,pw ;
    private Button btnambil ;
    private Spinner spAgama ;

    String stnama, stnpm, sttgl, stpwd, jk, stag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.nama);
        npm = (EditText) findViewById(R.id.npm);
        tgllahir = (EditText) findViewById(R.id.tgl);
        pw = (EditText) findViewById(R.id.pw);

        btnambil= (Button) findViewById(R.id.btnambil);


        btnambil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stnama = nama.getText().toString();
                stnpm = npm.getText().toString();
                sttgl = tgllahir.getText().toString();
                stpwd = pw.getText().toString();

                radioGroup = (RadioGroup) findViewById(R.id.radioklmn);

                int pilih= radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(pilih);

                spAgama = (Spinner) findViewById(R.id.sp_name);
                stag= spAgama.getSelectedItem().toString();

                jk = radioButton.getText().toString();

                Intent kirim = new Intent(MainActivity.this,Hasil.class);
                kirim.putExtra("Nama",stnama);
                kirim.putExtra("Npm",stnpm);
                kirim.putExtra("Tgl",sttgl);
                kirim.putExtra("Password",stpwd);
                kirim.putExtra("jk", jk);
                kirim.putExtra("agama", stag);
                startActivity(kirim);
                finish();
            }
        });
    }
}
