package id.ac.lpkia.soal1intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Output extends AppCompatActivity {
    TextView nama, alamat, phone, email, kelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        nama = findViewById(R.id.nama);
        alamat = findViewById(R.id.alamat);
        phone = findViewById(R.id.telp);
        email = findViewById(R.id.email);
        kelamin = findViewById(R.id.kelamin);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String[] id = bundle.getStringArray("data");

        nama.setText(id[0]);
        alamat.setText(id[3]);
        phone.setText(id[1]);
        email.setText(id[2]);
        kelamin.setText(id[4]);
    }
}
