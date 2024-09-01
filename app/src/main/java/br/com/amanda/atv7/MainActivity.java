
//Atividde_Avaliativa

//Utilize o exemplo fornecido na imagem abaixo para analisar as variáveis declaradas e criar um
//exemplo completo mantendo a mesma estrutura que demonstre a aplicação do método
//setOnClickListener.  Em sua resposta, envie um Print Screen onde o nome do pacote seja visível,
//conforme o exemplo br.com.ademar.atividadeavaliativa. Substitua a palavra "ademar" pelo seu
//nome.

package br.com.amanda.atv7;

// Aqui é o pacote onde o código morakkkk


// Importando umas coisas que o Android precisa pra fazer a mágica acontecer.
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Criando umas variáveis pra ligar com os elementos da tela (os que você vê no app).
    EditText exemplo1, exemplo2; // Campos de texto onde a galera vai digitar algo.
    ProgressBar exemplo3; // A famosa barra de progresso, que mostra quando algo está carregando.
    Button exemplo4, exemplo5; // Dois botões que a gente vai usar pra fazer umas paradas.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Coisa padrão, chama o método do Android pra iniciar a tela.
        setContentView(R.layout.activity_main); // Diz pro Android qual layout (a telinha) ele deve mostrar.

        // Agora vamos conectar as variáveis aí em cima com os elementos que estão na tela.
        exemplo1 = findViewById(R.id.exemplo1); // Aqui a gente pega o campo de texto do XML e diz que exemplo1 é ele.
        exemplo2 = findViewById(R.id.exemplo2); // Mesmo esquema, só que pro segundo campo de texto.
        exemplo3 = findViewById(R.id.exemplo3); // Pegando a barra de progresso do layout e ligando com a variável.
        exemplo4 = findViewById(R.id.exemplo4); // Ligando o botão 1 do layout com a variável exemplo4.
        exemplo5 = findViewById(R.id.exemplo5); // Fazendo a mesma coisa pro botão 2.

        // Bora adicionar ação aos botões com o famoso setOnClickListener.
        exemplo4.setOnClickListener(v -> {
            // O que rola quando o cara clicar no botão 1.
            exemplo1.setText("Botão 1 clicado!"); // Exemplo: muda o texto do campo exemplo1 pra "Botão 1 clicado!".
        });

        exemplo5.setOnClickListener(v -> {
            // E aqui o que acontece quando clicar no botão 2.
            exemplo2.setText("Botão 2 clicado!"); // Muda o texto do campo exemplo2 pra "Botão 2 clicado!".
        });
    }
}
