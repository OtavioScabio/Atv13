package com.example.atv13;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

//Otavio Gabriel Ribeiro Scabio - RA 1110482223043

public class MainActivity extends AppCompatActivity {

    private List<Exemplar> exemplares;
    private List<Aluno> alunos;
    private EditText edtNomeExemplar, edtCodigoExemplar, edtTipoExemplar, edtAlunoNome, edtAlunoRa, edtAlunoEmail;
    private Button btnAddExemplar, btnAddAluno, btnViewExemplares, btnViewAlunos;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exemplares = new ArrayList<>();
        alunos = new ArrayList<>();

        edtNomeExemplar = findViewById(R.id.edtNomeExemplar);
        edtCodigoExemplar = findViewById(R.id.edtCodigoExemplar);
        edtTipoExemplar = findViewById(R.id.edtTipoExemplar);
        edtAlunoNome = findViewById(R.id.edtAlunoNome);
        edtAlunoRa = findViewById(R.id.edtAlunoRa);
        edtAlunoEmail = findViewById(R.id.edtAlunoEmail);

        btnAddExemplar = findViewById(R.id.btnAddExemplar);
        btnAddAluno = findViewById(R.id.btnAddAluno);
        btnViewExemplares = findViewById(R.id.btnViewExemplares);
        btnViewAlunos = findViewById(R.id.btnViewAlunos);

        listView = findViewById(R.id.listView);

        btnAddExemplar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edtNomeExemplar.getText().toString();
                int codigo = Integer.parseInt(edtCodigoExemplar.getText().toString());
                String tipo = edtTipoExemplar.getText().toString();
                if (tipo.equalsIgnoreCase("Livro")) {
                    exemplares.add(new Livro(codigo, nome, "ISBN-12345", 1));
                } else if (tipo.equalsIgnoreCase("Revista")) {
                    exemplares.add(new Revista(codigo, nome, "ISSN-54321", 2));
                }
                edtNomeExemplar.setText("");
                edtCodigoExemplar.setText("");
                edtTipoExemplar.setText("");
            }
        });

        btnAddAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edtAlunoNome.getText().toString();
                String ra = edtAlunoRa.getText().toString();
                String email = edtAlunoEmail.getText().toString();
                alunos.add(new Aluno(ra, nome, email));
                edtAlunoNome.setText("");
                edtAlunoRa.setText("");
                edtAlunoEmail.setText("");
            }
        });

        btnViewExemplares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayAdapter<Exemplar> adapter = new ArrayAdapter<>(MainActivity.this,
                        android.R.layout.simple_list_item_1, exemplares);
                listView.setAdapter(adapter);
            }
        });

        btnViewAlunos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayAdapter<Aluno> adapter = new ArrayAdapter<>(MainActivity.this,
                        android.R.layout.simple_list_item_1, alunos);
                listView.setAdapter(adapter);
            }
        });
    }
}
