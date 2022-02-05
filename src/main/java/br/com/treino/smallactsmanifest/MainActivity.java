package br.com.treino.smallactsmanifest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void geraValor(View view){

        String[] valores = {
                "Trust - which must be respected and never put at risk\n ------------------------- \n" +
                        "Confiança - que deve ser respeitada e nunca colocada em risco",
                "Dialog - is the way to establish a truly trustful relationship\n ------------------------- \n" +
                        "Diálogo - é o caminho para estabelecer uma relação de confiança",
                "Personal Contact - the richest experience, not matched by any media or technology\n ------------------------- \n" +
                        "Contato pessoal - a experiência mais rica, incomparável a nenhuma mídia ou tecnologia",
                "Transparency - the mean to maintain a sustainable community\n ------------------------- \n" +
                        "Transparência - o meio para manter uma comunidade sustentável",
                "Diversity - people have many interests, but if you need a label, label yourself as a human\n ------------------------- \n" +
                        "Diversidade - as pessoas têm muitos interesses, mas se você precisa de um rótulo, rotule-se como humano",
                "Self-organization - leaders come and go, but there should be no owners\n ------------------------- \n" +
                        "Auto-organização - líderes vêm e vão, mas não deve haver donos",
                "Example - that's how you teach, live and learn\n ------------------------- \n" +
                        "Exemplo - é assim que você ensina, vive e aprende",
                "Consistency - things take time, intensity is not always the answer\n ------------------------- \n" +
                        "Consistência - as coisas levam tempo, a intensidade nem sempre é a resposta",
                "Give, give, give! - you'll be impressed by how fast things will come back\n ------------------------- \n" +
                        "Dê, dê, dê! - você ficará impressionado com a rapidez com que as coisas voltarão",
                "Do it! - as simple as you can, just what is essential to pass it forward \n ------------------------- \n" +
                        "Faça! - o mais simples possível, apenas o essencial para passá-lo adiante",
        };

        int numeros = new Random().nextInt(10);



        TextView texto = findViewById(R.id.textResultado);

        texto.setText(valores[numeros]);
    }

}