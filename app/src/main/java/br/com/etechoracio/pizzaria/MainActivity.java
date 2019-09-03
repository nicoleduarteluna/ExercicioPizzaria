package br.com.etechoracio.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtChopp;
    EditText txtPizzas;
    EditText txtRecheio;
    EditText txtPessoas;
    TextView lblConsumoFinal;
    TextView lblServicoFinal;
    TextView lblTotalFinal;
    TextView lblValorPessoaFinal;

    public void onProcessar(View v) {

        if (txtChopp.getText().toString().isEmpty() || txtPessoas.getText().toString().isEmpty() ||
                txtPizzas.getText().toString().isEmpty() || txtRecheio.getText().toString().isEmpty()){
            Toast.makeText(this, "Espaço vazio, digite um número para rodar a aplicação!", Toast.LENGTH_LONG).show();
        }
        else {
        double chopp = Double.parseDouble(txtChopp.getText().toString());
        double pizza = Double.parseDouble(txtPizzas.getText().toString());
        double recheio = Double.parseDouble(txtRecheio.getText().toString());
        double pessoas = Double.parseDouble(txtPessoas.getText().toString());


        double consumo = (chopp*7.30) + (pizza*31.50) + (recheio*5.90);
        double servico = (consumo/100) * 10;
        double total = servico + consumo;
        double valorPessoa = total/pessoas;

        lblConsumoFinal.setText(String.valueOf(consumo));
        lblServicoFinal.setText(String.valueOf(servico));
        lblTotalFinal.setText(String.valueOf(total));
        lblValorPessoaFinal.setText(String.valueOf(valorPessoa));

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtChopp = findViewById(R.id.txtChopp);
        txtPizzas = findViewById(R.id.txtPizzas);
        txtRecheio = findViewById(R.id.txtRecheio);
        txtPessoas = findViewById(R.id.txtPessoas);
        lblConsumoFinal = findViewById(R.id.lblConsumoFinal);
        lblValorPessoaFinal = findViewById(R.id.lblValorPessoaFinal);
        lblServicoFinal = findViewById(R.id.lblServicoFinal);
        lblTotalFinal = findViewById(R.id.lblTotalFinal);
    }
}
