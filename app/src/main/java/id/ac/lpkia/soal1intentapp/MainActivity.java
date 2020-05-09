package id.ac.lpkia.soal1intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText nama, phone, email, alamat;
    RadioGroup kelamin;
    Button process;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.et_nama);
        phone = findViewById(R.id.et_phone);
        email = findViewById(R.id.et_email);
        alamat = findViewById(R.id.et_alamat);
        kelamin = findViewById(R.id.rg_kelamin);
        process = findViewById(R.id.btn_process);

        process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Output.class);
                String[] id = new String[5];

                id[0] = nama.getText().toString();
                id[1] = phone.getText().toString();
                id[2] = email.getText().toString();
                id[3] = alamat.getText().toString();

                int rbSelected = kelamin.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(rbSelected);
                id[4] = radioButton.getText().toString();
                intent.putExtra("data", id);
                startActivity(intent);
            }
        });
    }
}
